package com.company.leetcode.problems.majorityElement;

public class Solution {
    /**
     * 169. Majority Element https://leetcode.com/problems/majority-element/
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                candidate = nums[i];
            }

            if(candidate == nums[i]) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}
