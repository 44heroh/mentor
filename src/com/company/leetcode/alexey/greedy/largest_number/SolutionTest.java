package com.company.leetcode.alexey.greedy.largest_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void largestNumber1() {
        int[] nums = {2,10};
        Solution solution = new Solution();
        System.out.println(solution.largestNumber(nums));
    }

    @Test
    void largestNumber2() {
        int[] nums = {3,30,34,5,9};
        Solution solution = new Solution();
        System.out.println(solution.largestNumber(nums));
    }
}