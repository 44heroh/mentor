package com.company.leetcode.problems.wordSearch;

import java.util.Arrays;

public class Solution {

    /**
     * 79. Word Search https://leetcode.com/problems/word-search/
     * @param board
     * @param word
     * @return
     */
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        char[] chars = word.toCharArray();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(dfs(board, chars, i, j, 0)){
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(char[][] board, char[] chars, int i, int j, int k) {
        int m = board.length;
        int n = board[0].length;
        if (i < 0 || j < 0 || i >= m || j >= n) {
            return false;
        } else if(board[i][j] == chars[k]) {
            char tmp = board[i][j];
            board[i][j] = '#';
            if(k == chars.length - 1) {
                return true;
            } else if(dfs(board, chars, i, j + 1, k + 1) || dfs(board, chars, i + 1, j, k + 1) || dfs(board, chars, i, j - 1, k + 1) || dfs(board, chars, i - 1, j, k + 1)) {
                return true;
            }
            board[i][j] = tmp;
        }

        return false;
    }


//    public int index;
//
//    public boolean exist0(char[][] board, String word) {
//        if((board.length * board[0].length) < word.length())
//            return false;
//        char[] chars = word.toCharArray();
//        for (int x = 0; x < board.length; x++) {
//            for (int y = 0; y < board[0].length; y++) {
//                if(index == chars.length)
//                    break;
//                index = 0;
//                if(chars[index] == board[x][y]) {
//                    index = 1;
//                    if(index == chars.length)
//                        break;
//                    if (y < board[0].length - 1 && chars[index] == board[x][y + 1]) {
//                        transientToPoint(board, chars, x, y + 1, x, y);
//                        if(index == chars.length)
//                            break;
//                    }
//                    index = 1;
//                    if (x < board.length - 1 && chars[index] == board[x + 1][y]) {
//                        transientToPoint(board, chars, x + 1, y, x, y);
//                        if(index == chars.length)
//                            break;
//                    }
//                    index = 1;
//                    if (y > 0 && chars[index] == board[x][y - 1]) {
//                        transientToPoint(board, chars, x, y - 1, x, y);
//                        if(index == chars.length)
//                            break;
//                    }
//                    index = 1;
//                    if (x > 0 && chars[index] == board[x - 1][y]) {
//                        transientToPoint(board, chars, x - 1, y, x, y);
//                        if(index == chars.length)
//                            break;
//                    }
//                }
//            }
//        }
//
//        return index == chars.length;
//    }
//
//    private void recursiveExist0(char[][] board, char[] chars, int x, int y, int prevX, int prevY) {
//        if(index == chars.length)
//            return;
//
//        if (y < board[0].length - 1 && chars[index] == board[x][y + 1]) {
//            transientToPoint(board, chars, x, y + 1, x, y);
//            if(index == chars.length)
//                return;
//        }
//        if (x < board.length - 1 && chars[index] == board[x + 1][y]) {
//            transientToPoint(board, chars, x + 1, y, x, y);
//            if(index == chars.length)
//                return;
//        }
//        if (y > 0 && chars[index] == board[x][y - 1] && prevY != y - 1) {
//            transientToPoint(board, chars, x, y - 1, x, y);
//            if(index == chars.length)
//                return;
//        }
//        if (x > 0 && chars[index] == board[x - 1][y] && prevX != x - 1 ) {
//            transientToPoint(board, chars, x - 1, y, x, y);
//            if(index == chars.length)
//                return;
//        }
//
//        return;
//    }
//
//    private void transientToPoint(char[][] board, char[] chars, int x, int y, int prevX, int prevY){
//        index++;
//        recursiveExist0(board, chars, x, y, prevX, prevY);
//    }

//    public boolean exist1(char[][] board, String word) {
//
//        char[] chars = word.toCharArray();
//        index = 0;
//        boolean isStop = false;
//        boolean result = false;
//        int m = board.length;
//        int n = board[0].length;
//        for (int x = 0; x < board.length; x++) {
//            if(isStop && x == board.length - 1)
//                break;
//            for (int y = 0; y < board[0].length; y++) {
//                if(chars.length == 1 && chars[index] == board[x][y]){
//                    result = true;
//                    isStop = true;
//                    break;
//                }
//                if(chars[index] == board[x][y]){
//                    index = 0;
//                    if (y < board[0].length - 1 && chars[index + 1] == board[x][y + 1]) {
//                        index++;
//                        result = recursiveExist(board, chars, x, y + 1, x, y);
//                        isStop = true;
//                        if(index == chars.length - 1)
//                            break;
//                    }
//                    if (y > 0 && chars[index + 1] == board[x][y - 1]) {
//                        index++;
//                        result = recursiveExist(board, chars, x, y - 1, x, y);
//                        isStop = true;
//                        if(index == chars.length - 1)
//                            break;
//                    }
//                    if (x < board.length - 1 && chars[index + 1] == board[x + 1][y]) {
//                        index++;
//                        result = recursiveExist(board, chars, x + 1, y, x, y);
//                        isStop = true;
//                        if(index == chars.length - 1)
//                            break;
//                    }
//                    if (x > 0 && chars[index + 1] == board[x - 1][y]) {
//                        index++;
//                        result = recursiveExist(board, chars, x - 1, y, x, y);
//                        isStop = true;
//                        if(index == chars.length - 1)
//                            break;
//                    }
//                    if(x == board.length - 1 && y == board[0].length - 1 && (m * n) >= chars.length) {
//                        result = true;
//                        isStop = true;
//                        break;
//                    }
//                }
//            }
//        }
//
//        return index == chars.length - 1;
//    }

//    private boolean recursiveExist1(char[][] board, char[] chars, int x, int y, int prevX, int prevY) {
//        if(index + 1 == chars.length)
//            return true;
//        if (y < board[0].length - 1 && chars[index + 1] == board[x][y + 1]) {
//            index++;
//            return recursiveExist(board, chars, x, y + 1, x, y);
//        } else if (y > 0 && chars[index + 1] == board[x][y - 1] && prevY != y - 1) {
//            index++;
//            return recursiveExist(board, chars, x, y - 1, x, y);
//        } else if (x < board.length - 1 && chars[index + 1] == board[x + 1][y]) {
//            index++;
//            return recursiveExist(board, chars, x + 1, y, x, y);
//        } else if (x > 0 && chars[index + 1] == board[x - 1][y] && prevX != x - 1 ) {
//            index++;
//            return recursiveExist(board, chars, x - 1, y, x, y);
//        }
//
//        return false;
//    }
}
