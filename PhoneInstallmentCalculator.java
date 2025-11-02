
import java.util.Scanner;

public class PhoneInstallmentCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input section
        System.out.print("Enter phone price (RM): ");
        double price = input.nextDouble();

        System.out.print("Enter down payment (RM): ");
        double downPayment = input.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double annualRate = input.nextDouble();

        System.out.print("Enter loan period (months): ");
        int months = input.nextInt();

        // Process section
        double loanAmount = price - downPayment;
        double monthlyRate = annualRate / 12 / 100;

        double monthlyPayment = (loanAmount * monthlyRate) /
                (1 - Math.pow(1 + monthlyRate, -months));

        // Output section
        System.out.printf("Monthly payment: RM %.2f%n", monthlyPayment);

        input.close();
    }
}