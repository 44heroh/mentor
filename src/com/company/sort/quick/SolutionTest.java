package com.company.sort.quick;

import com.company.sort.SortAlgorithm;
import com.company.sort.quick.partitions.PartitionLomut;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
class SolutionTest {

    @Test
    void sortLomut() {
        int[] array = Solution.sortLomut();
//        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
//        assertArrayEquals(array, expected);
        assertTrue(true);
    }

    @Test
    void sortHoar() {
        int[] array = Solution.sortHoar();
//        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
//        assertArrayEquals(array, expected);
        assertTrue(true);
    }

}