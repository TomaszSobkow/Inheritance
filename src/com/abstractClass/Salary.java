package com.abstractClass;

public class Salary extends Employee implements Comparable<Salary>{

    private double salary;

    public Salary(String name, String address, int number, double salary){
        super(name, address, number);
        setSalary(salary);
    }

    @Override
    public String toString() {
        return  super.toString()+ " "+ getSalary();
    }

    @Override
    public void mailCheck() //this is overriding and should have @Override ideally
    {
        System.out.println("Within mailCheck of Salary class ");
        System.out.println("Mailing check to " + this.getName()
                + " with salary " + this.salary);
    }
    public double computePay()
    {
        System.out.println("Computing salary pay for " + this.getName());
        return this.salary/52;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Salary o) {
        return (int)(this.getSalary() - o.getSalary());
    }
}
