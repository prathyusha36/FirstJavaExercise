package com.stackroute.javaexercises;
import java.util.*;
public class Guess {

    public static String guessTheTargetNumber(int[] inputNumber) {
        Scanner scanner = new Scanner(System.in);;
        int originalNumber = 30;
        int i=0;
        int number;
        while(true) {
            number = inputNumber[i];
            if(i < inputNumber.length) {
                if (originalNumber > inputNumber[i]) {
                    System.out.println("Number guessed is less than original number");
                } else if (originalNumber < inputNumber[i]) {
                    System.out.println("Number guessed is more than original number");
                } else {
                    return "Number guessed matches the original number";
                }
                i++;
            }
            else {
                return "Number guessed is not correct";
            }
        }
    }
}
