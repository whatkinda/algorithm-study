package com.whatkinda.recursive.concept.exam;

import java.util.Arrays;

/*
 * 이진 탐색(binary search)
 * - 정렬된 배열에서 원하는 데이터를 빠르게 찾기 위한 알고리즘.
 * */
public class Practice07 {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 4, 5, 7, 8, 16, 19, 30, 44, 10};
        Arrays.sort(arr);
        int result = binarySearch(arr, 0, arr.length - 1, 10);

        System.out.println(result);
    }

    /**
     * 재귀를 사용해 이진 알고리즘 구현한다.
     * 이진 탐색은 정렬이 되어 있어야 사용 가능.
     *
     * @param arr  배열
     * @param low  낮은 인덱스
     * @param high 높은 인덱스
     * @param key  검색할 값
     * @return
     */
    public static int binarySearch(int[] arr, int low, int high, int key) {
        // 1. 높은 인덱스가 낮은 인덱스보다 크거나 같은 지 확인
        if (high >= low) {
            // 2. 중간값을 구한다.
            int mid = low + (high - low) / 2;

            // 3. 배열의 요소 값이 찾는 값과 동일하면 중간값을 반환함
            if (arr[mid] == key) {
                return mid;
                // 4. 중간값이 키보다 큰 경우: 낮은 인덱스와 중간 인덱스에서 1을 뺀 값을 재귀적으로 호출
            } else if (arr[mid] > key) {
                return binarySearch(arr, low, mid - 1, key);
                // 5. 중간값이 키보다 작은 경우 : 중간 인덱스에 1을 더하고 높은 인덱스와 함수를 재귀적으로 호출
            } else {
                return binarySearch(arr, mid + 1, high, key);
            }
        }

        // 6. 높은 인덱스가 낮은 인덱스보다 작으면 배열에서 키를 찾지 못했음을 나타내기 위해 -1 리턴
        return -1;
    }
}
