package vehiclerental;

public class Vehicle {
    private String brand;
    private double rentPerDay;

    public Vehicle(String brand, double rentPerDay) {
        this.brand = brand;
        this.rentPerDay = rentPerDay;
    }

    public double calculateRent(int days) {
        return rentPerDay * days;
    }

    public void displayDetails() {
        System.out.println("Vehicle Brand: " + brand);
        System.out.println("Rent Per Day: Rs. " + rentPerDay);
    }
}
