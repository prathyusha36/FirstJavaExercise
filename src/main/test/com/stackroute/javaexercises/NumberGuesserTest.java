package com.stackroute.javaexercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberGuesserTest {
    //@Mock
    NumberGuesser guessNumberMock;
    String actualResult;
    String expectedResult;


   @org.junit.Before
    public void setUp() throws Exception {
        guessNumberMock = new NumberGuesser();
    }

    @Test
    public void givenTheNumberTenShouldReturnLessThanMessage() {
       // when(guessNumberMock.guessTheTargetNumber(10,15).thenReturn("Number guessed is less than original number");
        actualResult = guessNumberMock.guessTheTargetNumber(10,15);
        expectedResult = "Number guessed is less than original number";
        assertEquals(expectedResult, actualResult);
       // verifyNoMoreInteractions();
    }
    @Test
    public void givenTheNumberTwentyShouldReturnGreaterThanMessage() {
        //when(guessNumberMock.guessTheTargetNumber(20,15).thenReturn("Number guessed is more than original number");
        actualResult = guessNumberMock.guessTheTargetNumber(20,15);
        expectedResult = "Number guessed is more than original number";
        assertEquals(expectedResult, actualResult);
        //verifyNoMoreInteractions();
    }
    @Test
    public void givenTheNumberFifteenShouldReturnEqualMessage() {
        //when(guessNumberMock.guessTheTargetNumber(15,15)).thenReturn("Number guessed matches original number");
        actualResult = guessNumberMock.guessTheTargetNumber(15,15);
        expectedResult = "Number guessed matches original number";
        assertEquals(expectedResult, actualResult);
       // verifyNoMoreInteractions();
    }
    @Test
    public void givenNegativeNumberShouldReturnErrorMessage() {
        //when(guessNumberMock.guessTheTargetNumber(15,15)).thenReturn("Number guessed matches original number");
        actualResult = guessNumberMock.guessTheTargetNumber(-15,15);
        expectedResult = "please enter positive number";
        assertEquals(expectedResult, actualResult);
        // verifyNoMoreInteractions();
    }



    @org.junit.After
    public void tearDown() throws Exception {
        guessNumberMock = null;
    }
}