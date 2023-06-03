package com.company.leetcode.problems.surroundedRegions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    /**
     * 130. Surrounded Regions https://leetcode.com/problems/surrounded-regions/
     * @param board
     */

    final char X = 'X';
    final char O = 'O';
    final char tmp = 1;
    char[][] arr;
    public void solve(char[][] board) {
        if(board == null || board.length == 0) return;
        arr = board;
        int rowsLen = board.length;
        int colsLen = board[0].length;

        for (int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }

        for (int i = 0; i < colsLen; i++) {
            if(board[0][i] == O)
                dfs(0, i);
            if(board[rowsLen - 1][i] == O)
                dfs(rowsLen - 1, i);
        }

        for (int i = 0; i < rowsLen; i++) {
            if(board[i][0] == O)
                dfs(i, 0);
            if(board[i][colsLen - 1] == O)
                dfs(i, colsLen - 1);
        }

        for (int i = 0; i < rowsLen; i++) {
            for (int j = 0; j < colsLen; j++) {
                if(board[i][j] == O)
                    board[i][j] = X;
                if(board[i][j] == tmp)
                    board[i][j] = O;
            }
        }

        System.out.println();
        for (int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
        System.out.println();
    }

    private void dfs(int i, int j) {
        if(i < 0 || i >= arr.length) return;
        if(j < 0 || j >= arr[0].length) return;
        if(arr[i][j] == X || arr[i][j] == tmp) return;
        arr[i][j] = tmp;
        dfs(i, j + 1);
        dfs(i, j - 1);
        dfs(i + 1, j);
        dfs(i - 1, j);
    }

    public void solve1(char[][] board) {

        for (int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }

        char[] chars = {'X', 'O'};
        boolean stop = false;
        for (int i = 0; i < board.length; i++) {
            if(stop)
                break;
            for (int j = 0; j < board[0].length; j++) {
                if (i > 0 &&
                        i < board.length - 1 &&
                        j > 0 &&
                        j < board[0].length - 1) {
                    char current = 'O';
                    char opposite = 'X';
                    if (board[i][j] != 'O') {
                        current = opposite;
                        opposite = 'X';
                    }
                    if(board[i][j] == current){
                        if(board[i][j + 1] == opposite ||
                                board[i][j - 1] == opposite ||
                                board[i + 1][j] == opposite ||
                                board[i - 1][j] == opposite){
                            if(board[i][j + 1] == current || board[i + 1][j] == current || board[i][j - 1] == current || board[i - 1][j] == current) {
                                dfs1(board, i, j, current, opposite);
                                stop = true;
                                break;
                            } else {
                                board[i][j] = opposite;
                            }
                        }
                    }
                }

            }
        }

        System.out.println();
        for (int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
    }

    private void dfs1(char[][] board, int i, int j, char current, char opposite) {
        board[i][j] = opposite;
        if (i > 0 &&
                i < board.length - 1 &&
                j > 0 &&
                j < board[0].length - 1
        ) {
            if (board[i][j + 1] == current) {
                dfs1(board, i, j + 1, current, opposite);
            }

            if (board[i + 1][j] == current) {
                dfs1(board, i + 1, j, current, opposite);
            }

            if (board[i][j - 1] == current) {
                dfs1(board, i, j - 1, current, opposite);
            }

            if (board[i - 1][j] == current) {
                dfs1(board, i - 1, j, current, opposite);
            }
        }
    }
}
