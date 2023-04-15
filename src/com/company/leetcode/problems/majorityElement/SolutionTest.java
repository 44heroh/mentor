package com.company.leetcode.problems.majorityElement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void majorityElement() {
        int[] nums = new int[]{2,2,1,1,1,2,2};
        Solution solution = new Solution();
        assertEquals(nums[0], solution.majorityElement(nums));
    }

}