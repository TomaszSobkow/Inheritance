package com.inheritance.exercise3;

import java.util.ArrayList;

public class AppBank {

    public static ArrayList<BankAccount> accounts = new ArrayList<>();

    public static void main(String[] args) {
        transfer();
//    AppBank.populateArray();
//    AppBank.printAllAccounts();
//    AppBank.addBalance();
//    AppBank.printAllAccounts();
    }

    public static void addBalance(){
        for (BankAccount currentAccount: accounts){
            currentAccount.deposit(200);
        }
        System.out.println("\n********************************");

    }

    public static void populateArray(){
        accounts.add(new BankAccount(100));
        accounts.add(new SavingsAccount(10,2000));
        accounts.add(new CheckingAccount(300));

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
