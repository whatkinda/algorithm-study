package com.whatkinda.recursive.concept.exam;

/* 자연수 N 의 합계 */
public class Practice02 {
    public static void main(String[] args) {
        System.out.println(sumNaturalNumber(5));    // 15
    }

    public static int sumNaturalNumber(int n) {
        if(n == 1) {
            return 1;
        } else {
            return sumNaturalNumber(n - 1) + n;
        }
    }
}
