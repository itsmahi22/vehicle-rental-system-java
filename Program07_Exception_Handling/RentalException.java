import java.util.InputMismatchException;
import java.util.Scanner;

public class RentalException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Vehicle Brand: ");
            String brand = sc.nextLine();

            System.out.print("Enter Number of Rental Days: ");
            int days = sc.nextInt();

            System.out.print("Enter Rent Per Day: ");
            double rentPerDay = sc.nextDouble();

            if (days <= 0 || rentPerDay <= 0) {
                throw new IllegalArgumentException(
                    "Days and rent must be greater than zero."
                );
            }

            double totalRent = days * rentPerDay;

            System.out.println("\n--- Rental Details ---");
            System.out.println("Vehicle Brand: " + brand);
            System.out.println("Rental Days: " + days);
            System.out.println("Rent Per Day: Rs. " + rentPerDay);
            System.out.println("Total Rent: Rs. " + totalRent);

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric values.");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            sc.close();
            System.out.println("Rental process completed.");
        }
    }
}
