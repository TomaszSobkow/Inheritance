package com.inheritance.exercise3;

public class SavingsAccount extends BankAccount{

    private double interestRate; // oprocentowanie

    public SavingsAccount(double rate){
        super();
        interestRate = rate;
    }

    public SavingsAccount(double rate, double initialBalance) {
        super(initialBalance);
        this.interestRate = rate; // interest (odsetki)
    }

        public void addInterest(){
        double interests = (super.getBalance() * interestRate) / 100;
        super.deposit(interests);
        }

//    public int compareTo(SavingsAccount other) {
//
//        int balanceStatus = super.compareTo(other);
//
//        if(balanceStatus != 0) return balanceStatus;
//        else {
//            return (int)(this.getInterestRate() - other.getInterestRate());
//        }
//    }

    @Override
    public String toString() {
        return  super.toString()+ " InterestRate = " + interestRate ;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
