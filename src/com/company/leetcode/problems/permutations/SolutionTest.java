package com.company.leetcode.problems.permutations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void permute() {
        int[] nums = {1, 2, 3};
        Solution solution = new Solution();
        System.out.println(solution.permute(nums).toString());
    }
}