package com.company.leetcode.problems.reverseBits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reverseBits() {
        int n = 1010;
        Solution solution = new Solution();
        System.out.println(1010 & 1);
        System.out.println(505 & 1);
        System.out.println(1100 & 1);
        System.out.println(62 & 1);
        System.out.println(solution.reverseBits(n));
    }
}