package com.company.leetcode.problems.validPalindrome;

import java.util.Arrays;
import java.util.Locale;

public class Solution {
    /**
     * 125. Valid Palindrome https://leetcode.com/problems/valid-palindrome/
     * @param s
     * @return
     */
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^A-Za-z0-9]", "");

        if(s.isEmpty())
            return true;

        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            if(s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }

        return true;
    }
}
