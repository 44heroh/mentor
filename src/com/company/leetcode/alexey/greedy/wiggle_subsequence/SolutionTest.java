package com.company.leetcode.alexey.greedy.wiggle_subsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void wiggleMaxLength1() {
        int[] nums = {1,7,4,9,2,5};
        Solution solution = new Solution();
        System.out.println(solution.wiggleMaxLength(nums));
    }

    @Test
    void wiggleMaxLength2() {
        int[] nums = {1,17,5,10,13,15,10,5,16,8};
        Solution solution = new Solution();
        System.out.println(solution.wiggleMaxLength(nums));
    }

    @Test
    void wiggleMaxLength3() {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        Solution solution = new Solution();
        System.out.println(solution.wiggleMaxLength(nums));
    }

    @Test
    void wiggleMaxLength4() {
        int[] nums = {1,1,7,4,9,2,5};
        Solution solution = new Solution();
        System.out.println(solution.wiggleMaxLength(nums));
    }

    @Test
    void wiggleMaxLength5_4() {
        int[] nums = {0, 0};
        Solution solution = new Solution();
        System.out.println(solution.wiggleMaxLength(nums));
    }

    @Test
    void wiggleMaxLength6_9() {
        int[] nums = {3,3,3,2,5};
        Solution solution = new Solution();
        System.out.println(solution.wiggleMaxLength(nums));
    }
}