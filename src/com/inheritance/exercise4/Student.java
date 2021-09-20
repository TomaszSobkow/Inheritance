package com.inheritance.exercise4;

public class Student extends Person{

    private String degree;

    public Student(String name, int age, String degree) {
        super(name, age);
        this.degree = degree;
    }

    public Student() {
        this("unknown", 0,"unknown");
    }

    @Override
    public String toString() {
        return  "\tStudent " +super.toString()+
                "\nDegree='" + degree;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
