package com.company.leetcode.problems.validSudoku;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    /**
     * 36. Valid Sudoku https://leetcode.com/problems/valid-sudoku/
     * @param board
     * @return
     */
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                if(board[i][j] != '.' && !valid(board, i, j)) return false;
            }
        }

        return true;
    }

    boolean valid(char[][] board, int i, int j) {
        for (int col = 0; col < board.length; col++){
            if(col != j && board[i][j] == board[i][col]) return false;
        }

        for (int row = 0; row < board.length; row++){
            if(row != i && board[i][j] == board[row][j]) return false;
        }

        int row = (i / 3) * 3;
        int col = (j / 3) * 3;
        for (int r = row; r < row + 3; r++){
            for (int c = col; c < col + 3; c++){
                if(i != r && c != j && board[i][j] == board[r][c]) return false;
            }
        }

        return true;
    }





    public boolean isValidSudoku1(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && !valid(board, i, j)) {
                    return false;
                }
            }
        }

        return true;
    }

    boolean valid1(char[][] board, int i, int j) {
        // check in a single row
        for (int col = 0; col < 9; col++) {
            if (col != j && board[i][col] == board[i][j]) return false;
        }

        // check in a single col
        for (int row = 0; row < 9; row++) {
            if (row != i && board[row][j] == board[i][j]) return false;
        }

        // check in a 3x3 sub-box
        int row = (i/3) * 3;                              // this is the row start of 3x3 box
        int col = (j/3) * 3;                              // this is the col start of 3x3 box
        for (int r = row; r < row+3; r++) {
            for (int c = col; c < col+3; c++) {
                if (i != r && c != j && board[i][j] == board[r][c]) {
                    return false;
                }
            }
        }

        return true;
    }



    public boolean isValidSudoku2(char[][] board) {
        if(board == null)
            return true;

        int[][] thirds = new int[9][9];
        int[] column = new int[9];
        int[] row = new int[9];
        int countY = 0;
        int countX = 0;
        for (int i = 0; i < board.length; i++){
            row = new int[9];
            if(i > 0)
                if(i % 3 == 0)
                    countX = i;
                else
                    countX -= 2;
            if(countY == 9)
                countY = 0;
            for (int j = 0; j < board[i].length; j++){
                if(board[i][j] != '.')
                    row[j] = Character.getNumericValue(board[i][j]);

                if(j > 0 && j % 3 == 0){
                    countX++;
                    countY -= 3;
                }
                if((i >= 0 || i % 3 != 0) || (j >= 0 || j % 3 != 0)){
                    thirds[countX][countY] = Character.getNumericValue(board[i][j]) == -1 ? 0 : Character.getNumericValue(board[i][j]);
                    countY++;
                }
            }
            System.out.println(Arrays.toString(row));
            if(!isUnique(row)){
                return false;
            }
        }

        System.out.println();

        for (int k = 0; k < board.length; k++){
            column = new int[9];
            for (int l = 0; l < board[k].length; l++){
                if(board[l][k] != '.')
                    column[l] = Character.getNumericValue(board[l][k]);
            }
            System.out.println(Arrays.toString(column));
            if(!isUnique(column)){
                return false;
            }
        }

        System.out.println();


        for (int i = 0; i < thirds.length; i++){
            System.out.println(Arrays.toString(thirds[i]));
            if(!isUnique(thirds[i])){
                return false;
            }
        }

        return true;
    }

    public boolean isUnique(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                if(!map.containsKey(arr[i])){
                    map.put(arr[i], 1);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
