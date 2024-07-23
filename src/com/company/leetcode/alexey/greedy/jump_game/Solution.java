package com.company.leetcode.alexey.greedy.jump_game;

public class Solution {

    /**
     * https://leetcode.com/problems/jump-game/
     *
     * 55. Jump Game
     *
     * You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
     *
     * Return true if you can reach the last index, or false otherwise.
     *
     * Example 1:
     *
     * Input: nums = [2,3,1,1,4]
     * Output: true
     * Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
     *
     * Example 2:
     *
     * Input: nums = [3,2,1,0,4]
     * Output: false
     * Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
     *
     * @param nums
     * @return
     */
    public boolean canJump(int[] nums) {
        int n = nums.length, l = 0, r = 0, jumps = 0;

        while (r < n - 1) {

            int newR = 0;
            for (int i = l; i < r + 1; i++) {
                newR = Math.max(newR, i + nums[i]);
            }
            l = r + 1;
            r = newR;
            if (r >= n - 1) return true;
            if (l > r) return false;
            jumps++;
        }


        if (r == n - 1) return true;

        return false;
    }
}
