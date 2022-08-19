package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program_70_2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.next();
        System.out.print("Gross Salary");
        employee.grossSalary = sc.nextDouble();
        System.out.print("TAX: ");
        employee.tax = sc.nextDouble();

        System.out.println();
        System.out.print("Employee: " + employee);
        System.out.println();
        System.out.print("Wich percentage to encreasre salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println();
        System.out.println("Update data: ");

        sc.close();
    }
}
