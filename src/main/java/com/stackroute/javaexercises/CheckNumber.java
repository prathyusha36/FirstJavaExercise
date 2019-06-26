package com.stackroute.javaexercises;

public class CheckNumber {

      public String checkGivenNumberIsEvenOrOdd(int input) {
        if (input % 2 != 0 && input >= 20 && input <= 30) {

            return "tom";
        } else if (input % 2 == 0 && input >= 20 && input <= 30) {
            return "jerry";
        } else {
            return "number is negative";

        }
    }
}
