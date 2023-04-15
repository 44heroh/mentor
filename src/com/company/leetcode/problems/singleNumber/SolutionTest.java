package com.company.leetcode.problems.singleNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void singleNumber() {
//        int[] nums = {2,2,1};
        int[] nums = {4,1,2,1,2};
//        int[] nums = {1};
        Solution solution = new Solution();
        System.out.println(solution.singleNumber(nums));
    }
}