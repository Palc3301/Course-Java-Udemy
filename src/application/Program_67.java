package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program_67 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //declarar variavel
        //Product product = new Product();

        System.out.println("Enter the product data");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        product.setName("Computer");
        System.out.println("Update name " + product.getName());
        product.setPrice(1200.00);
        System.out.println("Update price" + product.getPrice());

        System.out.println();
        System.out.println("Product data: " + product.toString());

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Update data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProduct(quantity);
        System.out.println(product);

        sc.close();
    }
}
