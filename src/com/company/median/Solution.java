package com.company.median;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public static double[] getMedians(int[] array){
        PriorityQueue<Integer> lowers = new PriorityQueue<>((x, y) -> Integer.compare(y, x));
        PriorityQueue<Integer> highers = new PriorityQueue<>();
        double[] medians = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            if (lowers.size() == 0 || current < lowers.peek()) {
                lowers.add(current);
            } else {
                highers.add(current);
            }

            PriorityQueue<Integer> bigHeap = lowers.size() > highers.size() ? lowers : highers;
            PriorityQueue<Integer> smallHeap = lowers.size() < highers.size() ? lowers : highers;
            if (bigHeap.size() - smallHeap.size() >= 2) {
                smallHeap.add(bigHeap.poll());
            }

            if (lowers.size() == highers.size()) {
                medians[i] = ((double)lowers.peek() + (double)highers.peek()) / 2;
            } else if (highers.size() > lowers.size()) {
                medians[i] = (double) highers.peek();
            } else {
                medians[i] = (double) lowers.peek();
            }
        }

        System.out.println(Arrays.toString(lowers.toArray()));
        System.out.println(Arrays.toString(highers.toArray()));

        return medians;
    }
}
