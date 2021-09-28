package com.interfaces.mycomparator;

import com.interfaces.mycomparator.comparatorinterfaces.MyComparator;

import java.util.ArrayList;

public class MyCollection {

    public static void sort(ArrayList<Person> personListToSort){
        for (int index = 0; index < personListToSort.size(); index++){
            for(int i = 0; i < personListToSort.size() -1 -index; i++){
                if(personListToSort.get(i).compareTo(personListToSort.get( i+1 )) > 0){
                    Person temp = personListToSort.get(i);
                    personListToSort.set(i, personListToSort.get( i+1 ));
                    personListToSort.set( i+1 , temp);
                }
            }
        }
    }

    public static void sort(ArrayList<Person> personListToSort, MyComparator comparator){
        for (int index = 0; index < personListToSort.size(); index++){
            for(int innerIndex = 0; innerIndex < personListToSort.size() - 1 - index; innerIndex++){
                if(comparator.compare(personListToSort.get(innerIndex), personListToSort.get(innerIndex +1)) > 0){
                    Person tempPerson = personListToSort.get(innerIndex);
                    personListToSort.set( innerIndex, personListToSort.get(innerIndex + 1));
                    personListToSort.set( innerIndex+1, tempPerson );
                }
            }
        }
    }
}
