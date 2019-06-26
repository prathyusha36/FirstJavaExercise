package com.stackroute.javaexercises;

public class CheckLetter {
    public static String check(String word) {
        int length=word.length();
        String result="";
        for(int i=0;i<length;i++)
        {
            char character = word.charAt(i);
            if(character=='a'||character=='e'||character=='i'||character=='o'||character=='u'||character=='A'||character=='E'||character=='I'||character=='O'||character=='U')

                result=result+"vowel";

            else if((character>='a'&&character<='z')||(character>='A'&&character<='Z'))
                result=result+"consonant";
            else
                return "error because it is digit";
        }
     return result;
    }
}

