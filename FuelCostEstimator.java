
import java.util.Scanner;

public class FuelCostEstimator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input section
        System.out.print("Enter total distance (km): ");
        double totalDistance = input.nextDouble();

        System.out.print("Enter fuel efficiency (km per litre): ");
        double fuelEfficiency = input.nextDouble();

        System.out.print("Enter price of petrol (RM per litre): ");
        double pricePerLitre = input.nextDouble();

        // Process section
        double litresUsed = totalDistance / fuelEfficiency;
        double totalCost = litresUsed * pricePerLitre;

        // Output section
        System.out.printf("Total fuel cost for the trip: RM %.2f%n", totalCost);

        input.close();
    }
}