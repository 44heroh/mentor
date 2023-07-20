package com.company.main.tasks.firstMissingPositive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void firstMissingPositive() {
        int[] nums = {3,4,-1,1};
        Solution solution = new Solution();
        System.out.println(solution.firstMissingPositive(nums));
    }
}