package com.company.leetcode.problems.missingNumber;

import java.util.Arrays;

public class Solution {

    /**
     * 268. Missing Number https://leetcode.com/problems/missing-number/
     * @param head
     * @return
     */
    public int missingNumber(int[] nums) {
        if(nums.length == 0)
            return 0;

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] - nums[i - 1] > 1) {
                return nums[i] - 1;
            }
        }

        if(nums[nums.length - 1] != nums.length)
            return nums.length;

        return 0;
    }
}
