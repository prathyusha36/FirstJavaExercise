package com.stackroute.javaexercises;

import org.junit.*;

import static org.junit.Assert.*;

public class CheckLetterTest {
    CheckLetter compare;
    @Before
    public void setUp() throws Exception {
        System.out.println("before");
        compare=new CheckLetter();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("after");
        compare=null;
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
    public  void checkLetterIsVowel() {
        String result= compare.check("A");
        assertEquals("vowel",result);

    }
    @Test
    public  void checkLetterIsConsonant() {
        String result= compare.check("b");
        assertEquals("consonant",result);

    }
    @Test
    public  void checkMultipleLetters() {
        String result= compare.check("ab");
        assertEquals("vowelconsonant",result);

    }
}