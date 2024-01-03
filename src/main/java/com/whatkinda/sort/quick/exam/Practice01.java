package com.whatkinda.sort.quick.exam;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
* Arrays.sort() 와 Collections.sort() 는 퀵정렬을 이용한 내장 정렬함수.
* 해당 내장 정렬함수 연습
*
* Arrays.sort() : 퀵정렬을 사용해 배열을 정렬하는데 사용되며 기본타입 배열과 객체타입 배열 모두 사용 가능. 단 내림차순은 객체타입으로 사용해야 함.
* Collections.sort() : 퀵졍렬을 사용해 객체를 정렬하는데 사용되며 List, Set, Queue 등의 컬렉션 프레임워크에 대해 사용 가능.
*
* 퀵정렬(quick sort)
* - 분할정복 방법(divide and conquer) 사용
* - 분할 -> 정복 -> 결합
* - pivot 개념 등장
* - 평균: O(nlogn) 로그 선형 알고리즘, 최악: O(n^2) 이차 시간알고리즘
* */
public class Practice01 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 2, 4, 3, 9, 7}; // primitive 배열
        Integer[] arr2 = {1, 5, 6, 2, 4, 3, 9, 7};    // Wrapper class 배열

        Arrays.sort(arr2, Comparator.reverseOrder());   // 내림차순 시 Wrapper 배열 사용해야 가능함.
        Arrays.sort(arr2, Collections.reverseOrder());
        Arrays.sort(arr2, Comparator.naturalOrder());   // 오름차순 정렬
        System.out.println(Arrays.toString(arr2));

        String[] strs = {"strawberry", "Strawberry", "mango", "Mango", "cherry", "Cherry", "banana", "Banana", "apple", "Apple"};

        Arrays.sort(strs);  // 오름차순
        Arrays.sort(strs, Comparator.reverseOrder());   // 내림차순

        System.out.println(Arrays.toString(strs));

    }
}
