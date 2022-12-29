package com.narak.learnjava;

public class SwitchstatementExercise {
    public static void main(String[] args) {
        String command= "deposit";
        int balance=1000;
        int amount=100;

        switch(command){
            case "withdraw":
                System.out.println("Your balance used to be 1000, and now it is " + (balance- amount));
            break;
                case "deposit":
                System.out.println("Your balance used to be 1000, and now it is " + (balance+ amount));

        }
//        case "Withdraw":
//        balance -= amount;  // balance = balance - amount;
//        break;
//        case "Deposit":
//        balance += amount; //balance = balance + amount;
//        break;
//        default:
//        System.out.println("Please choose a command");
//        break;
//    }
//        System.out.println("Your balance used to be 1000 and now is " + balance);
//
//
//
//}
//}
    }
}
