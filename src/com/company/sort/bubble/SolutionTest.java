package com.company.sort.bubble;

import com.company.sort.bubble.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void sort() {
        int[] actual = Solution.sort();
        int[] expected = {-78, -55, -1, 0, 1, 2, 3, 3, 4, 5, 6, 7, 8};
        assertArrayEquals(actual, expected);
    }
}