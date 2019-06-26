package com.stackroute.javaexercises;

import org.junit.*;

import static org.junit.Assert.*;

public class RepeatTest {
    Repeat pattern;
    @Before
    public void setUp() throws Exception {
        System.out.println("before");
        pattern=new Repeat();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("after");
        pattern=null;
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
    public void givenStringShouldRepeatStrings() {
        String result = pattern.finalOutputString("pallavi",2);
        assertEquals("pallavivivi", result);
    }
    @Test
    public void givenStringWithSpacesShouldRepeatStrings() {
        String result = pattern.finalOutputString("prat usha",4);
        assertEquals("prat ushaushaushaushausha", result);
    }


}