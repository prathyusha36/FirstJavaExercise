package com.stackroute.javaexercises;

import org.junit.*;

import static org.junit.Assert.*;

public class CheckNumberTest {
    CheckNumber check;
    @Before
    public void setUp() throws Exception {
        System.out.println("before");
        check=new CheckNumber();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("after");
        check=null;
    }
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("BeforeClass");


    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("After Class");

    }
    @Test
    public void checkGivenNumberIsEven() {
        String result = check.checkGivenNumberIsEvenOrOdd(22);
        assertEquals("jerry", result);
    }
    @Test
    public void checkGivenNumberIsOdd() {
        String result = check.checkGivenNumberIsEvenOrOdd(25);
        assertEquals("tom", result);
    }
    @Test
    public void checkNumberIsNegative() {
        String result = check.checkGivenNumberIsEvenOrOdd(-25);
        assertEquals("number is negative", result);
    }

}