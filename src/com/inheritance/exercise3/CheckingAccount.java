package com.inheritance.exercise3;

public class CheckingAccount extends BankAccount{

    private int transactionCount;

    private static final int FREE_TRANSACTIONS = 3;
    private static final double TRANSACTION_FEE = 2.0;

    public CheckingAccount(double initialBalance){
        super(initialBalance);
        transactionCount = 0;
    }




    @Override
    public void deposit(double amount) {
        transactionCount++;
        super.deposit(amount);
    }

    @Override
    public void withDraw(double amount) {
        transactionCount++;
        super.withDraw(amount);
    }

    public void deductFees(){

    }

    public int getTransactionCount() {
        return transactionCount;
    }

    public void setTransactionCount(int transactionCount) {
        this.transactionCount = transactionCount;
    }


}
