package com.company.leetcode.problems.setMatrixZeroes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void setZeroes() {
        int[][] matrix = {{1,1,1}, {1,0,1}, {1,1,1}};
        Solution solution = new Solution();
        solution.setZeroes(matrix);
    }

    @Test
    void setZeroes1() {
        int[][] matrix = {{0,1,2,0}, {3,4,5,2}, {1,3,1,5}};
        Solution solution = new Solution();
        solution.setZeroes(matrix);
    }

    @Test
    void setZeroes2() {
        int[][] matrix = {{0,1}};
        Solution solution = new Solution();
        solution.setZeroes(matrix);
    }
}