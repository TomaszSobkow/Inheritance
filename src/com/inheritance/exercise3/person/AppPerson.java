package com.inheritance.exercise3.person;

import java.util.ArrayList;

public class AppPerson {

    public static void main(String[] args) {

    testFairlyPointlessClass();

        }

    public static void testFairlyPointlessClass(){
        FairlyPointlessClass fairly = new FairlyPointlessClass();
        MyClass myClass = new MyClass();

        fairly.printObject(myClass);
    }


    public static void testPersonClass(){
        ArrayList<Person> personsArray = new ArrayList<>();

        personsArray.add(new Person("Tomas",46));
        personsArray.add(new Person("Agnieszka", 37));
        personsArray.add(new Student("Marcin",31,2345));

        for(Person currentPerson: personsArray){
            currentPerson.printDetails();
    }
}
}
