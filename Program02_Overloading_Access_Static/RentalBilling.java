public class RentalBilling {
    private double rentPerDay;
    static int totalCalculations = 0;

    RentalBilling(double rent) {
        rentPerDay = rent;
    }

    double calculateRent(int days) {
        totalCalculations++;
        return rentPerDay * days;
    }

    double calculateRent(int days, double discount) {
        totalCalculations++;
        return (rentPerDay * days) - discount;
    }

    static void displayCalculations() {
        System.out.println("Total Calculations: " + totalCalculations);
    }

    public static void main(String[] args) {
        RentalBilling rental = new RentalBilling(1000);

        System.out.println("Rent for 3 days: Rs. "
                + rental.calculateRent(3));

        System.out.println("Rent for 3 days with discount: Rs. "
                + rental.calculateRent(3, 500));

        displayCalculations();
    }
}
