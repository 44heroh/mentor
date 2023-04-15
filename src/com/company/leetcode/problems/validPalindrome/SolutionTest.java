package com.company.leetcode.problems.validPalindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isPalindrome() {
//        String s = "A man, a plan, a canal: Panama";
//        String s = "race a car";
//        String s = ".,";
//        String s = "aa";
        String s = "ab";
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(s));
    }
}