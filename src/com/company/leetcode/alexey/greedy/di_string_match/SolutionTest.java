package com.company.leetcode.alexey.greedy.di_string_match;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SolutionTest {

    @Test
    void diStringMatch1() {
        String s = "IDID";

        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.diStringMatch(s)));
    }
}