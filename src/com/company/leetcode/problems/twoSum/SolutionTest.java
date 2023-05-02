package com.company.leetcode.problems.twoSum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void twoSum() {
        int[] nums = {2,7,11,15};
        int target = 9;
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }

    @Test
    void twoSum1() {
        int[] nums = {10,-1,-18,-19};
        int target = -19;
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }
}