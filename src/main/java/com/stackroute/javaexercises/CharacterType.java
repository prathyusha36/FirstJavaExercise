package com.stackroute.javaexercises;
/*
determine the type of character as capital,small or digit
 */
public class CharacterType {


        public static String determineTheTypeOfCharacter(char inputCharacter) {
            if(inputCharacter >= 'A' && inputCharacter <= 'Z') {
                return "Capital Letter";
            }
            else if(inputCharacter >= 'a' && inputCharacter <= 'z') {
                return "Small Letter";
            }
            else if(inputCharacter >= '0' && inputCharacter <= '9') {
                return "Digit";
            }
            else {
                return "Special Symbol";
            }
        }
    }

