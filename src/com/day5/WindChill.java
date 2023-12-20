package com.day5;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double t,v;
        System.out.println("Enter the value of v(Wind Speed):");
        v = sc.nextDouble();
        System.out.println("Enter the value of t(Temperature):");
        t = sc.nextDouble();

        if (Math.abs(t) > 50 || v < 3 || v > 120) {
            System.out.println("Invalid input values. Temperature (|t|) should be <= 50, and wind speed (3 <= v <= 120).");
            return;
        }

        double windChill = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);

        System.out.println("Wind Chill: " + windChill);
    }
}
