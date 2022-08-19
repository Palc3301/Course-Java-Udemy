package application;

import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program_73 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CurrencyConverter currency = new CurrencyConverter();
        System.out.print("What is the dollar price? ");
        currency.precoDollar = sc.nextDouble();
        System.out.print("How many dollar will be bought? ");
        currency.qtdDollar = sc.nextDouble();
        System.out.println();
        System.out.printf("Amount to be paid in reais = %.2f%n ", currency.totalComIof());
    }
}
