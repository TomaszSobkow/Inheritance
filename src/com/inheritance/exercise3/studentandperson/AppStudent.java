package com.inheritance.exercise3.studentandperson;

public class AppStudent {

    public static void main(String[] args) {

        Person p1 = new Person("Tomas", "Sobkow", new SimpleDate(4,8,1975));
        System.out.println(p1);

        SimpleDate s1 = new SimpleDate(29,4,1982);
        Student student1 = new Student("Aga", "Sobkow", s1,34567);
        System.out.println(student1);
    }

}
