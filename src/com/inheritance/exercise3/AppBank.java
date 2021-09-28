package com.inheritance.exercise3;

import java.util.ArrayList;
import java.util.Collections;

public class AppBank {

    public static ArrayList<SavingsAccount> accounts = new ArrayList<>();

    public static void main(String[] args) {
     populateArray();

    }

    public static void addBalance(){
        for (BankAccount currentAccount: accounts){
            currentAccount.deposit(200);
        }
        System.out.println("\n********************************");

    }

    public static void populateArray(){
        accounts.add(new SavingsAccount(11,2000.2));
        accounts.add(new SavingsAccount(10,200.0));
        accounts.add(new SavingsAccount(4,300.12));
        accounts.add(new SavingsAccount(5,3000.45));
        accounts.add(new SavingsAccount(1,2000.78));
        accounts.add(new SavingsAccount(12,1100.909));

    }

    public static void printAllAccounts(){
        for (BankAccount currentAccount: accounts){
            System.out.print(currentAccount.getClass().toString().substring(currentAccount.getClass().toString().lastIndexOf('3')+2) +
                    "\tBALANCE "+ currentAccount.getBalance());

            if(currentAccount instanceof CheckingAccount){
                System.out.print(" Transaction Count "+ ((CheckingAccount)currentAccount).getTransactionCount());
            }
            System.out.println();
        }
    }

    public static void transfer(){

        SavingsAccount savingsAccount = new SavingsAccount(5,2000);
        CheckingAccount checkingAccount = new CheckingAccount(3000);
        System.out.println("Saving account balance "+ savingsAccount.getBalance());
        System.out.println("CheckingAccount account balance "+ checkingAccount.getBalance());

        checkingAccount.transfer(2000,savingsAccount);

        System.out.println("\nSaving account balance "+ savingsAccount.getBalance());
        System.out.println("CheckingAccount account balance "+ checkingAccount.getBalance());
    }


    public static void bankTest(){
        BankAccount bankAccount1 = new BankAccount(1000);
        BankAccount bankAccount2 = new SavingsAccount(5.0, 1000);

        bankAccount1.deposit(2000);
        bankAccount1 = new CheckingAccount(400);

        bankAccount1.deposit(334.50);
    }
}
