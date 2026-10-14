import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter your product name: ");
        String name = sc.nextLine();
        System.out.print("Enter your product price: ");
        double price = sc.nextDouble();

        Product product = new Product(name, price);

        product.setName("Computador");
        product.getName();

        product.setPrice(45.00);
        product.getPrice();

        product.getQuantity();

        System.out.println("Product data: " + product);
        System.out.print("Enter the number of products to be added: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println("Updated data: " + product);

        System.out.print("Enter the number of products to be removed: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("Updated data: " + product);

        sc.close();
    }
}