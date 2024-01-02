package com.whatkinda.recursive.concept.exam;

/*
* 유클리드 호제법 알고리즘 : 최대공약수 계산
* - 두 수의 최대공약수(GCD; Greatest Common Divider) 를 찾기 위한 알고리즘.
* - 큰 수를 작은 수로 나누어 떨어지게 해 수를 반복적으로 취하여 나머지가 0이 될 때까지 작동시키는 방식.
* - 그 때 작은 수가 최대공약수.
* */
public class Practice06 {
    public static void main(String[] args) {
        System.out.println(gcd(10, 15));
    }

    public static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        } else {
            return gcd(n, m % n);
        }
    }
}
