package com.company.leetcode.problems.missingNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void missingNumber() {
        Solution solution = new Solution();
//        int[] nums = {9,6,4,2,3,5,7,0,1};
        int[] nums = {0, 1};
        System.out.println(solution.missingNumber(nums));
    }
}