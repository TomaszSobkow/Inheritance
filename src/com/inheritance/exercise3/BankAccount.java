package com.inheritance.exercise3;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public BankAccount() {
        balance = 0;
    }

    public void deposit (double amount){
        this.balance += amount;
    }
    
    public void withDraw(double amount){

    }

    public double getBalance() { return balance;}
    public void setBalance(double balance) { this.balance = balance; }
}
