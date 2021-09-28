package com.interfaces.mycomparator;

import com.interfaces.mycomparator.comparatorinterfaces.MyComparator;

import java.util.ArrayList;

public class AppMyComparator {


    public static void main(String[] args) {

        ArrayList<Person> personsArray = new ArrayList<>();

       personsArray.add(new Person(46,"Tomasz","Sobkow"));
       personsArray.add(new Person(39,"Agnieszka","Sobkow"));
       personsArray.add(new Person(55,"Krzysztof","Makarowski"));
       personsArray.add(new Person(48, "Karol","Zysko"));

        printList("Original List", personsArray);
        MyCollection.sort(personsArray);
        printList("\nSorted List ordering age", personsArray);

        MyComparator helpObject = new PersonFirstNameComparator();
        MyCollection.sort(personsArray,helpObject);
        printList("\nSorted list ordering FirstName",personsArray);




    }

    public static void printList(String message, ArrayList<Person> personList){
        System.out.println(message);
        for(Person actualPerson : personList){
            System.out.println(actualPerson);
        }
    }
}
