import java.util.Scanner;

class OriginalPrice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double discountedPrice, discount, originalPrice;

        System.out.print("Enter discounted price: ");
        discountedPrice = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        discount = sc.nextDouble();

        originalPrice = discountedPrice / (1 - discount / 100);

        System.out.println("Original selling price = " + originalPrice);
    }
}
