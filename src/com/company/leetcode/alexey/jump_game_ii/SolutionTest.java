package com.company.leetcode.alexey.jump_game_ii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void jump1() {
        int[] nums = {2,3,1,1,4};

        Solution solution = new Solution();
        System.out.println(solution.jump(nums));
    }

    @Test
    void jump2() {
        int[] nums = {2,3,0,1,4};

        Solution solution = new Solution();
        System.out.println(solution.jump(nums));
    }
}