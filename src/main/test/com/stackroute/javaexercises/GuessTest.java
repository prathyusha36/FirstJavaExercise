package com.stackroute.javaexercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class GuessTest {
    Guess guessNumber;
    String actualResult;
    String expectedResult;

    @org.junit.Before
    public void setUp() throws Exception {
        guessNumber = new Guess();
    }

    @Test
    public void checkWhetherTheNumberIsCorrect() {
        actualResult = guessNumber.guessTheTargetNumber(new int[]{10, 20, 30});
        expectedResult = "Number guessed matches the original number";
        assertEquals(expectedResult, actualResult);
    }

    @org.junit.After
    public void tearDown() throws Exception {
        guessNumber = null;
    }
}