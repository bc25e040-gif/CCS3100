
import java.util.Scanner;

public class BodyFatCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input section
        System.out.print("Enter weight (kg): ");
        double weight = input.nextDouble();

        System.out.print("Enter height (m): ");
        double height = input.nextDouble();

        System.out.print("Enter age (years): ");
        int age = input.nextInt();

        // Process section
        double bmi = weight / (height * height);
        double bodyFat = (1.20 * bmi) + (0.23 * age) - 5.4;

        // Output section
        System.out.printf("Your BMI is: %.2f%n", bmi);
        System.out.printf("Your Body Fat Percentage is: %.2f%%%n", bodyFat);

        input.close();
    }
}