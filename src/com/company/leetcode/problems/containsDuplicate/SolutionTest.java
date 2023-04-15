package com.company.leetcode.problems.containsDuplicate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void containsDuplicate() {
        int[] nums = {1,2,3,4};
        Solution solution = new Solution();
        System.out.println(solution.containsDuplicate(nums));
    }
}