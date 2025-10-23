
public class CakeConverter {
    public static void main(String[] args) {
        double grams = 500;
        double kilograms = grams / 1000;
        double pounds = kilograms * 2.20462;

        System.out.println("Grams: " + grams);
        System.out.println("Kilograms: " + kilograms);
        System.out.println("Pounds: " + pounds);
    }
}