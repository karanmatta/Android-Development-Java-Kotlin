package com.narak.learnjava;

public class MyClassCodingExercise {
    public static String CodeRunner(int command){
        if (command==0){
            return "CodeRunner running North";
        }else if(command==1){
            return "CodeRunner running South";
        }else if(command==2){
            return "CodeRunner running West";
        }else if(command==3){
            return "CodeRunner running East";
        }else if(command>=4 || command<0){
            return "Confused in Running-Doesnot know where to go";
        }
        else {
            return "Unknown Command";
        }
    }
    public static void main(String[] args) {

        System.out.println(CodeRunner(8));
    }
}
