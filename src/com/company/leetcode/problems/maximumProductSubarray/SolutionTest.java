package com.company.leetcode.problems.maximumProductSubarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxProduct() {
        int[] nums = {2,3,-2,4};
        Solution solution = new Solution();
        System.out.println(solution.maxProduct(nums));
    }

    @Test
    void maxProduct1() {
        int[] nums = {-2,0,-1};
        Solution solution = new Solution();
        System.out.println(solution.maxProduct(nums));
    }

    @Test
    void maxProduct2() {
        int[] nums = {0, 2};
        Solution solution = new Solution();
        System.out.println(solution.maxProduct(nums));
    }
}