package com.company;

import java.util.Scanner;

/*
1. You are given a string that contains only lowercase and uppercase alphabets.
2. You have to toggle the case of every character of the given string.
toggle means to change uppercase to lowercase and vice versa
 */
public class ToggleString {
    public static String   getLogic(String string1)
    {
        StringBuilder stringBuilder1 = new StringBuilder(string1);

        for(int i = 0 ; i<stringBuilder1.length(); i++)
        {
            char Character = stringBuilder1.charAt(i);

            if(Character>='a' && Character<='z')
            {
                char upperCase = (char) ('A' + Character - 'a');
                stringBuilder1.setCharAt(i , upperCase);



            }else
            {
                char lowerCase = (char) ('a'+Character - 'A');
                stringBuilder1.setCharAt(i , lowerCase);

            }
        }


        return stringBuilder1.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence or word to get toggle");  // toggle means to change uppercase to lowercase and vice versa
        String string = scanner.nextLine();
        String getReturn = getLogic( string);
        System.out.println(getReturn);

    }
}
