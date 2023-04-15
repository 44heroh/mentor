package com.company.leetcode.problems.powerOfThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isPowerOfThree() {
//        int n = 27;
//        int n = -1;
//        int n = 243;
//        int n = 45;
        int n = 19682;
        Solution solution = new Solution();
        System.out.println(solution.isPowerOfThree(n));
    }
}