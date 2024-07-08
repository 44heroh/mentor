package com.company.leetcode.alexey.valid_palindrome_ii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void validPalindrome1() {
        String s = "aba";

        Solution solution = new Solution();
        System.out.println(solution.validPalindrome(s));
    }

    @Test
    void validPalindrome2() {
        String s = "abca";

        Solution solution = new Solution();
        System.out.println(solution.validPalindrome(s));
    }

    @Test
    void validPalindrome3() {
        String s = "abc";

        Solution solution = new Solution();
        System.out.println(solution.validPalindrome(s));
    }

    @Test
    void validPalindrome4() {
        String s = "abccccbaa";

        Solution solution = new Solution();
        System.out.println(solution.validPalindrome(s));
    }

    @Test
    void validPalindrome5() {
        String s = "tebbem";

        Solution solution = new Solution();
        System.out.println(solution.validPalindrome(s));
    }
}