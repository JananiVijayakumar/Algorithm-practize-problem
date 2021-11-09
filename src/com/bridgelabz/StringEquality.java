package com.bridgelabz;
/*
Author : jananiVijayakumar
Date : 08/11/2021
Desc : Find the string using Binary Search
 */

import java.util.*;
public class StringEquality {
    private static void swapStringForRecursive(char[] chars, int i, int j)
    {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
    // Recursive function to generate all permutations of a string
    private static void Recursivepermutations(char[] chars, int currentIndex)
    {
        if (currentIndex == chars.length - 1) {
            System.out.println(String.valueOf(chars));
        }
        for (int i = currentIndex; i < chars.length; i++)
        {
            swapStringForRecursive(chars, currentIndex, i);
            Recursivepermutations(chars, currentIndex + 1);
            swapStringForRecursive(chars, currentIndex, i);
        }
    }

    public static void findRecursivePermutations(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        Recursivepermutations(str.toCharArray(), 0);
    }

    public static Set<String> iterativePermutation(String str) {
        Set<String> permutations = new HashSet<String>();
        // check if string is null
        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            permutations.add("");
            return permutations;
        }
        char first = str.charAt(0);
        String sub = str.substring(1);
        Set<String> words = iterativePermutation(sub);
        for (String strNew : words) {
            for (int i = 0;i<=strNew.length();i++){
                permutations.add(strNew.substring(0, i) + first + strNew.substring(i));
            }
        }
        return permutations;
    }

    public static void main(String[] args) {
        String str = "ABC";
        System.out.println("Recursive Permutation For Given String is :");
        findRecursivePermutations(str);
        System.out.println("...................................................................");
        System.out.println("Iterative Permutation For Given String is :");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String data = input.nextLine();
        System.out.println("Permutations of " + data + ": \n" + iterativePermutation(data));
    }
        }