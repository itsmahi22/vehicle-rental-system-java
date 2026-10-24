abstract class Vehicle {
    String brand;
    double rentPerDay;

    Vehicle(String brand, double rentPerDay) {
        this.brand = brand;
        this.rentPerDay = rentPerDay;
    }

    abstract double calculateRent(int days);

    void displayDetails() {
        System.out.println("Vehicle Brand: " + brand);
        System.out.println("Rent Per Day: Rs. " + rentPerDay);
    }
}

interface Rentable {
    void bookVehicle();
}

class Car extends Vehicle implements Rentable {
    Car(String brand, double rentPerDay) {
        super(brand, rentPerDay);
    }

    @Override
    double calculateRent(int days) {
        return rentPerDay * days;
    }

    @Override
    public void bookVehicle() {
        System.out.println("Car booked successfully!");
    }
}

public class RentalAbstraction {
    public static void main(String[] args) {
        Car car = new Car("Hyundai", 2000);

        car.displayDetails();
        car.bookVehicle();

        int days = 3;
        System.out.println("Rental Days: " + days);
        System.out.println("Total Rent: Rs. "
                + car.calculateRent(days));
    }
}
