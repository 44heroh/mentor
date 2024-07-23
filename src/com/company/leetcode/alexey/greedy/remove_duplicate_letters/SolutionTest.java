package com.company.leetcode.alexey.greedy.remove_duplicate_letters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void removeDuplicateLetters1() {
        String s = "bcabc";
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicateLetters(s));
    }

    @Test
    void removeDuplicateLetters2() {
        String s = "cbacdcbc";
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicateLetters(s));
    }
}