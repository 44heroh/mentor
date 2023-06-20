package com.company.main.tasks.maxSubarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxSubarray() {
        int[] nums = {-2, 1, 4, -1, 2, -3};
        Solution solution = new Solution();
        System.out.println(solution.maxSubarray(nums));
    }
}