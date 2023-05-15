package com.company.leetcode.problems.mergeIntervals;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void merge() {
        int[][] matrix = {{1,3}, {2,6}, {8,10}, {15,18}};
        Solution solution = new Solution();
        int[][] result = solution.merge(matrix);
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }

    @Test
    void merge1() {
        int[][] matrix = {{1,4}, {4,5}};
        Solution solution = new Solution();
        System.out.println(solution.merge(matrix));
//        System.out.println(Arrays.toString(solution.merge(matrix)));
    }

    @Test
    void merge2() {
        int[][] matrix = {{1,4}, {5,6}};
        Solution solution = new Solution();
        System.out.println(solution.merge(matrix));
//        System.out.println(Arrays.toString(solution.merge(matrix)));
    }

    @Test
    void merge3() {
        int[][] matrix = {{1,4}, {0,6}};
        Solution solution = new Solution();
        System.out.println(solution.merge(matrix));
//        System.out.println(Arrays.toString(solution.merge(matrix)));
    }

    @Test
    void merge4() {
        int[][] matrix = {{1,4}, {0,4}};
        Solution solution = new Solution();
        System.out.println(solution.merge(matrix));
//        System.out.println(Arrays.toString(solution.merge(matrix)));
    }

    @Test
    void merge5() {
        int[][] matrix = {{1,4}, {0,0}};
        Solution solution = new Solution();
        System.out.println(solution.merge(matrix));
//        System.out.println(Arrays.toString(solution.merge(matrix)));
    }
}