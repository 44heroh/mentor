package com.company.leetcode.problems.wordSearch;

import com.company.leetcode.problems.wordSearch.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void exist() {
        char[][] board = new char[][]{{'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}};
        String word = "ABCCED";
        Solution solution = new Solution();
        boolean result = solution.exist(board, word);
        System.out.println(result);
        Assertions.assertEquals(true, result);
    }

    @Test
    void exist1() {
        char[][] board = new char[][]{{'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}};
        String word = "ABCB";
        Solution solution = new Solution();
        boolean result = solution.exist(board, word);
        System.out.println(result);
        Assertions.assertEquals(false, result);
    }

    @Test
    void exist2() {
        char[][] board = new char[][]{{'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}};
        String word = "SEE";
        Solution solution = new Solution();
        boolean result = solution.exist(board, word);
        System.out.println(result);
        Assertions.assertEquals(true, result);
    }

    @Test
    void exist3() {
        char[][] board = new char[][]{{'A'}};
        String word = "AB";
        Solution solution = new Solution();
        boolean result = solution.exist(board, word);
        System.out.println(result);
        Assertions.assertEquals(false, result);
    }

    @Test
    void exist4() {
        char[][] board = new char[][]{{'A', 'A'}};
        String word = "A";
        Solution solution = new Solution();
        boolean result = solution.exist(board, word);
        System.out.println(result);
        Assertions.assertEquals(true, result);
    }

    @Test
    void exist5() {
        char[][] board = new char[][]{{'C', 'A', 'A'}, {'A', 'A', 'A'}, {'B', 'C', 'D'}};
        String word = "AAB";
        Solution solution = new Solution();
        boolean result = solution.exist(board, word);
        System.out.println(result);
        Assertions.assertEquals(true, result);
    }

    @Test
    void exist6() {
        char[][] board = new char[][]{{'A', 'A'}};
        String word = "AAA";
        Solution solution = new Solution();
        boolean result = solution.exist(board, word);
        System.out.println(result);
        Assertions.assertEquals(false, result);
    }

    @Test
    void exist7() {
        char[][] board = new char[][]{{'A','B','C','E'}, {'S','F','E','S'}, {'A','D','E','E'}};
        String word = "ABCESEEEFS";
        Solution solution = new Solution();
        boolean result = solution.exist(board, word);
        System.out.println(result);
        Assertions.assertEquals(true, result);
    }

    @Test
    void exist8() {
        char[][] board = new char[][]{{'A','B','C','E'}, {'S','F','E','S'}, {'A','D','E','E'}};
        String word = "ABCESEEEFS";
        Solution solution = new Solution();
        boolean result = solution.exist(board, word);
        System.out.println(result);
        Assertions.assertEquals(true, result);
    }
}