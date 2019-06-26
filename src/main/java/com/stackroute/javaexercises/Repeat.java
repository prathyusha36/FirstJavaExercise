package com.stackroute.javaexercises;

public class Repeat {

        public static String finalOutputString(String str,int n) {
        int len=str.length();
        String str1=str.substring(len-n,len);
        return str.concat(str1.repeat(n));
    }
}
