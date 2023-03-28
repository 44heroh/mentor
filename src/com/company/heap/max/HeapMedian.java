package com.company.heap.max;

import java.util.Arrays;

public class HeapMedian {

    public static double[] getMedians(int[] array) {
        MaxHeapByArray<Integer> lowers, highers;
        lowers = new MaxHeapByArray<>(array.length / 2 + 1, true);
        highers = new MaxHeapByArray<>(array.length / 2 + 1, false);


        double[] medians = new double[array.length];
        for(int i = 0; i < array.length; i++) {
            add(array[i], lowers, highers);
            rebalanced(lowers, highers);
            medians[i] = getMedian(lowers, highers);
        }

        lowers.displayHeap();
        highers.displayHeap();

        return medians;
    }

    private static double getMedian(MaxHeapByArray<Integer> lower, MaxHeapByArray<Integer> highter) {
        if(lower.getSize() == highter.getSize()) {
            return ((double)lower.peek() + (double)highter.peek()) / 2;
        } else if(lower.getSize() > highter.getSize()) {
            return lower.peek();
        } else {
            return highter.peek();
        }
    }

    private static void rebalanced(MaxHeapByArray<Integer> lower, MaxHeapByArray<Integer> highter) {
        MaxHeapByArray<Integer> bigHeap = lower.getSize() > highter.getSize() ? lower : highter;
        MaxHeapByArray<Integer> smallHeap = lower.getSize() < highter.getSize() ? lower : highter;

        if(bigHeap.getSize() - smallHeap.getSize() >= 2) {
            smallHeap.add(bigHeap.top());
        }
    }

    private static void add(int value, MaxHeapByArray<Integer> lower, MaxHeapByArray<Integer> highter) {
        if(lower.getSize() == 0 || lower.peek() > value) {
            lower.add(value);
        } else {
            highter.add(value);
        }
    }

    public static void main(String[] args) {
        int[]  arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] result = getMedians(arr);
        System.out.println(Arrays.toString(result));
        System.out.println(result[result.length - 1]);
    }
}
