package com.company.main.tasks.differByOne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void differByOne() {
        String[] dict = {"abcd","acbd", "aacd"};
        Solution solution = new Solution();
        System.out.println(solution.differByOne(dict));
    }
}