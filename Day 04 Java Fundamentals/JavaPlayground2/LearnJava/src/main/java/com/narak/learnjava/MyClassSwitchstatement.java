package com.narak.learnjava;

public class MyClassSwitchstatement {
    public static void main(String[] args) {
        int command =8;
        switch(command)// Better than else if for more conditions
         {
            case 0:
                System.out.println("CodeRunner running North");
                break;// Important with switch statemet
            case 1:
                System.out.println("CodeRunner running South");
                break;
            case 2:
                System.out.println("CodeRunner running east");
            break;
                default:
                System.out.println("Not running");
        }

    }
}
