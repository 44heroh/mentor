package com.company.leetcode.problems.findTheIndexOfTheFirstOccurrenceInAString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void strStr() {
        Solution solution = new Solution();
        int result = solution.strStr("sabsadbut", "sad");
        System.out.println(result);
        assertEquals(result, 6);
    }
}