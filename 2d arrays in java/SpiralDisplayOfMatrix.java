package com.company;

import java.util.Scanner;

public class SpiralDisplayOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r , c;
        r = sc.nextInt();
        c = sc.nextInt();
        int [][] m1 = new int [r][c];

        for(int i = 0; i< m1.length; i++)   // input
        {
            for(int j = 0; j<m1[0].length; j++)
            {
                m1[i][j] = sc.nextInt();
            }
        }

       int minr = 0;
        int minc=0;
        int maxr= m1.length-1;          // for row
        int maxc = m1[0].length-1;      // for coloumn

        // for loop control
        int TotalDigits = r*c;
        int count = 0;




        while(count<TotalDigits)
        {
            // left wall
            for( int i = minr ,  j = minc; i<=maxr && count<TotalDigits; i++ )
            {
                System.out.println(m1[i][j]);
                count ++;
            }
            minc++;

            // bottom wall
            for( int i = maxr ,  j = minc; j<=maxc && count<TotalDigits; j++ )
            {
                System.out.println(m1[i][j]);
                count ++;
            }
            maxr--;

            // right wall
            for( int i = maxr ,  j = maxc; i>=minr && count<TotalDigits; i-- )
            {
                System.out.println(m1[i][j]);
                count ++;
            }
            maxc--;

            // top wall
            for( int i = minr ,  j = maxc; j>=minc && count<TotalDigits; j-- )
            {
                System.out.println(m1[i][j]);
                count ++;
            }
            minr++;

            // we use    count<TotalDigits   in every loop for preventing printing double digits e.g in 5 x 3 matrix----


        }






    }
}
