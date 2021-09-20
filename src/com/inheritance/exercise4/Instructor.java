package com.inheritance.exercise4;

public class Instructor extends Person{

    private double salary;

    public Instructor(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public Instructor() {
        this("unknown", 0,0.0);
    }

    @Override
    public String toString() {
        return "\t" +
                "\nInstructor "+ super.toString()+
                "\nSalary=" + salary +
                '}';
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
