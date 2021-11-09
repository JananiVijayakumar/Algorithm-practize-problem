package com.bridgelabz;
/*
Author : jananiVijayakumar
Date : 08/11/2021
Desc : Find the string using Binary Search
 */

import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args) {
        String[] arr = {"My", "Name", "is", "janani", "vijayakumar"};
            String search = "is";
            Arrays.sort(arr);
            int searchIndex = binarySearch(arr,search);
            System.out.println(searchIndex != -1 ? arr[searchIndex]+ " - String is Found \n  Index of the String is : "+searchIndex : "String Not found");
        }
        public static int binarySearch(String[] arr, String element) {
            int Min = 0;
            int Max = arr.length - 1;
            int Mid;
            while (Min <= Max) {
                Mid = (Min + Max) / 2;
                if (arr[Mid].compareTo(element) < 0) {
                    Min = Mid + 1;
                } else if (arr[Mid].compareTo(element) > 0) {
                    Max = Mid - 1;
                } else {
                    return Mid;
                }
            }
            return -1;
        }
    }