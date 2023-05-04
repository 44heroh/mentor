package com.company.leetcode.problems.searchInRotatedSortedArray;

import java.util.Arrays;

public class Solution {
    /**
     * 33. Search in Rotated Sorted Array https://leetcode.com/problems/search-in-rotated-sorted-array/
     * @param nums
     * @param target
     * @return
     */
    public int search1(int[] nums, int target) {
        if (nums.length == 1 && nums[0] == target)
            return 0;

        boolean isTarget = false;
        int i = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                isTarget = true;
                break;
            }
        }

        if(!isTarget)
            return -1;

        int[] arr = new int[nums.length - 1];
        if(i > 0){
            if(nums[i - 1] > nums[i]){
                int[] tmp1 = Arrays.copyOfRange(nums, i, nums.length);
                int[] tmp2 = Arrays.copyOfRange(nums, 0, i - 1);
                System.arraycopy(tmp2, 0, arr, 0, tmp2.length);
                System.arraycopy(tmp2, 0, arr, tmp1.length, tmp2.length);
            }
        }

        return i;
    }

    public int search(int[] nums, int target) {
        if (nums.length == 1)
            return -1;

        boolean isTarget = false;
        int key = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                key = i;
                isTarget = true;
                break;
            }
        }

        if(!isTarget)
            return -1;

        System.out.println(key);



        return target;
    }
}
