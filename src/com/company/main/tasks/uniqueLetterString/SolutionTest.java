package com.company.main.tasks.uniqueLetterString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void uniqueLetterString() {
        String s = "ABC";
        Solution solution = new Solution();
        System.out.println(solution.uniqueLetterString(s));
    }

    @Test
    void uniqueLetterString1() {
        String s = "LEETCODE";
        Solution solution = new Solution();
        System.out.println(solution.uniqueLetterString(s));
    }

    @Test
    void uniqueLetterString2() {
        String s = "ABA";
        Solution solution = new Solution();
        System.out.println(solution.uniqueLetterString(s));
    }
}