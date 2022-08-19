package application;

import entitie.enums.OrderStatus;
import entities.Client_140;
import entities.OrderItem;
import entities.Order_140;
import entities.Product_140;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program_140 {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY) ");
        Date birthdate = sdf.parse(sc.next());


        Client_140 client = new Client_140(name, email, birthdate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status  = OrderStatus.valueOf(sc.next());

        Order_140 order = new Order_140(new Date(),status, client);

        System.out.println("How many items to this order? ");
        int N = sc.nextInt();
        for (int i=0; i<N; i++) {
            System.out.println("Enter #" + (i+1) + " item data:");
            System.out.println("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.println("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.println("Quantity: ");
            int quantity = sc.nextInt();

            Product_140 product = new Product_140(productName, productPrice);

            OrderItem it = new OrderItem(quantity,productPrice, product);

            order.addItems(it);
        }

        System.out.println();
        System.out.println(order);

        sc.close();
    }
}
