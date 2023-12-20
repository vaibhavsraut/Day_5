package com.day5;

import java.util.Scanner;

public class TwoDArrayLibrary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        System.out.println("Enter number of rows:");
        m = sc.nextInt();
        System.out.println("Enter number of columns:");
        n = sc.nextInt();

        int[][] array = new int[m][n];

        System.out.println("Enter the elements in array: ");
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("Your array: ");
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


    }
}
