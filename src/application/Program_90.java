package application;

import entities.Product_90;

import java.util.Scanner;
import java.util.Locale;

public class Program_90 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product_90[] vect = new Product_90[3];

        for(int i=0; i< vect.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product_90(name, price);
        }
        double sum = 0.0;
        for(int i =0 ; i< vect.length; i++) {
            sum += vect[i].getPrice();
        }
        double avg = sum / n;
        System.out.printf("AVERAGE PRICE = %.2f%n", avg);

        sc.close();
    }
}
