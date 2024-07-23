package com.company.leetcode.alexey.greedy.remove_duplicate_letters;

import java.util.Stack;

public class Solution {

    /**
     * https://leetcode.com/problems/remove-duplicate-letters/
     *
     * 316. Remove Duplicate Letters
     *
     * Given a string s, remove duplicate letters so that every letter appears once and only once. You must make sure your result is
     * the smallest in lexicographical order
     *  among all possible results.
     *
     * Example 1:
     *
     * Input: s = "bcabc"
     * Output: "abc"
     *
     * Example 2:
     *
     * Input: s = "cbacdcbc"
     * Output: "acdb"
     *
     * @param s
     * @return
     */
    public String removeDuplicateLetters(String s) {
        int n = s.length();
        int[] lastOccur = new int[26];

        for (int i = 0; i < n; i++) {
            lastOccur[s.charAt(i) - 'a'] = i;
        }

        boolean[] inStack = new boolean[26];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
           char ch = s.charAt(i);
            if (inStack[ch - 'a']) {
                continue;
            }
            while (sb.length() > 0 && sb.charAt(sb.length() - 1) > ch && lastOccur[sb.charAt(sb.length() - 1) - 'a'] > i) {
                inStack[sb.charAt(sb.length() - 1) - 'a'] = false;
                sb.deleteCharAt(sb.length() - 1);
            }
            sb.append(ch);
            inStack[ch - 'a'] = true;
        }

        return sb.toString();
    }

    public String removeDuplicateLetters1(String s) {
        int n = s.length();
        int[] lastIndex = new int[26];
        for (int i = 0; i < n; i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        Stack<Integer> stack = new Stack<>();
        boolean[] seen = new boolean[26];

        for (int i = 0; i < n; i++) {
            int cur = s.charAt(i) - 'a';
            if (seen[cur]) continue;

            while (!stack.isEmpty() && cur < stack.peek() && i < lastIndex[stack.peek()]) {
                seen[stack.pop()] = false;
            }

            stack.push(cur);
            seen[cur] = true;
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            stringBuilder.append((char) (stack.pop() + 'a'));
        }

        return stringBuilder.reverse().toString();
    }
}
