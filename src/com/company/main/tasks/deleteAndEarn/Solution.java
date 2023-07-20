package com.company.main.tasks.deleteAndEarn;

import java.util.Arrays;

public class Solution {

    /**
     * 740. Delete and Earn https://leetcode.com/problems/delete-and-earn/
     */
    public int deleteAndEarn(int[] nums) {
        int n = 10001;
        int[] values = new int[n];
        for (int num : nums) {
            values[num] += num;
        }

        int take = 0, skip = 0;
        for (int i = 0; i < n; i++) {
            int takeI = skip + values[i];
            int skipI = Math.max(skip, take);
            take = takeI;
            skip = skipI;
        }

        return Math.max(take, skip);
    }
}
