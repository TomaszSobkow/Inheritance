package com.inheritance.exercise3;

import javax.swing.*;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) { balance = initialBalance; }
    public BankAccount() { balance = 0; }

    public void deposit (double amount){ this.balance += amount;  }
    public void withDraw(double amount){
        if(balance >= amount){
            balance -= amount;
        }else {
            JOptionPane.showConfirmDialog(null,"Unofficient founds");
        }
    }

    public void transfer(double amountToTransfer, BankAccount targetAccount){

        this.withDraw(amountToTransfer); // source of amount to transfer "this2 means instance which call this method
        targetAccount.deposit(amountToTransfer); // target account
        System.out.println("The amount "+ amountToTransfer + " has been transferred to account " + targetAccount.getClass().toString().substring(targetAccount.getClass().toString().lastIndexOf('3')+2));
    }

    public double getBalance() { return balance;}
}
