package com.whatkinda.recursive.concept.exam;

/*
* 거듭제곱(pow) 계산
* - 거듭제곱이란 ? 하나의 숫자(밑)를 다른 숫자(지수) 만큼 곱하는 것
* java.lang.Math.pow() 이용 시 같은 결과 도출
* */
public class Practice03 {
    public static void main(String[] args) {
        System.out.println(power(2, 5));    // 32
        System.out.println((int) java.lang.Math.pow(2, 5)); // 32
    }

    public static int power(int base, int exponent) {   // base : 밑, exponent : 지수
        if(exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }
}
