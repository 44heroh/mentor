package com.company.leetcode.problems.maximumSubarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxSubArray() {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        Solution solution = new Solution();
        System.out.println(solution.maxSubArray(nums));
    }

    @Test
    void maxSubArray1() {
        int[] nums = {-2,1};
        Solution solution = new Solution();
        System.out.println(solution.maxSubArray(nums));
    }

    @Test
    void maxSubArray2() {
        int[] nums = {-2,-1};
        Solution solution = new Solution();
        System.out.println(solution.maxSubArray(nums));
    }

    @Test
    void maxSubArray3() {
        int[] nums = {-1,-2};
        Solution solution = new Solution();
        System.out.println(solution.maxSubArray(nums));
    }
}