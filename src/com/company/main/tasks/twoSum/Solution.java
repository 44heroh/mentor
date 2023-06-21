package com.company.main.tasks.twoSum;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    /**
     * 1. Two Sum https://leetcode.com/problems/two-sum/
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
               return new int[]{i, map.get(i)};
            }
        }

        return null;
    }
}
