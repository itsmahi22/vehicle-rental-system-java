class VehicleRental {
    int availableVehicles = 2;

    synchronized void rentVehicle(String name, int vehicles) {
        System.out.println(name + " wants to rent "
                + vehicles + " vehicle(s).");

        while (availableVehicles < vehicles) {
            System.out.println(name
                    + " is waiting for available vehicles...");

            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Rental interrupted.");
                return;
            }
        }

        availableVehicles -= vehicles;

        System.out.println(name + " rented "
                + vehicles + " vehicle(s).");
        System.out.println("Available Vehicles: " + availableVehicles);
    }

    synchronized void returnVehicle(String name, int vehicles) {
        availableVehicles += vehicles;

        System.out.println(name + " returned "
                + vehicles + " vehicle(s).");
        System.out.println("Available Vehicles: " + availableVehicles);

        notifyAll();
    }
}

class RentalThread extends Thread {
    VehicleRental rental;
    String name;
    int vehicles;

    RentalThread(VehicleRental rental, String name, int vehicles) {
        this.rental = rental;
        this.name = name;
        this.vehicles = vehicles;
    }

    public void run() {
        rental.rentVehicle(name, vehicles);
    }
}

class ReturnVehicleThread extends Thread {
    VehicleRental rental;
    String name;
    int vehicles;

    ReturnVehicleThread(VehicleRental rental, String name, int vehicles) {
        this.rental = rental;
        this.name = name;
        this.vehicles = vehicles;
    }

    public void run() {
        rental.returnVehicle(name, vehicles);
    }
}

public class VehicleRentalThreads {
    public static void main(String[] args) {
        VehicleRental rental = new VehicleRental();

        RentalThread t1 = new RentalThread(rental, "Customer 1", 2);
        RentalThread t2 = new RentalThread(rental, "Customer 2", 1);
        ReturnVehicleThread t3 =
                new ReturnVehicleThread(rental, "Customer 1", 1);

        t1.start();
        t2.start();
        t3.start();
    }
}
