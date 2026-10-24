class Vehicle {
    String brand;
    double rentPerDay;

    Vehicle(String brand, double rentPerDay) {
        this.brand = brand;
        this.rentPerDay = rentPerDay;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Rent Per Day: Rs. " + rentPerDay);
    }
}

class MotorVehicle extends Vehicle {
    String fuelType;

    MotorVehicle(String brand, double rentPerDay, String fuelType) {
        super(brand, rentPerDay);
        this.fuelType = fuelType;
    }

    void displayFuelType() {
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends MotorVehicle {
    int seats;

    Car(String brand, double rentPerDay, String fuelType, int seats) {
        super(brand, rentPerDay, fuelType);
        this.seats = seats;
    }

    void displayCarDetails() {
        displayDetails();
        displayFuelType();
        System.out.println("Seats: " + seats);
    }
}

class Bike extends Vehicle {
    int engineCC;

    Bike(String brand, double rentPerDay, int engineCC) {
        super(brand, rentPerDay);
        this.engineCC = engineCC;
    }

    void displayBikeDetails() {
        displayDetails();
        System.out.println("Engine Capacity: " + engineCC + " cc");
    }
}

public class VehicleInheritance {
    public static void main(String[] args) {
        Car car = new Car("Hyundai", 2000, "Petrol", 5);
        Bike bike = new Bike("Honda", 800, 150);

        System.out.println("--- Car Details ---");
        car.displayCarDetails();

        System.out.println("\n--- Bike Details ---");
        bike.displayBikeDetails();
    }
}
