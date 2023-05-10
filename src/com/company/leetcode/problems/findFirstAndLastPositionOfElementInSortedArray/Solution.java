package com.company.leetcode.problems.findFirstAndLastPositionOfElementInSortedArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Solution {

    /**
     * 34. Find First and Last Position of Element in Sorted Array https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
     * @param nums
     * @param target
     * @return
     */
    public int[] searchRange(int[] nums, int target) {
        if(nums.equals(null))
            return new int[]{0, 0};

        int[] arr = new int[2];
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == target && count == 0){
                arr[0] = i;
                count++;
            }
            if(i < nums.length - 1){
                if(nums[i + 1] != target && count == 1){
                    arr[1] = i;
                    count++;
                }
            } else if(i + 1 == nums.length && nums[i] == target && count == 1){
                arr[1] = i;
            }
        }

        if(count == 0)
            return new int[]{-1, -1};

        return arr;
//        return list.stream()
//                .mapToInt(Integer::intValue)
//                .toArray();
    }
}
