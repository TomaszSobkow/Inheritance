package com.inheritance.exercise3.studentandperson;

public class Student extends Person{

    private int studentID;

    public Student(String firstName, String surName, SimpleDate dateOfBirth, int studentID) {
        super(firstName, surName, dateOfBirth);
        this.studentID = studentID;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                "} " + super.toString();
    }

    public int getStudentID() { return studentID; }
    public void setStudentID(int studentID) { this.studentID = studentID; }
}
