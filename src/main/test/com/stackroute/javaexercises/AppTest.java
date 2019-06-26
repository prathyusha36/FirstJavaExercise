package com.stackroute.javaexercises;

import org.junit.*;

import static org.junit.Assert.*;

public class AppTest {
    App app;

    @Test
    public void givenTwoStringsShouldReturnConcatinatedUpperString() {
        //arrange

        //act
        String result=app.concatAndConvertString("hello","World");
        //assert
        assertEquals("HELLOWORLD",result);
    }
    @Test
    public void givenTwoNullShouldReturnErrorMessage() {
        //arrange

        //act
        String result=app.concatAndConvertString(null,null);
        //assert
        assertEquals("null not allowed",result);
    }
    @Test
    public void givenOneEmptyStringOneNumericStringShouldReturnNumericString() {
        //arrange

        //act
        String result=app.concatAndConvertString("","5");
        //assert
        assertEquals("5",result);
    }
    @Before
    public void setUp() throws Exception {
        System.out.println("Before");
        app=new App();

    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After");
        app=null;
    }
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("BeforeClass");


    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("After Class");

    }


}