package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/*
1. You are given an ArrayList of positive integers.
2. You have to remove prime numbers from the given ArrayList and return the updated ArrayList.

Note -> The order of elements should remain same.
 */

public class RemovePrime {
// Method for checking prime number
    public static boolean isPrime(int value)
    {
        for (int i = 2; i*i <= value ; i++)  // loop will terminates at square root of the number
        {
            if( value % i == 0)
            {
                return false;
            }

        }
        return true;
    }
// Method for removing prime
    public static void removePrime( ArrayList <Integer> ListOfNumbers)
    {

        for (int i = ListOfNumbers.size() - 1 ; i>=0 ; i--)
        {
            int value = ListOfNumbers.get(i);
            if(isPrime(value))
            {
                ListOfNumbers.remove(i);

            }

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ListSize = scanner.nextInt();
        ArrayList <Integer> ListOfNumbers = new ArrayList<>();

        // taking input using add method in array list
        for (int i = 0; i < ListSize; i++)
        {
            ListOfNumbers.add(scanner.nextInt());
        }

        removePrime(ListOfNumbers);
        System.out.println(ListOfNumbers);


    }
}
