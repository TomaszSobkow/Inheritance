package com.interfaces.comparator;

import com.inheritance.exercise3.SavingsAccount;

import java.util.Comparator;

public class RateComparator implements Comparator<SavingsAccount> {

    @Override
    public int compare(SavingsAccount s1, SavingsAccount s2) {
        return (int)(s1.getInterestRate() - s2.getInterestRate());
    }


}
