package com.company.heap.max;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MedianHeap {

    public static double[] getMedians(int[] array) {
        PriorityQueue<Integer> lowers = new PriorityQueue<>((x, y) -> Integer.compare(y, x));
        PriorityQueue<Integer> highers = new PriorityQueue<>();
        double[] medians = new double[array.length];
        for(int i = 0; i < array.length; i++) {
            addNumber(array[i], lowers, highers);
            rebalanced(lowers, highers);
            medians[i] = getMedian(lowers, highers);
        }

        System.out.println(Arrays.toString(lowers.toArray()));
        System.out.println(Arrays.toString(highers.toArray()));

        return medians;
    }

    private static void rebalanced(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
        PriorityQueue<Integer> bigHeap = lowers.size() > highers.size() ? lowers : highers;
        PriorityQueue<Integer> smallHeap = lowers.size() < highers.size() ? lowers : highers;

        if(bigHeap.size() - smallHeap.size() >= 2) {
            smallHeap.add(bigHeap.poll());
        }
    }

    private static void addNumber(int value, PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
        if(lowers.size() == 0 || value < lowers.peek()) {
            lowers.add(value);
        } else {
            highers.add(value);
        }
    }

    private static double getMedian(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
        if(lowers.size() == highers.size()) {
            return ((double)lowers.peek() + (double)highers.peek()) / 2;
        } else if(lowers.size() > highers.size()) {
            return lowers.peek();
        } else {
            return highers.peek();
        }
    }

    public static void main(String[] args) {
        getMedians(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    }
}
