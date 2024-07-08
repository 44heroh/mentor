package com.company.leetcode.alexey.array_partition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void arrayPairSum1() {
        int[] nums = new int[]{1, 4, 3, 2};
        Solution solution = new Solution();

        System.out.println(solution.arrayPairSum(nums));
    }

    @Test
    void arrayPairSum2() {
        int[] nums = new int[]{6,2,6,5,1,2};
        Solution solution = new Solution();

        System.out.println(solution.arrayPairSum(nums));
    }
}