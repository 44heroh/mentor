package com.company.leetcode.alexey.greedy.house_robber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void rob1() {
        int[] nums = {1,2,3,1};
        this.run(nums);
    }

    @Test
    void rob2() {
        int[] nums = {2,7,9,3,1};
        this.run(nums);
    }

    @Test
    void rob40() {
        int[] nums = {2,1,1,2};
        this.run(nums);
    }

    void run(int[] nums) {
        Solution solution = new Solution();
        System.out.println(solution.rob(nums));
    }
}