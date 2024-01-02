package com.whatkinda.recursive.concept.exam;

import java.util.Arrays;

/* 피보나치 수열 */
public class Practice05 {
    private static final int NUMBER = 10;
    private static int[] arr = new int[NUMBER];

    public static void main(String[] args) {
        fibonacci(NUMBER);
        System.out.println(Arrays.toString(arr));
    }

    public static int fibonacci(int n) {
        if(n == 0) {
            arr[n] = 1;
            return 0;
        } else if(n == 1) {
            arr[n] = 1;
            return 1;
        } else {
            arr[n - 1] = fibonacci(n - 1) + fibonacci(n - 2);
            return arr[n - 1];
        }
    }
}
