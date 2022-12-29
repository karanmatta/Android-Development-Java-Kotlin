package com.narak.learnjava;

public class MyClassOperators {
    public static void main(String[] args) {
        double a =54;
        double b =27;

        int sum= (int) (a+b);// This casting to int
        int diff= (int) (a-b);
        int multi= (int) (a*b);
        double div= a/b;
        double remainder=a%b;//Modulo% operator gives Remainder

        System.out.println("Sum is:" + sum);
        System.out.println("Difference is:"+diff);
        System.out.println("Multiplication is:"+multi);
        System.out.println("Division is:"+div);
        System.out.println("Remainder is:"+remainder);

    }


}
