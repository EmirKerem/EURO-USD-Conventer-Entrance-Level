import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double conversionRateUSDToEUR = 0.85;
        double conversionRateEURToUSD = 1.18; 
        
        System.out.println("Welcome to the Currency Converter");

        System.out.println("Please enter the currency you have (USD or EUR):");
        String currencyType = scanner.nextLine();

        System.out.println("Please enter the amount of the selected currency:");
        double amount = scanner.nextDouble();

        if ("USD".equals (currencyType)) {
            System.out.println("Your amount in EUR is: " + (amount * conversionRateUSDToEUR));
        } 
        else if ("EUR".equals (currencyType)) {
            System.out.println("Your amount in USD is: " + (amount * conversionRateEURToUSD));
        } 
        else {
            System.out.println("Invalid currency type. Please enter 'USD' or 'EUR'.");
        }

    }
}

       
        
        
        
        
        