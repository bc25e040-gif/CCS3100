
import java.util.Scanner;
//ZENG JINGWEN
public class TelecomBillCaculator {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double baseCharge = 40.0;
    double callRate = 0.15;
    double smsRate = 0.10;
    double dataRate = 0.05;

    System.out.print("Enter total minutes of calls: ");
    double callMinutes = input.nextDouble();

    System.out.print("Enter total number of SMS: ");
    int smsCount = input.nextInt();

    System.out.print("Enter total mobile data used (MB): ");
    double dataUsed = input.nextDouble();

    double totalBill = baseCharge + (callRate * callMinutes)
                       + (smsRate * smsCount)
                       + (dataRate * dataUsed);

    System.out.println("Your total monthly bill is: RM " + totalBill);
    input.close();
}
}
