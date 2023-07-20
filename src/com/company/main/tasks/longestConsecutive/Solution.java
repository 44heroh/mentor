package com.company.main.tasks.longestConsecutive;

import java.util.Arrays;

public class Solution {

    /**
     * 128. Longest Consecutive Sequence https://leetcode.com/problems/longest-consecutive-sequence/
     * @param nums
     * @return
     */
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        if(nums.length == 1) {
            return 1;
        }

        Arrays.sort(nums);
        int count = 1;
        int max = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            if (i - 1 >= 0) {
                int diff = nums[i] - nums[i - 1];

                if(diff == 1) {
                    count++;
                } else if(diff == 0) {
                    continue;
                } else if(count < 1 || count > 1) {
                    count = 1;
                }
            }

            max = Math.max(count, max);
        }

        max = Math.max(count, max);

        return max;
    }

}
