package com.company.leetcode.problems.rotateImage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void rotate() {
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        Solution solution = new Solution();
//        solution.rotate(matrix);
        solution.rotate90Right(matrix);
        solution.rotate180Y(matrix);
        solution.rotate180X(matrix);
        solution.rotate90Left(matrix);
    }
}