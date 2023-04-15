package com.company.leetcode.problems.validAnagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isAnagram() {
        Solution solution = new Solution();
        String s = "anagram";
        String t = "nagaram";
//        String s = "aacc";
//        String t = "ccac";
        assertEquals(true, solution.isAnagram(s, t));
    }
}