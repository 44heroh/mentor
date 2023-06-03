package com.company.leetcode.problems.surroundedRegions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solve() {
        char[][] board = {{'X','X','X','X'}, {'X','O','O','X'}, {'X','X','O','X'}, {'X','O','X','X'}};
        Solution solution = new Solution();
        solution.solve(board);
    }

    @Test
    void solve4() {
        char[][] board = {{'X','X','X','X'}, {'X','X','O','O'}, {'X','O','O','X'}, {'X','X','X','X'},};
        Solution solution = new Solution();
        solution.solve(board);
    }

    @Test
    void solve5() {
        char[][] board = {{'X','O','X'}, {'O','X','O'}, {'X','O','X'}};
        Solution solution = new Solution();
        solution.solve(board);
    }

    @Test
    void solve1() {
        char[][] board = {{'X','X','X'}, {'X','O','X'}, {'X','X','X'}};
        Solution solution = new Solution();
        solution.solve(board);
    }

    @Test
    void solve2() {
        char[][] board = {{'O','O','O'}, {'O','O','O'}, {'O','O','O'}};
        Solution solution = new Solution();
        solution.solve(board);
    }

    @Test
    void solve3() {
        char[][] board = {{'X','O','X'}, {'X','O','X'}, {'X','O','X'}};
        Solution solution = new Solution();
        solution.solve(board);
    }
}