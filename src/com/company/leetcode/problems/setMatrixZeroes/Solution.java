package com.company.leetcode.problems.setMatrixZeroes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    /**
     * 73. Set Matrix Zeroes https://leetcode.com/problems/set-matrix-zeroes/
     * @param matrix
     */
    public void setZeroes(int[][] matrix) {
        boolean c0 = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    if (j == 0) {
                        c0 = true;
                        continue;
                    }
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                for (int j = 1; j < matrix.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (c0) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }


    public void setZeroes1(int[][] matrix) {

        List<int[]> zerosList = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    zerosList.add(new int[]{i, j});
                }
            }
        }

        int x = -1, y = -1;
        int currenX = -1, currentY = -1;
        for (int[] arr : zerosList){
            currenX = arr[0];
            currentY = arr[1];
            if(x != currenX && currenX < matrix.length){
                for (int i = 0; i < matrix[0].length; i++){
                    matrix[currenX][i] = 0;
                }
                x = currenX;
            }

            if(y != currentY && currentY < matrix[0].length){
                for (int i = 0; i < matrix.length; i++){
                    matrix[i][currentY] = 0;
                }
                y = currentY;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
