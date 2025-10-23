import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // 

        System.out.print("Enter amount in MYR: ");
        double myr = input.nextDouble();  // 

        // 
        double rateUSD = 0.21;
        double rateEURO = 0.19;
        double rateYEN = 33.5;

        // 
        double usd = myr * rateUSD;
        double euro = myr * rateEURO;
        double yen = myr * rateYEN;

        // 
        System.out.println("\n=== Currency Conversion Result ===");
        System.out.println("MYR: " + myr);
        System.out.println("USD: " + usd);
        System.out.println("EURO: " + euro);
        System.out.println("YEN: " + yen);

        input.close(); // 
    }
}