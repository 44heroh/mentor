package com.company.sort.insertion;

import com.company.sort.insertion.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void sort() {
        int[] actual = Solution.sort();
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
        assertArrayEquals(actual, expected);
    }
}