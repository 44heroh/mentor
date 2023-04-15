package com.company.leetcode.problems.singleNumber;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {

    public class Number {

        public int value;
        public int priority;

        public Number() {

        }

        public Number(int value) {
            this.value = value;
        }
    }

    /**
     * 136. Single Number https://leetcode.com/problems/single-number/
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(map.get(nums[i]) == null) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        Integer key = nums[0];
        int min = Integer.MAX_VALUE;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(map.get(entry.getKey()) < min) {
                min = map.get(entry.getKey());
                key = entry.getKey();
            }
        }


        return (int) key;
    }
}
