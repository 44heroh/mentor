package com.company.stack;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isValid() {
        boolean result = Solution.isValid("[{}()][]");
        assertEquals(true, result);
    }

    @Test
    void isNotValid() {
        boolean result = Solution.isValid("[{}(][]");
        assertEquals(false, result);
    }
}