package com.company.leetcode.problems.numberOf1Bits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void hammingWeight() {
        int n = 111111101;
        Solution solution = new Solution();
        System.out.println(solution.hammingWeight(n));
    }
}