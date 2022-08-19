package application;

import entities.ImportedProduct_149;
import entities.Product_149;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program_149 {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy)");

        List<Product_149> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i=0; i< n; i++) {
            System.out.print("Product #" + (i+1) + " data:");
            System.out.println();
            System.out.print("Common, used or imported (c/u/i)? ");
            char cui = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (cui == 'c') {
                list.add(new Product_149(name, price));

            } else if (cui == 'u') {
                System.out.println("Manufacture date (DD/MM/YYYY) ");
                Date date = sdf.parse(sc.next());

            }
            else {
                System.out.println("Customs fee: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct_149(name, price, customsFee));

            }

        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product_149 prod : list) {
            System.out.println(prod.priceTag());
        }

        sc.close();
    }
}
