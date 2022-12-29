package com.narak.learnjava;

public class MyClassChallaneg {
    //Todo: Create a Multiply(), dividenumbers()

    public static int Multiply(int first ,int second){
        return (first*second);
    }
    public static double divideNumber(double a, double b){
        double result=(a/b);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Multiply(5,9));
        System.out.println(divideNumber(5,9));
    }
}
