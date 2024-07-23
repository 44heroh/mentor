package com.company.leetcode.alexey.greedy.wiggle_sort_ii;

import java.util.Arrays;

public class Solution {

    /**
     * https://leetcode.com/problems/wiggle-sort-ii/
     *
     * 324. Wiggle Sort II
     *
     * Given an integer array nums, reorder it such that nums[0] < nums[1] > nums[2] < nums[3]....
     *
     * You may assume the input array always has a valid answer.
     *
     * Example 1:
     *
     * Input: nums = [1,5,1,1,6,4]
     * Output: [1,6,1,5,1,4]
     * Explanation: [1,4,1,5,1,6] is also accepted.
     *
     * Example 2:
     *
     * Input: nums = [1,3,2,2,3,1]
     * Output: [2,3,1,3,1,2]
     *
     * @param nums
     */
    public void wiggleSort(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int left = 1, right = n - 1;
        int[] ans = new int[n];

        while (right >= 0) {
            if (left > n - 1) {
                left = 0;
            }
            ans[left++] = nums[right--];
            left++;
        }

        for (int i = 0; i < n; i++) {
            nums[i] = ans[i];
        }
    }


    public void wiggleSort1(int[] nums) {
        int n = nums.length;
        int[] newArr = Arrays.copyOf(nums, n);
        Arrays.sort(newArr);

        int count = n - 1;
        for (int i = 1; i < n; i += 2) {
            nums[i] = newArr[count--];
        }

        for (int i = 0; i < n; i += 2) {
            nums[i] = newArr[count--];
        }
    }
}
