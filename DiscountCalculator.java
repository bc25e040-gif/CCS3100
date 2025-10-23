public class DiscountCalculator {
    public static void main(String[] args) {
        double price = 350;
        double discountRate = 0.10;
        double discount = price * discountRate;
        double finalPrice = price - discount;

        System.out.println("Original price: RM" + price);
        System.out.println("Discount: RM" + discount);
        System.out.println("Final price after discount: RM" + finalPrice);
    }
}