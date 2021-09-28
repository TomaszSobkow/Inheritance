package com.interfaces.mycomparator;

import com.interfaces.mycomparator.comparatorinterfaces.MyComparator;

public class PersonFirstNameComparator implements MyComparator {

    //this function compare two <Person> object's names through the compareTo method from the String class!
    @Override
    public int compare(Person lhs, Person rhs) {
        return lhs.getFirstname().compareTo(rhs.getFirstname());
    }
}
