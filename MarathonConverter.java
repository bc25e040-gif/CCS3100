
public class MarathonConverter {
    public static void main(String[] args) {
        double marathonKm = 42.195;
        double miles = marathonKm / 1.609;

        System.out.println("=== Marathon Distance Conversion ===");
        System.out.println("Marathon distance in kilometers: " + marathonKm + " km");
        System.out.println("Marathon distance in miles: " + miles + " miles");
    }
}
