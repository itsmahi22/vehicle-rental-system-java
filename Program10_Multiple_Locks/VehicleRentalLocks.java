class VehicleRental {
    private int availableVehicles = 10;
    private double rentalBalance = 5000;

    private final Object vehicleLock = new Object();
    private final Object paymentLock = new Object();

    public void rentVehicle(String name, int vehicles, double fee) {
        synchronized (vehicleLock) {
            synchronized (paymentLock) {
                System.out.println(name + " is renting vehicles.");

                if (availableVehicles >= vehicles
                        && vehicles > 0 && fee > 0) {
                    availableVehicles -= vehicles;
                    rentalBalance += fee;

                    System.out.println("Rental successful!");
                    System.out.println("Customer Name: " + name);
                    System.out.println("Vehicles Rented: " + vehicles);
                    System.out.println("Rental Fee: Rs." + fee);
                } else {
                    System.out.println("Rental failed for " + name);
                    System.out.println(
                            "Insufficient vehicles or invalid fee.");
                }

                System.out.println();
            }
        }
    }

    public void displayDetails() {
        synchronized (vehicleLock) {
            synchronized (paymentLock) {
                System.out.println("----- Vehicle Rental Details -----");
                System.out.println("Available Vehicles: " + availableVehicles);
                System.out.println("Total Rental Balance: Rs."
                        + rentalBalance);
            }
        }
    }
}

class RentalRegistrationThread extends Thread {
    private VehicleRental rental;
    private String customerName;
    private int vehicles;
    private double fee;

    public RentalRegistrationThread(VehicleRental rental,
                                    String customerName,
                                    int vehicles, double fee) {
        this.rental = rental;
        this.customerName = customerName;
        this.vehicles = vehicles;
        this.fee = fee;
    }

    public void run() {
        rental.rentVehicle(customerName, vehicles, fee);
    }
}

public class VehicleRentalLocks {
    public static void main(String[] args) {
        VehicleRental rental = new VehicleRental();

        RentalRegistrationThread t1 =
                new RentalRegistrationThread(rental, "Arun", 1, 1000);
        RentalRegistrationThread t2 =
                new RentalRegistrationThread(rental, "Kumar", 2, 2000);
        RentalRegistrationThread t3 =
                new RentalRegistrationThread(rental, "Rahul", 1, 1500);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread execution interrupted.");
            return;
        }

        rental.displayDetails();
    }
}
