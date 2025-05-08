package LoopsCond;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int val;
            do{
                System.out.println("Write 10");
                val = s.nextInt();
            } while(val!=10);
        }
        System.out.println("You have written 10");





//        while (val != 10){
//            if (val >= 10){
//                System.out.println(val);
//                val -= 1;
//            } else if (val <= 10){
//                System.out.println(val);
//                val += 1;
//            } else{
//                System.out.println("Error");
//                break;
//            }
//
//        }
    }
}
