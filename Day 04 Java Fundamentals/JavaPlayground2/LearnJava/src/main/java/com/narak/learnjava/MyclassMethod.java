package com.narak.learnjava;

public class MyclassMethod {


    public static void main(String[] args) {

        showName();//Calling Method
        printTable(3);
        showMyName("karan",23,2022);
        addNumbers(20,30);
        System.out.println( addNumbers1(2,3));
        System.out.println(fullName1("Karan","Matta"));//Return mai sirf value return kr rha h usko dekhne ke lie hume usko print bhi kraana hi pdega

        }

    public static void showName(){
        System.out.println("From Show name");
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
    }
    public static void printTable(int n){
        for (int i=1;i<=10;i++){
            System.out.println("The table of "+ n +"is:" +(n*i));
        }

    }
    public static void showMyName(String name,int age,int year){
        System.out.println("Name is:"+name+" "+"Age is :"+age+" "+"Year is: "+year);

    }

    public static void addNumbers(int a,int b){
        int sum =a+b;
        System.out.println("Sum is:" +sum);
    }
//Return Type of Method int t
public static int addNumbers1(int c,int d){

    //System.out.println("Sum is:" +sum);
    int result=c+d;
return result;
    }
    public static String fullName1(String firstname, String lastname){
        return firstname+" "+lastname;
    }

}
