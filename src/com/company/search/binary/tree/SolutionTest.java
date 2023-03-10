package com.company.search.binary.tree;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void createBinaryTreeSearch() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BinaryTreeSearch.Node root = Solution.createBinaryTreeSearch(arr);
        int[] sort = new int[arr.length];
        sort = BinaryTreeSearch.runLNR(root, 0, sort);
        System.out.println(Arrays.toString(sort));
        System.out.println(BinaryTreeSearch.find(root, 7));
        int from = 3;
        int to = 8;
        int size = to - from;
        int[] result = new int[size];
        result = BinaryTreeSearch.findByRange(root, from, to, 0, new int[size]);
        System.out.println(Arrays.toString(result));
        assertEquals(root.value, arr[(arr.length / 2) - 1]);
    }
}