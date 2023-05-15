package com.company.leetcode.problems.spiralMatrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void spiralOrder() {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        Solution solution = new Solution();
        System.out.println(solution.spiralOrder(matrix));
    }
}