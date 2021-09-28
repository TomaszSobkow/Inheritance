package com.interfaces.comparator;

import com.inheritance.exercise3.AppBank;
import com.inheritance.exercise3.BankAccount;

import java.util.Collections;

public class ComparableTest {

    //it works with <BankAccount> exercise 3 in inheritance package

    public static void main(String[] args) {
        AppBank.populateArray();

        for(BankAccount b: AppBank.accounts){
            System.out.println(b);
        }
        System.out.println("*********Rete Comparator***********************");
        AppBank.accounts.sort(new RateComparator());

        for(BankAccount b: AppBank.accounts){
            System.out.println(b);
        }

        System.out.println("*********Balance Comparator***********************");
        Collections.sort(AppBank.accounts,new BalanceComparator());

        for(BankAccount b: AppBank.accounts){
            System.out.println(b);
        }
    }

}
