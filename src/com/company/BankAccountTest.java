package com.company;
import java.util.Scanner;
public class BankAccountTest {

    public static void main(String[] args){

        BankAccount acc1 = new BankAccount("Kagoma Flora", "12345678", 100000);
        BankAccount acc2 = new BankAccount("Athanasio Kagoma", "134265777", 55000);

        // display initial balances of each object
        System.out.printf("%s balance: %.2f%n", acc1.getAccName(), acc1.getBalance());
        System.out.printf("%s balance: %.2f%n", acc2.getAccName(), acc2.getBalance());

        // creating a new Scanner object to accept input from console
        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for acc1: ");
        double depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nadding %.2f to acc1 balance%n%n", depositAmount);
        acc1.deposit(depositAmount);

        // display current balances of each object
        System.out.printf("%s balance: %.2f%n", acc1.getAccName(), acc1.getBalance());
        System.out.printf("%s balance: %.2f%n", acc2.getAccName(), acc2.getBalance());

        System.out.print("Enter deposit amount for acc2: ");
        depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nadding %.2f to acc2 balance%n%n", depositAmount);
        acc2.deposit(depositAmount);

        // display current balances of each object
        System.out.printf("%s account balance: %.2f%n", acc1.getAccName(), acc1.getBalance());
        System.out.printf("%s account balance: %.2f%n", acc2.getAccName(), acc2.getBalance());

        // withdraw amounts from the two accounts
        System.out.print("Enter withdraw amount for acc1: ");
        double withdrawAmount = input.nextDouble();
        System.out.printf("%nwithdrawing %.2f from acc1%n%n", withdrawAmount);
        acc1.withdraw(withdrawAmount);

        // display current balances of each object
        System.out.printf("%s balance: %.2f%n", acc1.getAccName(), acc1.getBalance());
        System.out.printf("%s balance: %.2f%n", acc2.getAccName(), acc2.getBalance());

        System.out.print("Enter withdraw amount for acc2: ");
        withdrawAmount = input.nextDouble();
        System.out.printf("%nwithdrawing %.2f from acc2%n%n", withdrawAmount);
        acc2.withdraw(withdrawAmount);

        // display current balances of each object
        System.out.printf("%s balance: %.2f%n", acc1.getAccName(), acc1.getBalance());
        System.out.printf("%s balance: %.2f%n", acc2.getAccName(), acc2.getBalance());

    }
}
