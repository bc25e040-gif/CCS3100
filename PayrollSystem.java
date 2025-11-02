
import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input section
        System.out.print("Enter basic salary: ");
        double basicSalary = input.nextDouble();

        System.out.print("Enter allowance: ");
        double allowance = input.nextDouble();

        System.out.print("Enter deduction: ");
        double deduction = input.nextDouble();

        // Process section
        double grossSalary = basicSalary + allowance;
        double tax = 0.08 * grossSalary;
        double netSalary = grossSalary - tax - deduction;

        // Output section
        System.out.printf("Net salary: RM %.2f%n", netSalary);

        input.close();
    }
}
