package com.company.leetcode.alexey.greedy.assign_cookies;

import java.util.Arrays;

public class Solution {

    /**
     * https://leetcode.com/problems/assign-cookies/
     *
     * 455. Assign Cookies
     *
     * Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.
     *
     * Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with; and each cookie j has a size s[j].
     * If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content.
     * Your goal is to maximize the number of your content children and output the maximum number.
     *
     * Input: g = [1,2,3], s = [1,1]
     * Output: 1
     *
     * Input: g = [1,2], s = [1,2,3]
     * Output: 2
     *
     * @param g
     * @param s
     * @return
     */
    public int findContentChildren(int[] g, int[] s) {
        int n = g.length, m = s.length, ans = 0;
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0, j = 0;

        while (i >= 0 && i < n && j >= 0 && j < m) {
            if (s[j] >= g[i]) {
                i++;
                ans++;
            }
            j++;
        }

        return ans;
    }
}
