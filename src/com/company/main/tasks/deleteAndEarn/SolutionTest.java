package com.company.main.tasks.deleteAndEarn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void deleteAndEarn() {
        int[] nums = {3,4,2};
        Solution solution = new Solution();
        int ans = solution.deleteAndEarn(nums);
        System.out.println(ans);
        assertEquals(ans, 6);
    }

    @Test
    void deleteAndEarn1() {
        int[] nums = {2,2,3,3,3,4};
        Solution solution = new Solution();
        int ans = solution.deleteAndEarn(nums);
        System.out.println(ans);
        assertEquals(ans, 9);
    }
}