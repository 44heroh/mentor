package com.company.leetcode.alexey.assign_cookies;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findContentChildren1() {
        Solution solution = new Solution();
        int[] g = new int[]{1,2,3};
        int[] s = new int[]{1, 1};

        System.out.println(solution.findContentChildren(g, s));
    }

    @Test
    void findContentChildren2() {
        Solution solution = new Solution();
        int[] g = new int[]{1,2};
        int[] s = new int[]{1,2,3};

        System.out.println(solution.findContentChildren(g, s));
    }
}