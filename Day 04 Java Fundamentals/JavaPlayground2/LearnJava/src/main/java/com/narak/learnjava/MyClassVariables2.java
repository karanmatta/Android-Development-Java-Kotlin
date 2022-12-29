package com.narak.learnjava;

public class MyClassVariables2 {
    public static void main(String[] args) {
        String name="Karan";//String has no limit
        int age=23;
        int year=2022;
        //Int has size to hold 32 bits
        //Long can hold 64 bits
        //int year=22228298292929; Large Integer Number
        long longbignumber=2222232324243L;//L for long
        float celcius=32.9f;//f for Float
        double height=5.9;
        byte myByte=127;// It can only hold upto 127 i.e-128 to127
        short myshort=289;//16bits
        char leter='C';//Used for only one Character

        boolean istall;
        istall=false;


        System.out.println("My name is: "+name+"."+"My age is: "+age+".");
        System.out.println("Current year is: "+year);
        System.out.println(istall);


    }
}
/*How Java Works
* Java Source File
*Compiler(Check for errors,Syntax)
*Bytecode(Machine Instructions)
*Device(with JVM)
* */

/*Floating point
* Float= Decimal Numbers. holds 32 Bits
* Double=holds 64 bit decimal number more precisely.
 */

/*Numeric
* int:- A whole number holds 32 bits
*byte :-Holds 8bits
*short holds 8 bits
* long
*/

/*Boolean= true or false
*
* */

