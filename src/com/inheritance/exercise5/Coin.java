package com.inheritance.exercise5;

import com.inheritance.exercise3.BankAccount;

public class Coin {

    private double value;
    private String name;


    public Coin(double v, String n) {
        value = v;
        name = n;
    }

    @Override
    public boolean equals(Object obj) {

        Coin temp;
        if( obj instanceof Coin ){
            temp = (Coin)obj; }
        else { return false; }

        return (this.value == temp.value) && (this.name.equals(temp.name));
    }

    public boolean equals(BankAccount bankAccount){
        return true;
    }

    public String toString() {
        return "[Name: " + name + ", Value: " + value + "]";
    }
}
