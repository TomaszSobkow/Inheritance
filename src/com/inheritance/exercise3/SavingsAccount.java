package com.inheritance.exercise3;

public class SavingsAccount extends BankAccount{

    private double interestRate; // oprocentowanie

    public SavingsAccount(double rate){
        super();
        interestRate = rate;
    }

    public SavingsAccount(double rate, double initialBalance) {
        super(initialBalance);
        this.interestRate = rate; // interest odsetki
    }

        public void addInterest(){
        double interests = (super.getBalance() * interestRate) / 100;

        super.deposit(interests);
        }
}
