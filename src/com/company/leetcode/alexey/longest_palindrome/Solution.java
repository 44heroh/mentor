package com.company.leetcode.alexey.longest_palindrome;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    /**
     * https://leetcode.com/problems/longest-palindrome/
     *
     * 409. Longest Palindrome
     *
     * Given a string s which consists of lowercase or uppercase letters, return the length of the longest
     * palindrome
     *  that can be built with those letters.
     *
     * Letters are case sensitive, for example, "Aa" is not considered a palindrome.
     *
     * Example 1:
     * Input: s = "abccccdd"
     * Output: 7
     * Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
     *
     * Example 2:
     * Input: s = "a"
     * Output: 1
     * Explanation: The longest palindrome that can be built is "a", whose length is 1.
     *
     * @param s
     * @return
     */
    public int longestPalindrome(String s) {
        int n = s.length(), count = 0;
//        s = s.toLowerCase();

        if (n == 1) {
            return 1;
        }

        int[] chars = new int[58];

        int l = 0, r = n - 1;

        while (l <= r) {
            char curLeft = s.charAt(l);
            chars[curLeft - 'A']++;

            if (l != r) {
                char curRight = s.charAt(r);
                chars[curRight - 'A']++;
            }

            l++;
            r--;
        }

//        for (int i = 0; i < n; i++) {
//            char cur = s.charAt(i);
//            chars[cur - 'A']++;
//        }

        int res = 0;
        boolean hasOdd = false;

        for (int countCh : chars) {
            if (countCh % 2 == 0) {
                res += countCh;
            } else {
                res += countCh - 1;
                hasOdd = true;
            }
        }

        return hasOdd ? res + 1: res;
    }

    public int longestPalindrome1(String s) {
        int n = s.length(), count = 0;
//        s = s.toLowerCase();

        if (n == 1) {
            return 1;
        }

        Map<Character, Integer> map = new HashMap<>();
        int l = 0, r = n - 1;

        while (l <= r) {
            char curLeft = s.charAt(l);
            addUpdateMap(map, curLeft);

            if (l != r) {
                char curRight = s.charAt(r);
                addUpdateMap(map, curRight);
            }

            l++;
            r--;
        }

        System.out.println(map);

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int cur = entry.getValue();
            if (cur % 2 <= 1) {
                count += cur / 2;
            }
        }

        count *= 2;

        return count < n ? count + 1 : count;
    }

    private void addUpdateMap(Map<Character, Integer> map, char character) {
        if (!map.containsKey(character)) {
            map.put(character, 1);
        } else {
            map.put(character, map.get(character) + 1);
        }
    }
}
