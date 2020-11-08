package com.company;

import java.util.Scanner;

public class WaveTraversal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter rows for first matrix");
        int r1 = sc.nextInt();
       // System.out.println("Enter coloumns for first matrix");
        int c1 = sc.nextInt();
        int [] [] m1 = new int [r1] [c1];

       // System.out.println("Enter Elements for first matrix");



        for (int i = 0 ; i<m1.length; i++) {                // input matrix 1
            for (int j = 0; j < m1[0].length; j++) {

                m1 [i] [j] = sc.nextInt();

            }
        }

        for(int j=0; j<m1[0].length; j++) {

             if(j%2==0) {
                 for (int i = 0; i < m1.length; i++) {
                     System.out.println(m1[i][j]);
                 }
             }
                 else
                 {
                     for(int i= m1.length - 1; i>=0; i--)
                     {
                         System.out.println(m1[i][j]);
                     }

                 }
             }

        }

}
