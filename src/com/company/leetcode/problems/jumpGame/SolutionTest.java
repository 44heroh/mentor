package com.company.leetcode.problems.jumpGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void canJump() {
        int[] nums = {2,3,1,1,4};
        Solution solution = new Solution();
        System.out.println(solution.canJump(nums));
    }

    @Test
    void canJump1() {
        int[] nums = {2,3,1,0,4};
        Solution solution = new Solution();
        System.out.println(solution.canJump(nums));
    }

    @Test
    void canJump2() {
        int[] nums = {2,0};
        Solution solution = new Solution();
        System.out.println(solution.canJump(nums));
    }

    @Test
    void canJump3() {
        int[] nums = {1,2,3};
        Solution solution = new Solution();
        System.out.println(solution.canJump(nums));
    }

    @Test
    void canJump4() {
        int[] nums = {1,2};
        Solution solution = new Solution();
        System.out.println(solution.canJump(nums));
    }

    @Test
    void canJump5() {
        int[] nums = {2,0,0};
        Solution solution = new Solution();
        System.out.println(solution.canJump(nums));
    }

    @Test
    void canJump6() {
        int[] nums = {1, 3, 2};
        Solution solution = new Solution();
        System.out.println(solution.canJump(nums));
    }

    @Test
    void canJump7() {
        int[] nums = {2, 5, 0, 0};
        Solution solution = new Solution();
        System.out.println(solution.canJump(nums));
    }
}