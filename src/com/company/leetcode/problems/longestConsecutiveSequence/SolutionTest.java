package com.company.leetcode.problems.longestConsecutiveSequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void longestConsecutive() {
        int[] nums = {100,4,200,1,3,2};
        Solution solution = new Solution();
        System.out.println(solution.longestConsecutive(nums));
    }

    @Test
    void longestConsecutive1() {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        Solution solution = new Solution();
        System.out.println(solution.longestConsecutive(nums));
    }

    @Test
    void longestConsecutive2() {
        int[] nums = {9,1,4,7,3,-1,0,5,8,-1,6};
        Solution solution = new Solution();
        System.out.println(solution.longestConsecutive(nums));
    }

    @Test
    void longestConsecutive3() {
        int[] nums = {1,2,0,1};
        Solution solution = new Solution();
        System.out.println(solution.longestConsecutive(nums));
    }
}