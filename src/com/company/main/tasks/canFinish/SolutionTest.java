package com.company.main.tasks.canFinish;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void canFinish() {
        int numCourses = 2;
        int[][] prerequisites = {{1,0},{0,1}};
        Solution solution = new Solution();
        System.out.println(solution.canFinish(numCourses, prerequisites));
    }
}