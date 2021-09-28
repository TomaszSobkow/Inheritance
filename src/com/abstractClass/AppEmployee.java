package com.abstractClass;

import java.util.ArrayList;
import java.util.Collections;

public class AppEmployee {

    public static void main(String[] args) {
        ArrayList<Salary> employees = new ArrayList<>();

        employees.add(new Salary("Tomas Sobkow","Mallow", 11, 3600.00));
        employees.add(new Salary( "John Adams", "Boston, MA", 2, 2400.00));


        System.out.println(employees);

        Collections.sort(employees);

        System.out.println(employees);

        System.out.println("ArrayComparator "+employees.get(0).compareTo(employees.get(1)));


    }

}

