package com.company.leetcode.problems.twoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    /**
     * 1. Two Sum https://leetcode.com/problems/two-sum/
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum1(int[] nums, int target) {
        if(nums.equals(null))
            return new int[]{};

        int left = 0, right = nums.length - 1;
        while (right > left){
            int currSum = nums[left] + nums[right];
            while(left < right){
                currSum = nums[left] + nums[right];
                if(currSum == target){
                    return new int[]{left, right};
                }
                left++;
            }

            left = 0;
            if(nums[left] + nums[right] != target){
                right--;
            }
        }

        return new int[]{};
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
