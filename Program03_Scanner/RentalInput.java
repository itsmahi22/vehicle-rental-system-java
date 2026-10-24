import java.util.Scanner;

public class RentalInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Vehicle Number: ");
        String vehicleNumber = sc.nextLine();

        System.out.print("Enter Number of Rental Days: ");
        int days = sc.nextInt();

        System.out.print("Enter Rent Per Day: ");
        double rentPerDay = sc.nextDouble();

        double totalRent = days * rentPerDay;

        System.out.println("\n--- Rental Details ---");
        System.out.println("Customer Name: " + name);
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Rental Days: " + days);
        System.out.println("Rent Per Day: Rs. " + rentPerDay);
        System.out.println("Total Rent: Rs. " + totalRent);

        sc.close();
    }
}
