package com.company.leetcode.alexey.greedy.longest_palindrome;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void longestPalindrome1() {
        Solution solution = new Solution();
        String s = "abccccdd";

        System.out.println(solution.longestPalindrome(s));
    }

    @Test
    void longestPalindrome2() {
        Solution solution = new Solution();
        String s = "abb";

        System.out.println(solution.longestPalindrome(s));
    }

    @Test
    void longestPalindrome3() {
        Solution solution = new Solution();
        String s = "ccc";

        System.out.println(solution.longestPalindrome(s));
    }

    @Test
    void longestPalindrome4() {
        Solution solution = new Solution();
        String s = "aaaAaaaa";

        System.out.println(solution.longestPalindrome(s));
    }
}