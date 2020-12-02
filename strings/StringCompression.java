package com.company;

import java.util.Scanner;

class CompressedString
{

    public void firstCompression(String s)
    {
        String str = s.charAt(0) + "";   // .... adding empty string or you can also use substring(0 , 1).....

        for(int i = 1; i< s.length(); i++)
        {
            char current = s.charAt(i);
            char previous = s.charAt(i-1);

            if(current != previous)
            {
                str+= current;
            }
        }
        System.out.println(str);

    }

    public void secondCompression(String s)
    {
        String str = s.charAt(0) + ""; // .... adding empty string or you can also use substring(0 , 1).....
        int count = 1;

        for(int i = 1; i< s.length(); i++)
        {
            char current = s.charAt(i);
            char previous = s.charAt(i-1);

            if(current == previous)
            {
                count++;

            }
            else {
                if(count>1) {
                    str += count;

                    count = 1;
                }
                str+=current;
            }

        }
        if(count>1) {
            str += count;
            count = 1;
        }
        System.out.println(str);
    }
}

public class StringCompression {
    public static void main(String[] args) {

        String s;

        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();

        CompressedString c = new CompressedString();
        c.firstCompression(s);
        c.secondCompression(s);

    }
}
