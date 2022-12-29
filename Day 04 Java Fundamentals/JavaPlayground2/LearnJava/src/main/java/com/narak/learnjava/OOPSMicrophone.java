package com.narak.learnjava;

 class Myclass {
     ///Instannce Variables/Properties/Fields
     String name;
     String color;
     int model;
     //This is a Constructor
     // public Myclass() {
     //
     // {


     public Myclass(String name, String color, int model) {
         this.name = name;
         this.color = color;
         this.model = model;
     }

     //Actions Method
    public void turnoff(){
        System.out.println(this.name + "Tuen off");
    }
}
public class OOPSMicrophone{
    public static void main(String[] args) {
        Myclass m1 = new Myclass("j","red",00);//Instantiating/ Creating objects
//        m1.name="Mic1";
//        m1.model=123;

       // Myclass m2 = new Myclass();
//        m2.name="Mic2";
//        m2.model=1345;

        System.out.println(m1.name);

        m1.turnoff();


    }
}
