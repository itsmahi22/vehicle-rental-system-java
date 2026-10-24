import java.util.Scanner;
import vehiclerental.Vehicle;

public class RentalApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Vehicle Brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter Rent Per Day: ");
        double rent = sc.nextDouble();

        System.out.print("Enter Rental Days: ");
        int days = sc.nextInt();

        Vehicle v = new Vehicle(brand, rent);

        System.out.println("\n--- Rental Details ---");
        v.displayDetails();
        System.out.println("Rental Days: " + days);
        System.out.println("Total Rent: Rs. " + v.calculateRent(days));

        sc.close();
    }
}
