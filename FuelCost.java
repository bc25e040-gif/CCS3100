
public class FuelCost {
    public static void main(String[] args) {
        double distance = 350;
        double fuelPer100km = 6.5;
        double pricePerLitre = 2.10;

        double fuelUsed = distance * fuelPer100km / 100;
        double totalCost = fuelUsed * pricePerLitre;

        System.out.println("=== Trip Fuel Cost Calculation ===");
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fuel consumption rate: " + fuelPer100km + " L/100km");
        System.out.println("Fuel price per litre: RM" + pricePerLitre);
        System.out.println("Total fuel used: " + fuelUsed + " litres");
        System.out.println("Total cost: RM" + totalCost);
    }
}
