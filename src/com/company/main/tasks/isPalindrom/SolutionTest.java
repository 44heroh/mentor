package com.company.main.tasks.isPalindrom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isPalindrom() {
        int num = 121;
        Solution solution = new Solution();
        System.out.println(solution.isPalindrom(num));
    }
}