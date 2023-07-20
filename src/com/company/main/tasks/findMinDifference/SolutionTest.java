package com.company.main.tasks.findMinDifference;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findMinDifference() {
        List<String> timePoints = new ArrayList<>();
        timePoints.add("00:00");
        timePoints.add("23:59");
        Solution solution = new Solution();
        System.out.println(solution.findMinDifference(timePoints));
    }

    @Test
    void findMinDifference2() {
        List<String> timePoints = new ArrayList<>();
        timePoints.add("00:00");
        timePoints.add("23:59");
        timePoints.add("00:00");
        Solution solution = new Solution();
        System.out.println(solution.findMinDifference(timePoints));
    }
}