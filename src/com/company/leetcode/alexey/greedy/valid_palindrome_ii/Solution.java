package com.company.leetcode.alexey.greedy.valid_palindrome_ii;

import java.nio.charset.StandardCharsets;

public class Solution {

    /**
     * 680. Valid Palindrome II
     *
     * Given a string s, return true if the s can be palindrome after deleting at most one character from it.
     *
     * Example 1:
     *
     * Input: s = "aba"
     * Output: true
     *
     * Example 2:
     *
     * Input: s = "abca"
     * Output: true
     * Explanation: You could delete the character 'c'.
     *
     * Example 3:
     *
     * Input: s = "abc"
     * Output: false
     *
     * @param s
     * @return
     */
    public boolean validPalindrome(String s) {
        byte[] chars = s.getBytes(StandardCharsets.ISO_8859_1);
        int l = 0, r = chars.length - 1;

        while (l < r) {
            if (chars[l] != chars[r]) {
                return isPalindrome(chars, l + 1, r) || isPalindrome(chars, l, r - 1);
            }

            l++;
            r--;
        }

        return true;
    }

    private boolean isPalindrome(byte[] chars, int l, int r) {
        while (l < r) {
            if (chars[l] != chars[r]) {
                return false;
            }

            l++;
            r--;
        }

        return true;
    }


}
