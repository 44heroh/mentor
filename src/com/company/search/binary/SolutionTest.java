package com.company.search.binary;

import com.company.search.binary.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void search() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int result = Solution.search(arr, 5);
        assertEquals(result, 4);
    }

    @Test
    void searchRecursive() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int result = Solution.searchRecursive(arr, 7, 0, arr.length - 1);
        assertEquals(result, 6);
    }
}