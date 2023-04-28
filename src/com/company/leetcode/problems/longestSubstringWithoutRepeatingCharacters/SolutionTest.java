package com.company.leetcode.problems.longestSubstringWithoutRepeatingCharacters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void lengthOfLongestSubstring() {
        String s = "abcabcbb";
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring(s));
    }

    @Test
    void lengthOfLongestSubstring1() {
        String s = "bbbbb";
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring(s));
    }

    @Test
    void lengthOfLongestSubstring2() {
        String s = "pwwkew";
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring(s));
    }

    @Test
    void lengthOfLongestSubstring3() {
        String s = "abba";
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring(s));
    }

    @Test
    void lengthOfLongestSubstring4() {
        String s = "aab";
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring(s));
    }
}