package com.company.leetcode.alexey.greedy.minimum_number_of_arrows_to_burst_balloons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findMinArrowShots1() {
        int[][] points = new int[][]{{10,16}, {2,8}, {1,6}, {7,12}};
        this.run(points);
    }

    @Test
    void findMinArrowShots2() {
        int[][] points = new int[][]{{1,2}, {3,4}, {5,6}, {7,8}};
        this.run(points);
    }

    @Test
    void findMinArrowShots3() {
        int[][] points = new int[][]{{1,2}, {2,3}, {3,4}, {4,5}};
        this.run(points);
    }

    @Test
    void findMinArrowShots4() {
        int[][] points = new int[][]{{3,9}, {7,12}, {3,8}, {6,8}, {9,10}, {2,9}, {0,9}, {3,9}, {0,6}, {2,8}};
        this.run(points);
    }

    @Test
    void findMinArrowShots24() {
        int[][] points = new int[][]{{9,12}, {1,10}, {4,11}, {8,12}, {3,9}, {6,9}, {6,7}};
        this.run(points);
    }

    private void run(int[][] points) {
        Solution solution = new Solution();
//        System.out.println(solution.getCountInsertionIntervals(points));
        System.out.println(solution.findMinArrowShots(points));
    }
}