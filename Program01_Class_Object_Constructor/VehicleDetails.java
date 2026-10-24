class Vehicle {
    String vehicleNumber;
    String brand;
    double rentPerDay;

    Vehicle(String number, String brand, double rent) {
        vehicleNumber = number;
        this.brand = brand;
        rentPerDay = rent;
    }

    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Rent Per Day: Rs. " + rentPerDay);
        System.out.println();
    }
}

public class VehicleDetails {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("TN37AB1234", "Honda", 800);
        Vehicle v2 = new Vehicle("TN38CD5678", "Hyundai", 2000);

        v1.displayDetails();
        v2.displayDetails();
    }
}
