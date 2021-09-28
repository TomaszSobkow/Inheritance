package com.interfaces.comparator;

import com.inheritance.exercise3.SavingsAccount;
import java.util.Comparator;

public class BalanceComparator implements Comparator<SavingsAccount> {

    @Override
    public int compare(SavingsAccount a1, SavingsAccount a2) {
        return (int)(a1.getBalance() - a2.getBalance()) ;
    }




}
