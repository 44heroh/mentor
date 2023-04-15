package com.company.leetcode.problems.moveZeroes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void moveZeroes() {
        Solution solution = new Solution();
//        int[] nums = {0,1,0,3,12};
        int[] nums = {0,0,1};
        solution.moveZeroes(nums);
    }
}