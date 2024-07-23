package com.company.leetcode.alexey.greedy.jump_game;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void canJump1() {
        int[] nums = {2,3,1,1,4};

        Solution solution = new Solution();
        System.out.println(solution.canJump(nums));
    }

    @Test
    void canJump2() {
        int[] nums = {3,2,1,0,4};

        Solution solution = new Solution();
        System.out.println(solution.canJump(nums));
    }

    @Test
    void canJump3() {
        int[] nums = {2,0};

        Solution solution = new Solution();
        System.out.println(solution.canJump(nums));
    }
}