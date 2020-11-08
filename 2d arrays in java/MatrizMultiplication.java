package com.company;

import java.util.Scanner;

public class MatrizMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows for first matrix");
        int r1 = sc.nextInt();
        System.out.println("Enter coloumns for first matrix");
        int c1 = sc.nextInt();
        int [] [] m1 = new int [r1] [c1];

        System.out.println("Enter Elements for first matrix");



        for (int i = 0 ; i<m1.length; i++) {                // input matrix 1
            for (int j = 0; j < m1[0].length; j++) {

                m1 [i] [j] = sc.nextInt();

            }
        }
        System.out.println("Enter rows for second matrix");

        int r2 = sc.nextInt();
        System.out.println("Enter rows for second matrix");
        int c2 = sc.nextInt();
        int [] [] m2 = new int [r2] [c2];
        System.out.println("Enter rows for second matrix");

        for (int i = 0 ; i<m2.length; i++) {            // input matrix 2
            for (int j = 0; j < m2[0].length; j++) {

                m2 [i] [j] = sc.nextInt();

            }
        }
        if (c1!=r2)            // coloumns of m1 must be equal to rows of m2
        {
            System.out.println("Invalid input");
            return;
        }

        int [] [] m3 = new int [r1] [c2] ;            // resultant matrix

        for (int i = 0 ; i<m3.length; i++) {            // input matrix 2
            for (int j = 0; j < m3[0].length; j++) {

                for(int k = 0; k<r2; k++)
                {
                    m3 [i] [j] += m1[i][k] * m2[k][j];

                }

            }
        }



        for (int i = 0 ; i<m3.length; i++) {            // output matrix 3
            for (int j = 0; j < m3[0].length; j++) {

                System.out.print(m3[i][j] +" ");

            }
            System.out.println();
        }

    }
}
