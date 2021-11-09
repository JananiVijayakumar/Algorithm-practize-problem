package com.bridgelabz;
/*
Author : jananiVijayakumar
Date : 08/11/2021
Desc : Sorting the element using Bubble Sort
 */

public class BubbleSort {
    public void SortingElement(int arr[], int element){
        for (int i = 0; i< element; i++){
            for (int j = 0; j< element -i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public void display(int arr[], int n){
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int arr[] = {5,12,56,34,-42,56,87,2,4,1};
        System.out.println("Elements of Before bubbleSorting : ");
        bubbleSort.display(arr, arr.length);
        bubbleSort.SortingElement(arr, arr.length);
        System.out.println("................................................");
        System.out.println("Elements of After bubbleSorting : ");
        bubbleSort.display(arr, arr.length);
    }
}