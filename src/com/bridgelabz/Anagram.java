package com.bridgelabz;
/*
Author : jananiVijayakumar
Date : 08/11/2021
Desc : check both strings are same or not
 */

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String string1 = "abcd";
        String string2 = "dcba";
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();
        // check if length is same
        if(string1.length() == string2.length()) {
            // convert strings to char array
            char[] charArray1 = string1.toCharArray();
            char[] charArray2 = string2.toCharArray();
            // sort the character array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            // if sorted char arrays are same then the string is anagram
            boolean result = Arrays.equals(charArray1, charArray2);
            if(result) {
                System.out.println(string1 + " and " + string2 + " are anagram.");
            }
            else {
                System.out.println(string1 + " and " + string2 + " are not anagram.");
            }
        }
        else {
            System.out.println(string1 + " and " + string2 + " are not anagram.");
        }
    }

    }