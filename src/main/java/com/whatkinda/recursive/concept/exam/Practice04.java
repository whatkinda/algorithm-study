package com.whatkinda.recursive.concept.exam;

/* 문자열 뒤집기 */
public class Practice04 {

    public static void main(String[] args) {
        System.out.println(reverseString("hello")); // olleh
        System.out.println(reverseString("jonghwa"));
    }

    public static String reverseString(String str) {
        if(str.length() == 0) {
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }
}
