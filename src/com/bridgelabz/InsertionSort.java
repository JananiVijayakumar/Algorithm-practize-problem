package com.bridgelabz;

public class InsertionSort {
    public static void main(String[] args) {
        String[] arr = {"My", "Name", "is", "janani", "vijayakumar"};
        int count = 0;
        String sortedArray[] = sort_sub(arr, arr.length);
        System.out.println("Sorted list :");
        System.out.println("..................");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i]);
        }
    }

    public static String[] sort_sub(String array[], int data) {
        String temp = "";
        for (int i = 0; i < data; i++) {
            for (int j = i + 1; j < data; j++) {
                if (array[i].compareToIgnoreCase(array[j]) > 0) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}