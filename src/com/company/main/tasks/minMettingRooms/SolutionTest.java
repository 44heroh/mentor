package com.company.main.tasks.minMettingRooms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void minMettingRooms() {
        int[][] intervals = {{0,30},{5,10},{15,20}};
        Solution solution = new Solution();
        System.out.println(solution.minMettingRooms(intervals));
    }
}