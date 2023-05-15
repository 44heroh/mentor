package com.company.leetcode.problems.spiralMatrix;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    /**
     * 54. Spiral Matrix https://leetcode.com/problems/spiral-matrix/
     * @param matrix
     * @return
     */
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int rB = 0, cB = 0;
        int rE = matrix.length - 1, cE = matrix[0].length - 1;

        while (rB <= rE && cB <= cE) {
            for (int i = cB; i <= cE; i++){
                ans.add(matrix[rB][i]);
            }
            rB++;

            for (int i = rB; i <= rE; i++){
                ans.add(matrix[i][cE]);
            }
            cE--;

            if(rE >= rB){
                for (int i = cE; i >= cB; i--){
                    ans.add(matrix[rE][i]);
                }
            }
            rE--;

            if(cE >= cB){
                for (int i = rE; i >= rB; i--){
                    ans.add(matrix[i][cB]);
                }
            }
            cB++;
        }

        return ans;
    }



































    public List<Integer> spiralOrder1(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int rowBegin = 0, colBegin = 0;
        int rowEnd = matrix.length - 1, colEnd = matrix[0].length - 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            for (int i = colBegin; i <= colEnd; i++) {
                ans.add(matrix[rowBegin][i]);
            }
            rowBegin++;

            for (int i = rowBegin; i <= rowEnd; i++) {
                ans.add(matrix[i][colEnd]);
            }
            colEnd--;

            if(rowEnd >= rowBegin) {
                for (int i = colEnd; i >= colBegin; i--) {
                    ans.add(matrix[rowEnd][i]);
                }
            }

            rowEnd--;

            if(colEnd >= colBegin) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    ans.add(matrix[i][colBegin]);
                }
            }
            colBegin++;
        }

        return ans;
    }
}
