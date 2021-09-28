package com.interfaces.mycomparator;

import com.interfaces.mycomparator.comparatorinterfaces.MyComparable;

public class Person implements MyComparable {

    private String firstname;
    private String surname;
    private int age;
    public Person(int age,String firstname, String surname) {
        this.age = age;
        this.surname = surname;
        this.firstname = firstname;
    }


    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age, o.getAge());
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public String getFirstname() { return firstname; }
    public String getSurname() { return surname; }

    public int getAge() { return age; }
}
