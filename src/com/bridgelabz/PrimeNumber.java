package com.bridgelabz;
/*
Author : jananiVijayakumar
Date : 08/11/2021
Desc : check both strings are same or not
 */

public class PrimeNumber {
    public static void main (String[] args)
    {
        int i =0;
        int number =0;
        String  primeNumbers = "";

        for (i = 0; i <= 1000; i++)
        {
            int count =0;
            for(number =i; number >=1; number--)
            {
                if(i% number ==0)
                {
                    count = count + 1;
                }
            }
            if (count ==2)
            {
                primeNumbers = primeNumbers + i + " \n ";
            }
        }
        System.out.println("Prime numbers from 0 to 1000 are :");
        System.out.println(primeNumbers);
    }

    }