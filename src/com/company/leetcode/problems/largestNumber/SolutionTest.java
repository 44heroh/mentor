package com.company.leetcode.problems.largestNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void largestNumber() {
        int[] nums = {3, 30, 34, 5, 9};
        Solution solution = new Solution();
        System.out.println(solution.largestNumber(nums));
    }
}