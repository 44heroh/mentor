package com.company.leetcode.problems.uniquePaths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void uniquePaths() {
        int m = 3, n = 7;
        Solution solution= new Solution();
        System.out.println(solution.uniquePaths(m, n));
    }

    @Test
    void uniquePaths1() {
        int m = 1, n = 2;
        Solution solution= new Solution();
        System.out.println(solution.uniquePaths(m, n));
    }
}