package com.inheritance.exercise1;

public class Animal {

    private boolean isCarnivore;
    private int numLegs;

    public Animal(boolean isCarnivore, int numLegs) {
        isCarnivore = isCarnivore;
        numLegs = numLegs;
    }

    public Animal() {

        this.isCarnivore = false;
        this.numLegs = 4;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "isCarnivore=" + isCarnivore +
                ", numLegs=" + numLegs +
                '}';
    }
}
