package com.javamultiplex;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ThirdLargest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        Integer arr[] = new Integer[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(getThirdLargest(arr));

    }

    private static int getThirdLargest(Integer[] arr) {
        Arrays.sort(arr, Collections.reverseOrder());
        return arr[2];
    }
}
