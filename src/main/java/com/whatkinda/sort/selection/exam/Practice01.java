package com.whatkinda.sort.selection.exam;

import java.util.Arrays;

public class Practice01 {
    public static void main(String[] args) {
        int[] nums = new int[] {4, 6, 1, 2, 9, 7, 5, 8};
        selection(nums);
    }

    /*
    * 평균: O(n^2), 최악 : O(n^2) = 성능 안좋음.
    * */
    public static void selection(int[] nums) {
        int len = nums.length;

        for (int i = 0; i < len - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < len; j++) {
                if(nums[minIdx] > nums[j]) {
                    minIdx = j;
                }
            }

            if(minIdx != i) {
                int tmp = nums[i];
                nums[i] = nums[minIdx];
                nums[minIdx] = tmp;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
