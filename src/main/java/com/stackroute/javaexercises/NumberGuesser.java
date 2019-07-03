package com.stackroute.javaexercises;
/*
guess the number
 */

public class NumberGuesser {

    public String guessTheTargetNumber(int inputNumber, int guessNumber) {
        if(inputNumber<0)
        {
            return("please enter positive number");
        }
        if (inputNumber < guessNumber) {
            return ("Number guessed is less than original number");

        } else if (inputNumber > guessNumber) {
            return ("Number guessed is more than original number");
        } else {
            return "Number guessed matches original number";
        }

    }
}

