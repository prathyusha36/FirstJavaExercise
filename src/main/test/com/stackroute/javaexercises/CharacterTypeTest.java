package com.stackroute.javaexercises;
import org.junit.Test;
import static org.junit.Assert.*;

public class CharacterTypeTest {



        CharacterType typeOfCharacter;
        String actualResult;
        String expectedResult;
        @org.junit.Before
        public void setUp() throws Exception {
            typeOfCharacter = new CharacterType();
        }

        @Test
        public void checkTheCapitalInputCharacter() {
            actualResult = CharacterType.determineTheTypeOfCharacter('Z');
            expectedResult = "Capital Letter";
            assertEquals(expectedResult, actualResult);
        }

        @Test
        public void checkTheSymbolInputCharacter() {
            actualResult = CharacterType.determineTheTypeOfCharacter('@');
            expectedResult = "Special Symbol";
            assertEquals(expectedResult, actualResult);
        }

        @org.junit.After
        public void tearDown() throws Exception {
            typeOfCharacter = null;
        }
    }

