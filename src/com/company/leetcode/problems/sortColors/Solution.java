package com.company.leetcode.problems.sortColors;

public class Solution {

    /**
     * 75. Sort Colors https://leetcode.com/problems/sort-colors/
     * @param nums
     */
    public void sortColors(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int tmp = nums[i];
            int j = i;
            while (j > 0 && nums[j - 1] > tmp) {
                nums[j] = nums[j - 1];
                j--;
            }

            nums[j] = tmp;
        }
    }
}
