package com.company.leetcode.alexey.greedy.non_overlapping_intervals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void eraseOverlapIntervals1() {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        this.run(intervals);
    }

    @Test
    void eraseOverlapIntervals2() {
        int[][] intervals = {{1, 2}, {1, 2}, {1, 2}};
        this.run(intervals);
    }

    @Test
    void eraseOverlapIntervals3() {
        int[][] intervals = {{1, 2}, {2, 3}};
        this.run(intervals);
    }

    @Test
    void eraseOverlapIntervals10() {
        int[][] intervals = {{1, 100}, {11, 22}, {1, 11}, {2, 12}};
        this.run(intervals);
    }

    @Test
    void eraseOverlapIntervals15() {
        int[][] intervals = {{1, 2}, {1, 3}, {1, 4}};
        this.run(intervals);
    }

    @Test
    void eraseOverlapIntervals19() {
        int[][] intervals = {{-52,31}, {-73,-26}, {82,97}, {-65,-11}, {-62,-49}, {95,99}, {58,95}, {-31,49}, {66,98}, {-63,2}, {30,47}, {-40,-26}};
        this.run(intervals);
    }

    private void run(int[][] intervals) {
        Solution solution = new Solution();
        System.out.println(solution.eraseOverlapIntervals(intervals));
    }
}