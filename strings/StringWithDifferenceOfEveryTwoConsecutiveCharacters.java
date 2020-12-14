package com.company;

import java.util.Scanner;
/*
1. You are given a string that contains only lowercase and uppercase alphabets.
2. You have to form a string that contains the difference of ASCII values of every two consecutive characters between those characters.
   For "abecd", the answer should be "a1b3e-2c1d", as
   'b'-'a' = 1
   'e'-'b' = 3
   'c'-'e' = -2
   'd'-'c' = 1
 */
public class StringWithDifferenceOfEveryTwoConsecutiveCharacters {
    public static String solutionForProgram(String string)
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string.charAt(0));  // contains the first character of string

        for(int i = 1; i<string.length(); i++)
        {
            char currentCharacter = string.charAt(i);
            char previousCharacter = string.charAt(i - 1);
            int gap = currentCharacter - previousCharacter;
            stringBuilder.append(gap);
            stringBuilder.append(currentCharacter);
        }

        return stringBuilder.toString();


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = scanner.nextLine();
        String getReturn = solutionForProgram( string);
        System.out.println(getReturn);

    }
}
