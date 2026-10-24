class Vehicle {
    String brand;
    double rentPerDay;

    Vehicle(String brand, double rentPerDay) {
        this.brand = brand;
        this.rentPerDay = rentPerDay;
    }

    void displayRentalInfo() {
        System.out.println("Vehicle Brand: " + brand);
        System.out.println("Rent Per Day: Rs. " + rentPerDay);
    }
}

class Car extends Vehicle {
    int seats;

    Car(String brand, double rentPerDay, int seats) {
        super(brand, rentPerDay);
        this.seats = seats;
    }

    @Override
    void displayRentalInfo() {
        System.out.println("Vehicle Type: Car");
        System.out.println("Vehicle Brand: " + brand);
        System.out.println("Rent Per Day: Rs. " + rentPerDay);
        System.out.println("Number of Seats: " + seats);
    }
}

public class RentalDescription {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Honda", 800);
        Car car = new Car("Hyundai", 2000, 5);

        System.out.println("--- General Vehicle Details ---");
        vehicle.displayRentalInfo();

        System.out.println("\n--- Car Rental Details ---");
        car.displayRentalInfo();
    }
}
