package com.company;

import java.util.Scanner;
/*
1. You are given a string.
2. You have to print all permutations of the given string iteratively.

Sample Input
abc
Sample Output
abc
bac
cab
acb
bca
cba
 */
public class PermutationsOfAStringIteratively {
    public static void permutations(String string)
    {
        int lengthForJ = string.length();  // to control jth loop
        int fact = factorial(lengthForJ);

        for(int i = 0 ; i<fact; i++)
        {
            StringBuilder stringBuilder = new StringBuilder(string);  // using stringbuilder
            int temp = i;
            for(int j=lengthForJ; j>=1 ; j--)
            {
                int quotient = temp / j;
                int remainder = temp % j;

                System.out.print(stringBuilder.charAt(remainder));
                stringBuilder.deleteCharAt(remainder);

                temp = quotient;

            }
            System.out.println();

        }

    }

    public static int factorial(int number) // finding fictorial for number of permutations
    {
        int val = 1;
        for(int i = 2; i<=number; i++)
        {
            val*= i;
        }
        return val;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = scanner.nextLine();
         permutations( string);


    }
}
