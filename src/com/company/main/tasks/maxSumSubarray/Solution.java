package com.company.main.tasks.maxSumSubarray;

public class Solution {

    public int maxSumSubarray(int[] nums, int k) {
        if(nums.length < k)
            return -1;

        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;
        for (int i = k; i < nums.length; i++) {
            windowSum += (nums[i] - nums[i - k]);
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}
