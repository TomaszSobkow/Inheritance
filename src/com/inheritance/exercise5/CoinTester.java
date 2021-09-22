package com.inheritance.exercise5;

public class CoinTester {

    public static void main(String[] args) {
        Coin coin1 = new Coin(10,"Tenth");
        Coin coin2 = new Coin(20,"Twenty");
        Coin coin3 = new Coin(30,"Forty");

        System.out.println(coin1.equals(coin2));


    }
}
