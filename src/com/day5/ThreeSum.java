package com.day5;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers (N): ");
        int N = scanner.nextInt();

        System.out.println("Enter the integers:");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        findTriplets(arr);
    }

    private static void findTriplets(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        count++;
                        System.out.println("(" + arr[i] + ", " + arr[j] + ", " + arr[k] + ")");
                    }
                }
            }
        }

        System.out.println("Number of distinct triplets: " + count);
    }
}
