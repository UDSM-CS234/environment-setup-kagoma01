package com.company;

public class BankAccount {
    private String accName;
    private String accNumber;
    private double balance;

    public BankAccount(String accName, String accNumber, double balance) {
        this.accName = accName;
        this.accNumber = accNumber;

        if(balance > 0.0) { // checks if the balance is valid
            this.balance = balance; // assigns it to the instance variable
        }
    }

    public void setAccName(String accName){
        this.accName = accName;
    }

    public void setAccNumber(String accNumber){
        this.accNumber = accNumber;
    }

    public void balance(double balance){
        this.balance = balance;
    }

    // method to deposit only valid amount in the account
    public void deposit(double depositAmount){
        if(depositAmount > 0.0) { //checking validity of the deposit amount
            balance = balance + depositAmount;
            System.out.println("DEPOSIT SUCCESSFUL!");
        }
    }

    // method to withdraw only valid amount of money from the account
    public void withdraw(double withdrawAmount){
        if(withdrawAmount < 0.0) {
            System.out.println("INVALID WITHDRAW AMOUNT");
        } else {
            if(withdrawAmount > balance) {
                System.out.println("INSUFFICIENT FUNDS!");
            } else {
                balance = balance - withdrawAmount;
                System.out.println("WITHDRAW SUCCESSFUL!");
            }
        }
    }

    public String getAccName(){
        return accName;
    }

    public String getAccNumber(){
        return accNumber;
    }

    public double getBalance(){
        return balance;
    }
}
