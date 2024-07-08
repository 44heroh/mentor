package com.company.leetcode.alexey.di_string_match;

public class Solution {

    /**
     * https://leetcode.com/problems/di-string-match/
     *
     * 942. DI String Match
     *
     * A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:
     *
     * s[i] == 'I' if perm[i] < perm[i + 1], and
     * s[i] == 'D' if perm[i] > perm[i + 1].
     * Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return any of them.
     *
     * Example 1:
     *
     * Input: s = "IDID"
     * Output: [0,4,1,3,2]
     *
     * Example 2:
     *
     * Input: s = "III"
     * Output: [0,1,2,3]
     *
     * Example 3:
     *
     * Input: s = "DDI"
     * Output: [3,2,0,1]
     *
     * @param s
     */
    public int[] diStringMatch(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length, low = 0, high = n;
        int[] perm = new int[n + 1];

        for (int i = 0; i < n; i++) {
            if (chars[i] == 'I') {
                perm[i] = low;
                low++;
            } else if (chars[i] == 'D') {
                perm[i] = high;
                high--;
            }
        }
        perm[n] = high;

        return perm;
    }

    private void swap(int[] perm, int x, int y) {
        int tmp = perm[x];
        perm[x] = perm[y];
        perm[y] = tmp;
    }
}
