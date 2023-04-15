package com.company.leetcode.problems.excelSheetColumnNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void titleToNumber() {
        Solution solution = new Solution();
        System.out.println(solution.titleToNumber("ABc"));
        System.out.println(solution.titleToNumber("AB"));
        System.out.println(solution.titleToNumber("A"));
//        System.out.println(solution.titleToNumber("FXSHRXW"));
    }
}