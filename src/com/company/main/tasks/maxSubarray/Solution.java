package com.company.main.tasks.maxSubarray;

public class Solution {

    /**
     * 53. Maximum Subarray https://leetcode.com/problems/maximum-subarray/
     * @param nums
     * @return
     */
    public int maxSubarray(int[] nums) {
        int currentSubarray = 0, maxSubarray = 0;
        for (int num : nums) {
            currentSubarray = Math.max(num, currentSubarray + num);
            maxSubarray = Math.max(currentSubarray, maxSubarray);
        }

        return maxSubarray;
    }
}
