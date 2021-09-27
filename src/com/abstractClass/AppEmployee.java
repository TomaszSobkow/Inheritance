package com.abstractClass;

public class AppEmployee {

    public static void main(String[] args) {

        Salary salary = new Salary("Tomas Sobkow","Mallow", 11, 3600.00);
        Employee employee = new Salary("John Adams", "Boston, MA", 2, 2400.00);


        System.out.println("Call mailCheck using Salary reference --");
        salary.mailCheck();

        System.out.println("\n Call mailCheck using Employee reference--");
        employee.mailCheck();
    }

}

