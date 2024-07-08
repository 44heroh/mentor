package com.company.leetcode.alexey.di_string_match;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void diStringMatch1() {
        String s = "IDID";

        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.diStringMatch(s)));
    }
}