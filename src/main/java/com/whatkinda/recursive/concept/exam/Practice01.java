package com.whatkinda.recursive.concept.exam;

/*
* 재귀(concept) 를 이해하기 위해선 절차지향적 사고를 버리고 귀납적 사고로 접근해야 한다.
*
* _base condition
* : 재귀함수는 특정 입력에 대해 자신을 호출하지 않고 종료해야 함. 또한 모든 입력은 base condition 으로 수렴해야만 한다.
* 이를 지키지 않을 시 재귀함수는 무한루프에 빠져 에러를 발생시킨다.
* 그렇기에 초반에 함수 인자와 분기에 대한 설계를 잘해야 한다.
* base condition 이 없는 것은 재귀가 아닌 loop 문으로 다 처리가능함을 유의해야 함.
* */
public class Practice01 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        if(n == 0) {    // 기본 케이스(base condition)
            return 1;
        } else {    // 재귀 케이스
            return n * factorial(n - 1);
        }
    }
}
