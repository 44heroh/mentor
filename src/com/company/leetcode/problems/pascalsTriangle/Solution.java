package com.company.leetcode.problems.pascalsTriangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    /**
     * 118. Pascal's Triangle https://leetcode.com/problems/pascals-triangle/
     * @param nums
     * @return
     */
    public List<List<Integer>> generate(int numRows) {
        int[][] pascal = new int[numRows][];
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(int i = 0; i < numRows; i++){
            int[] row = new int[i + 1];
            ArrayList<Integer> rowList = new ArrayList<Integer>();
            row[0] = 1;
            row[i] = 1;
            rowList.add(row[0]);
            for(int j = 1; j < i; j++){
                row[j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                rowList.add(row[j]);
            }
            if(i + 1 > 1)
                rowList.add(row[i]);
            pascal[i] = row;
            res.add(rowList);
        }

        return res;
    }
}
