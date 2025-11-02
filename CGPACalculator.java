import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter grade point for subject 1: ");
        double g1 = input.nextDouble();
        System.out.print("Enter credit hour for subject 1: ");
        int c1 = input.nextInt();

        System.out.print("Enter grade point for subject 2: ");
        double g2 = input.nextDouble();
        System.out.print("Enter credit hour for subject 2: ");
        int c2 = input.nextInt();

        System.out.print("Enter grade point for subject 3: ");
        double g3 = input.nextDouble();
        System.out.print("Enter credit hour for subject 3: ");
        int c3 = input.nextInt();

        System.out.print("Enter grade point for subject 4: ");
        double g4 = input.nextDouble();
        System.out.print("Enter credit hour for subject 4: ");
        int c4 = input.nextInt();

        double totalPoints = (g1*c1) + (g2*c2) + (g3*c3) + (g4*c4);
        int totalCredits = c1 + c2 + c3 + c4;
        double cgpa = totalPoints / totalCredits;

        System.out.println("Your CGPA is: " + cgpa);
    }
}
 
