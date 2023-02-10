package com.company.sort.bubble;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] array = {-55, 0, -1, 3, 5, 6, 3, 1, 8, 7, 2, 4, -78};
        BubbleSort bubbleSort = new BubbleSort(array);
        bubbleSort.sort();
        System.out.println(Arrays.toString(bubbleSort.getArray()));
    }

    public static int[] sort() {
        int[] array = {-55, 0, -1, 3, 5, 6, 3, 1, 8, 7, 2, 4, -78};
        BubbleSort bubbleSort = new BubbleSort(array);
        bubbleSort.sort();
        return bubbleSort.getArray();
    }
}
