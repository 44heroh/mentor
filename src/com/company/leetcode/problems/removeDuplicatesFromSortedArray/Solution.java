package com.company.leetcode.problems.removeDuplicatesFromSortedArray;

public class Solution {
    /**
     * 26. Remove Duplicates from Sorted Array https://leetcode.com/problems/remove-duplicates-from-sorted-array/
     * @param nums
     * @return
     */
    public int[] removeDuplicates(int[] nums) {
        int count = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i - 1]){
                nums[count] = nums[i];
                count++;
            }
        }

        for(int j = count; j < nums.length; j++) {
            nums[j] = 0;
        }
        return nums;
    }
}
