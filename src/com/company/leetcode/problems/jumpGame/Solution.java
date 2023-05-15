package com.company.leetcode.problems.jumpGame;

import java.util.Arrays;

public class Solution {

    /**
     * 55. Jump Game https://leetcode.com/problems/jump-game/
     * @param nums
     * @return
     */
    public boolean canJump(int[] nums) {
        int count = nums.length - 1;
        for (int i = count; i >= 0; --i) {
            if(nums[i] + i >= count) {
                count = i;
            }
        }

        return count == 0;
    }

    public boolean canJump1(int[] nums) {
        int jump = 0;
        int i = 0;
        while (jump < nums.length - 1){
            if(nums[jump] == 0)
                return false;

            jump += nums[jump];
            i++;
        }

        return true;
    }
}
