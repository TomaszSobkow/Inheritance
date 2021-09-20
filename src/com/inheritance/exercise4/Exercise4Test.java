package com.inheritance.exercise4;

public class Exercise4Test {

    public static void main(String[] args) {

        Person person = new Person();
        Student student = new Student();
        Instructor instructor = new Instructor();

        person = student;



        System.out.println( person );
        System.out.println( student);
        System.out.println( instructor);
    }
}
