package com.whatkinda.sort.bubble.exam;

import java.util.Arrays;

public class Practice01 {
    public static void main(String[] args) {
        int[] nums = new int[] {4, 6, 1, 2, 9, 7, 5, 8};

        bubble(nums);
    }

    /*
    * 평균: O(n^2), 최악: O(n^2) = 성능 안좋음, 매우.
    * */
    public static void bubble(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if(nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                }
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void swap(int[] nums, int i, int j) {
        int tmp = nums[j];
        nums[j] = nums[i];
        nums[i] = tmp;
    }
}
