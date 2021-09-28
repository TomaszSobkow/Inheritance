package com.interfaces.stringcomparator;

public class StringComparableDemo1 {

    public static void main(String[] args)
    {
        String s1 = "abc";
        String s2 = "Abc";

        int compareResult = s1.compareTo(s2);
        System.out.println("compareResult " + compareResult);
        if(compareResult == 0)
        {
            System.out.println("Strings are equal ->"  );
        }
        else if(compareResult > 0)
        {
            System.out.println("s1 is greater than s2");
        }
        else if(compareResult < 0)
        {
            System.out.println("s1 is less than s2");
        }
    }

}
