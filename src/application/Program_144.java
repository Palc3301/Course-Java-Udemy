package application;

import entities.Account_143;
import entities.BusinessAccount_143;
import entities.SavingsAccount_144;

public class Program_144 {

    public static void main(String[] args) {

        Account_143 acc = new Account_143(1001, "Alex", 0.0);
        BusinessAccount_143 bacc = new BusinessAccount_143(1002, "Maria" , 0.0, 500.0);

        // UPCASTING
        Account_143 acc1 = bacc;
        Account_143 acc2 = new BusinessAccount_143(1003, "bob", 0.0, 200.0);
        Account_143 acc3 = new SavingsAccount_144(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING

        BusinessAccount_143 acc4 = (BusinessAccount_143) acc2;
        acc4.loan(100.0);

        //BusinessAccount_143 acc5 = (BusinessAccount_143)acc3;
        if (acc3 instanceof BusinessAccount_143 ){
            BusinessAccount_143 acc5 = (BusinessAccount_143)acc3;
            acc5.loan(200.00);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount_144) {
            SavingsAccount_144 acc5 = (SavingsAccount_144) acc3;
            acc5.upDateBalance();
            System.out.println();
        }

    }
}
