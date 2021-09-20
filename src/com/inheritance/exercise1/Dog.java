package com.inheritance.exercise1;

public class Dog extends Animal{

    private String breed;
    private String color;

    public Dog(boolean isCarnivore, int numLegs, String breed, String color) {
        super(isCarnivore, numLegs);
        this.breed = breed;
        this.color = color;
    }

    public Dog() {
        super();
    }
}
