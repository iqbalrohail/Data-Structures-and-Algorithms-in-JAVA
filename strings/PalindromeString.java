package com.company;

import java.util.Scanner;

class Palindrome {
    String s;

    public void setString() {
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
    }

    public void getSubString() {
        for (int i = 0; i <= s.length() - 1; i++) {
            for (int j = i + 1; j <= s.length(); j++) {
               String str = s.substring(i, j);

                if(checkPalindrome(str) == true)
                {

                    System.out.println(str);

                }

            }
        }
    }

    public boolean checkPalindrome(String ss) {

        int i = 0;
        int j = ss.length() - 1;

        while(i <= j )
        {
            if(ss.charAt(i) != ss.charAt(j))
                return  false;
                else
            {
                i++;
                j--;

            }

        }
        return  true;

    }
}
public class PalindromeString {
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        p.setString();
        p.getSubString();

    }
}
