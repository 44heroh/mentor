package com.company.leetcode.problems.mergeSortedArray;

import com.company.sort.merge.MergeSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void merge() {
        Solution solution = new Solution();
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        solution.merge(arr1, 3, arr2, 3);

        arr1 = new int[]{1};
        arr2 = new int[]{};
        solution.merge(arr1, 1, arr2, 0);

        arr1 = new int[]{0};
        arr2 = new int[]{1};
        solution.merge(arr1, 0, arr2, 1);
    }
}