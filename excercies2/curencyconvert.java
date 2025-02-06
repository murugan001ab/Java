
import java.util.Scanner;
public class curencyconvert{

    // Currency names and their rates relative to USD
    static String[] currencies = {"USD", "EUR", "JPY"};
    static double[] ratesToUSD = {1.0, 0.85, 148.0};  // USD, EUR, JPY

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            // Display Menu
            System.out.println("\n--- Currency Converter ---");
            System.out.println("1. Convert Using Predefined Rates");
            System.out.println("2. Convert Using Custom Rate");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1-3): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    convertUsingPredefinedRates(sc);
                    break;
                case 2:
                    convertUsingCustomRate(sc);
                    break;
                case 3:
                    System.out.println("Thank you for using the Currency Converter!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select between 1 and 3.");
            }
        } while (choice != 3);

        sc.close();
    }

    // Method for converting using predefined rates
    public static void convertUsingPredefinedRates(Scanner sc) {
        displayCurrencies();
        System.out.print("Select source currency (1-3): ");
        int source = sc.nextInt() - 1;

        System.out.print("Select target currency (1-3): ");
        int target = sc.nextInt() - 1;

        System.out.print("Enter the amount: ");
        double amount = sc.nextDouble();

        double convertedAmount = convert(amount, source, target);
        System.out.printf("%.2f %s = %.2f %s%n", amount, currencies[source], convertedAmount, currencies[target]);
    }

    // Method for converting using a custom rate
    public static void convertUsingCustomRate(Scanner sc) {
        System.out.print("Enter the amount: ");
        double amount = sc.nextDouble();

        System.out.print("Enter the custom exchange rate: ");
        double customRate = sc.nextDouble();

        double convertedAmount = convert(amount, customRate);
        System.out.printf("Converted Amount: %.2f%n", convertedAmount);
    }

    // Display available currencies
    public static void displayCurrencies() {
        System.out.println("Available Currencies:");
        for (int i = 0; i < currencies.length; i++) {
            System.out.println((i + 1) + ". " + currencies[i]);
        }
    }

    // Method 1: Convert using predefined rates (method overloading)
    public static double convert(double amount, int sourceIndex, int targetIndex) {
        return (amount / ratesToUSD[sourceIndex]) * ratesToUSD[targetIndex];
    }

    // Method 2 (Overloaded): Convert using a custom exchange rate
    public static double convert(double amount, double customRate) {
        return amount * customRate;
    }
}



