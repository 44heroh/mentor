package com.company.main.tasks.numberToWords;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void numberToWords() {
        int num = 123213;
        Solution solution = new Solution();
        System.out.println(solution.numberToWords(num));
    }
}