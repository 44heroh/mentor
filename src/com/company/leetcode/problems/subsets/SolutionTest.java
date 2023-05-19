package com.company.leetcode.problems.subsets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void subsets() {
        int[] nums = {1, 2, 3};
        Solution solution = new Solution();
        System.out.println(solution.subsets(nums));
    }
}