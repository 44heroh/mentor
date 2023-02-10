package com.company.sort.insertion;

import com.company.sort.bubble.BubbleSort;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] array = {6, 5, 3, 1, 8, 7, 2, 4};
        InsertionSort insertionSort = new InsertionSort(array);
        insertionSort.sort();
        System.out.println(Arrays.toString(insertionSort.getArray()));
    }

    public static int[] sort() {
        int[] array = {6, 5, 3, 1, 8, 7, 2, 4};
        InsertionSort insertionSort = new InsertionSort(array);
        insertionSort.sort();
        return insertionSort.getArray();
    }
}
