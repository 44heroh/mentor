package com.company.main.tasks.lengthOfLastWorld;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void lengthOfLastWorld() {
        String s = "Hello world";
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLastWorld(s));
    }

    @Test
    void lengthOfLastWorld2() {
        String s = " fly me  to  the moon ";
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLastWorld(s));
    }
}