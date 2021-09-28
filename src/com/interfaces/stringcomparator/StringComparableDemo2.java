package com.interfaces.stringcomparator;

import java.util.ArrayList;
import java.util.Collections;

public class StringComparableDemo2 {

    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();

        list.add("fff");
        list.add("ddd");
        list.add("aaa");
        list.add("eee");
        //Print list
        System.out.println("List: " + list);

        Collections.sort(list);
        //Print list
        System.out.println("List: " + list);


    }


}
