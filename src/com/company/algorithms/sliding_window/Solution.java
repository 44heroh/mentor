package com.company.algorithms.sliding_window;

public class Solution {


    public int slidingWindowSum(int[] nums) {
        int n = nums.length, k = 3;
        if (n < k) return -1;

        int sum = 0, max = Integer.MIN_VALUE;
        for (int i = k; i < n; i++) {
            sum += Math.abs(nums[i] - nums[i - k]);
            max = Math.max(max, sum);
        }

        return max;
    }
}
