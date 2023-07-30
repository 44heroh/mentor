package com.company.main.tasks.arraySign;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void arraySign() {
        int[] nums = {-1,-2,-3,-4,3,2,1};
        Solution solution = new Solution();
        System.out.println(solution.arraySign(nums));
    }

    @Test
    void arraySign1() {
        int[] nums = {1,5,0,2,-3};
        Solution solution = new Solution();
        System.out.println(solution.arraySign(nums));
    }
}