package mangila;

import java.util.Scanner;

public class Product {

    public void manageProduct() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        System.out.print("Enter Product Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Product Price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter Stock Quantity: ");
        int stocks = scanner.nextInt();
        System.out.print("Enter Quantity Sold: ");
        int sold = scanner.nextInt();

        Products product = new Products();
        product.setProductDetails(id, name, price, stocks, sold);
        product.viewProductDetails();
    }
}
