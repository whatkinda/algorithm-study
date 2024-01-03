package com.whatkinda.complexity.concept.exam;

import java.util.Arrays;

/*
* 시간 복잡도 예제
* */
public class Practice01 {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 3, 5, 6, 9};
        int[] arr2 = new int[] {3, 4, 1, 2, 9, 6, 5, 7};

        System.out.println(getFirst(arr)); // O(1)
        System.out.println(binarySearch(arr, 6)); // O(log N)
        Arrays.stream(reverse(arr)).forEach(n -> System.out.print(n + " ")); // O(n)
        System.out.println();
        selectionSort(arr2);
        System.out.println("fibonacci = " + fibonacci(6));   // O(2^n)

    }

    /* O(1) : 상수 시간 알고리즘
    * - 배열에서 원소를 하나 찾는 예시
    * */
    public static int getFirst(int[] nums) {
        return nums[0];
    }

    /*
    * O(long n) : 로그 시간 알고리즘
    * - 이진 탐색 알고리즘이 예시.
    * - 입력 크기가 증가함에 따라 실행 시간이 로그함수적 형태로 증가한다.
    * - 이를 통해 정렬된 배열에서 특정값을 찾을 때 유용함.
    * */
    public static int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    /*
    * O(n) : 선형 시간 알고리즘
    * - 해당 코드는 입력한 배열을 역순으로 만드는 함수를 구현한 예시
    * */
    public static int[] reverse(int[] arr) {
        int len = arr.length;
        int[] reversed = new int[len];

        for (int i = 0; i < len; i++) {
            reversed[len - i - 1] = arr[i];
        }

        return reversed;
    }

    /*
     * O(nlogn) : 로그 선형 알고리즘
     * 병합정렬(merge sort) 을 이용한 정렬 예시
     * */
    public static void mergeSort(int[] nums, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(nums, left, mid);
            mergeSort(nums, mid + 1, right);
            //merge(nums, left, mid, right);
        }
    }

    /*
     * O(n^2) : 이차 시간 알고리즘
     * 정수 배열을 선택정렬(selection sort) 을 이용한 정렬 예시
     * */
    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIdx]) {
                    minIdx = j;
                }
            }

            int tmp = nums[i];
            nums[i] = nums[minIdx];
            nums[minIdx] = tmp;
        }

        Arrays.stream(nums).forEach(n -> System.out.print(n + " "));
        System.out.println();
    }

    /*
    * O(2^n) : 지수 시간 알고리즘
    * 피보나치 수열 구현 예시
    *
    * */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci( n - 2);
    }
}
