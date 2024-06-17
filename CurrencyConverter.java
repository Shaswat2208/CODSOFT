import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Currency Converter!");

        System.out.println("\nSelect your base currency:");
        System.out.println("1. USD - US Dollar");
        System.out.println("2. EUR - Euro");
        System.out.println("3. GBP - British Pound");
        System.out.print("Enter your choice: ");
        int baseCurrencyChoice = scanner.nextInt();

        System.out.println("\nSelect your target currency:");
        System.out.println("1. EUR - Euro");
        System.out.println("2. GBP - British Pound");
        System.out.println("3. JPY - Japanese Yen");
        System.out.print("Enter your choice: ");
        int targetCurrencyChoice = scanner.nextInt();

        double exchangeRateUSDToEUR = 0.82;
        double exchangeRateUSDToGBP = 0.72;
        double exchangeRateUSDToJPY = 109.98;

        double amountToConvert;
        String baseCurrencySymbol;
        String targetCurrencySymbol;

        switch (baseCurrencyChoice) {
            case 1:
                baseCurrencySymbol = "USD";
                break;
            case 2:
                baseCurrencySymbol = "EUR";
                break;
            case 3:
                baseCurrencySymbol = "GBP";
                break;
            default:
                baseCurrencySymbol = "";
        }

        switch (targetCurrencyChoice) {
            case 1:
                targetCurrencySymbol = "EUR";
                break;
            case 2:
                targetCurrencySymbol = "GBP";
                break;
            case 3:
                targetCurrencySymbol = "JPY";
                break;
            default:
                targetCurrencySymbol = "";
        }

        System.out.print("\nEnter the amount you want to convert from " + baseCurrencySymbol + " to " + targetCurrencySymbol + ": ");
        amountToConvert = scanner.nextDouble();

        double convertedAmount;
        switch (targetCurrencyChoice) {
            case 1:
                convertedAmount = amountToConvert * exchangeRateUSDToEUR;
                break;
            case 2:
                convertedAmount = amountToConvert * exchangeRateUSDToGBP;
                break;
            case 3:
                convertedAmount = amountToConvert * exchangeRateUSDToJPY;
                break;
            default:
                convertedAmount = 0;
        }

        System.out.println("\nConverting " + amountToConvert + " " + baseCurrencySymbol + " to " + targetCurrencySymbol + "...");
        System.out.printf("Converted amount: %.2f %s\n", convertedAmount, targetCurrencySymbol);

        scanner.close();
    }
}
