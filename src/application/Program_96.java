package application;

import entities.Employee_96;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program_96 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registred? ");
        int n = sc.nextInt();

        List<Employee_96> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee_96 emp = new Employee_96(id, name, salary);
            list.add(emp);
            //list.add(new Employee_96(id,name,salary));
        }

        //Atualizando o salario para dar ao empregado

        System.out.print("Enter the employee id that will have salary increase : ");
        int idSalary = sc.nextInt();
        Integer pos = position(list, idSalary);
        if(pos == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            Double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }

        //Listando funcionario
        System.out.println();
        System.out.println("List of employees:");
        for (Employee_96 emp : list) {
            System.out.println(emp);
        }
        System.out.print("");

        sc.close();
    }

    //list não tem nada have com o list da parte de cima
    //Pegar posição do elemento na lista -> o ID
    public static Integer position(List<Employee_96> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}

