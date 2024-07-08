package com.company.leetcode.alexey.jump_game_ii;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    /**
     * https://leetcode.com/problems/jump-game-ii/
     *
     * 45. Jump Game II
     *
     * You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].
     *
     * Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at nums[i], you can jump to any nums[i + j] where:
     *
     * 0 <= j <= nums[i] and
     * i + j < n
     * Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].
     *
     * Example 1:
     *
     * Input: nums = [2,3,1,1,4]
     * Output: 2
     * Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
     *
     * Example 2:
     *
     * Input: nums = [2,3,0,1,4]
     * Output: 2
     *
     * @param nums
     * @return
     */
    public int jump(int[] nums) {
        if (nums.length == 1) {
            return nums[0] == 0 ? 0 : 1;
        }

        int n = nums.length, curIndex = 0, lastIndex = 0, ans = 0;

        for (int i = 0; i < n; i++) {
            curIndex = Math.max(curIndex, i + nums[i]);

            if (lastIndex == i) {
                lastIndex = curIndex;
                ans++;

                if (lastIndex == n - 1) {
                    return ans;
                }
            }
        }

        return ans;
    }

    public int jump1(int[] nums) {
        int n = nums.length, i = 0, j = 0, min = Integer.MAX_VALUE, count = 0;
        List<Integer> ans = new ArrayList<>();

        for (i = 0; i < n; i++) {
            j = nums[i];
            count = 1;
            while (i + j <= n - 1) {
                j += nums[j];
                count++;
            }
            min = Math.min(min, count);
            ans.add(min);
        }

        System.out.println(ans);

        return count;
    }
}
