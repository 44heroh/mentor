package com.company.leetcode.problems.stringToIntegerAtoi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void myAtoi() {
        Solution solution = new Solution();
        String s = "42";
        System.out.println(solution.myAtoi(s));
    }

    @Test
    void myAtoi1() {
        Solution solution = new Solution();
        String s = "   -42";
        System.out.println(solution.myAtoi(s));
    }

    @Test
    void myAtoi2() {
        Solution solution = new Solution();
        String s = "4193 with words";
        System.out.println(solution.myAtoi(s));
    }

    @Test
    void myAtoi3() {
        Solution solution = new Solution();
        String s = "words and 987";
        System.out.println(solution.myAtoi(s));
    }

    @Test
    void myAtoi4() {
        Solution solution = new Solution();
        String s = "-91283472332";
        System.out.println(solution.myAtoi(s));
    }

    @Test
    void myAtoi5() {
        Solution solution = new Solution();
        String s = "";
        System.out.println(solution.myAtoi(s));
    }

    @Test
    void myAtoi6() {
        Solution solution = new Solution();
        String s = " ";
        System.out.println(solution.myAtoi(s));
    }

    @Test
    public void testSimpleTrue() {
        String s = "humbapumpa jim";
        assertTrue(s.matches(".*(jim|joe).*"));
        s = "humbapumpa jom";
        assertFalse(s.matches(".*(jim|joe).*"));
        s = "humbaPumpa joe";
        assertTrue(s.matches(".*(jim|joe).*"));
        s = "humbapumpa joe jim";
        assertTrue(s.matches(".*(jim|joe).*"));
    }

    @Test
    public void testSimpleTrue1() {
        String s = "42";
        System.out.println(s.matches("^[a-zA-Z].*"));
        assertTrue(s.matches("^[a-zA-Z].*"));
    }
}