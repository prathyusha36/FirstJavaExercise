package com.stackroute.javaexercises;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PalindromeTest {
    Palindrome palindrome;
    String actualResult;
    String expectedResult;

    @org.junit.Before
    public void setUp() throws Exception {
        palindrome = new Palindrome();
    }

    @Test
    public void checkWhetherTheSumIsLess() {
        actualResult = palindrome.checkWhetherStringIsPalindromeOrNot("2468642");
        expectedResult = "String is palindrome and sum of even numbers is greater than 25";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkWhetherTheSumIsGreater() {
        actualResult = palindrome.checkWhetherStringIsPalindromeOrNot("123454321");
        expectedResult = "String is palindrome and sum of even numbers is less than 25";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkWhetherTheStringIsPalindrome() {
        actualResult = palindrome.checkWhetherStringIsPalindromeOrNot("1234");
        expectedResult = "String is not palindrome";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkWhetherTheInputIsNumberOrNot() {
        actualResult = palindrome.checkWhetherStringIsPalindromeOrNot("aba");
        expectedResult = "Input is not valid";
        assertEquals(expectedResult, actualResult);
    }

    @org.junit.After
    public void tearDown() throws Exception {
        palindrome = null;
    }
}