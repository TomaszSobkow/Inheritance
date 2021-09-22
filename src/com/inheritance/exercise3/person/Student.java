package com.inheritance.exercise3.person;

public class Student extends Person{

    private int studentID;

    public Student(String name, int age, int studentID) {
        super(name, age);
        this.studentID = studentID;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("  ID: " + getStudentID());
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
}
