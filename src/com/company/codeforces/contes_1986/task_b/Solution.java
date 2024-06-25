package com.company.codeforces.contes_1986.task_b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {

    /**
     * https://codeforces.com/contest/1986/problem/B
     * @param args
     */
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] nm = getArrayIntFromString(reader.readLine(), null);
        int n = nm[0], m = nm[1];

        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            matrix[i] = getArrayIntFromString(reader.readLine(), null);
        }

        int[][] ans = solve(n, m, matrix);
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
    }

    private static int[][] solve(int n, int m, int[][] matrix) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                List<Integer> cellsAroundCell = cellInspection(matrix, i, j);
                if (cellsAroundCell != null) {
                    matrix[i][j] = cellsAroundCell.get(cellsAroundCell.size() - 2);
                }

            }
        }

//        for (int i = 0; i < n; i++) {
//            System.out.println(Arrays.toString(matrix[i]));
//        }

//        for (int i = 0; i < n; i++) {
//            System.out.println(Arrays.toString(maxMatrix[i]));
//        }

        return matrix;
    }

    private static List<Integer> cellInspection(int[][] matrix, int x, int y) {
        List<Integer> ans = new ArrayList<>();
        int rows = matrix.length, cols = matrix[0].length;
        int[][] directions = {{0, 0}, {1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        for (int[] direction : directions) {
            int r = x + direction[0];
            int c = y + direction[1];
            if(r >= 0 && r < rows && c >= 0 && c < cols) {
                ans.add(matrix[r][c]);
            }
        }

        Collections.sort(ans);
        int size = ans.size();
        int index = ans.indexOf(matrix[x][y]);

        return index == size - 1 ? ans : null;
    }

    private static int[] getArrayIntFromString(String s, String regex) throws Exception {
        if (s == null || s.equals("") || s.length() == 0) {
            throw new Exception("s is null");
        }

        if (regex == null || regex.equals("") || regex.length() == 0) {
            regex = " ";
        }

        return Arrays.stream(s.split(regex)).mapToInt(Integer::parseInt).toArray();
    }
}
