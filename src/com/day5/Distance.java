package com.day5;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        x= sc.nextInt();
        System.out.println("Enter the value of y: ");
        y = sc.nextInt();

        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        System.out.println("Euclidean distance from point (" + x + ", " + y + ") to the origin (0, 0): " + distance);
    }
}
