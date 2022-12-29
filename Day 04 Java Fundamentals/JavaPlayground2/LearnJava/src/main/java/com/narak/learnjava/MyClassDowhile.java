package com.narak.learnjava;

public class MyClassDowhile {
    public static void main(String[] args) {
        int limit=10;
        int counter = 1;

        do{
            System.out.println(counter);
            counter++;
        }
        while(counter>limit);// Do while loop will run for at least 1 time even if the condition in while is false
    }

}
