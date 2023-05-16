package com.company.leetcode.problems.sortColors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void sortColors() {
        int[] nums = {2,0,2,1,1,0};
        Solution solution = new Solution();
        solution.sortColors(nums);
    }
}