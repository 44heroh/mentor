package com.company.heap.max;

import org.openjdk.jmh.annotations.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {

    public static void main(String[] args) throws Exception {

    }

    public static Object[] addArrayToMaxHeap() {
        int[] nums = {1, 2, 4, 5, 6, 8, 9, 10, 11, 16, 20};
        MaxHeap maxHeap = new MaxHeap<>();
        for(int i = 0; i < nums.length; i++) {
            maxHeap.add(nums[i]);
            maxHeap.displayHeap();
        }

        Object[] top = new Object[5];
        for(int i = 0; i < 5; i++) {
            top[i] = maxHeap.peek();
            maxHeap.remove(maxHeap.peek());
            maxHeap.displayHeap();
            System.out.println(Arrays.toString(top));
        }

        return top;
    }

    public static Object[] addArrayRandomWithMinusToMaxHeap() {
        int max = 100;
        int min = -100;
        MaxHeap maxHeap = new MaxHeap<>();
        for(int i = 0; i < 100; i++) {
            maxHeap.add((int)Math.floor(Math.random() * (max - min + 1) + min));
        }
        maxHeap.displayHeap();

        Object[] top = new Object[5];
        for(int i = 0; i < 5; i++) {
            top[i] = maxHeap.peek();
            maxHeap.remove(maxHeap.peek());
        }
        System.out.println(Arrays.toString(top));
        return top;
    }

    public static Object[] addArrayRandomToMaxHeap() {
        int max = 100;
        int min = 1;
        MaxHeap maxHeap = new MaxHeap<>();
        for(int i = 0; i < 100; i++) {
            maxHeap.add((int)Math.floor(Math.random() * (max - min + 1) + min));
        }
        maxHeap.displayHeap();

        Object[] top = new Object[5];
        for(int i = 0; i < 5; i++) {
            top[i] = maxHeap.peek();
            maxHeap.remove(maxHeap.peek());
        }
        System.out.println(Arrays.toString(top));
        return top;
    }

    public static Object[] addArrayOrderedToMaxHeap() {
        MaxHeap maxHeap = new MaxHeap<>();
        for(int i = 0; i < 11; i++) {
            maxHeap.add(i);
        }

        Object[] top = new Object[5];
        for(int i = 0; i < 5; i++) {
            top[i] = maxHeap.peek();
            maxHeap.remove(maxHeap.peek());
        }

        return top;
    }

    public static Object[] addArrayOrderedToMaxHeapByArr() {
        MaxHeapByArray maxHeap = new MaxHeapByArray<>(4, false);
        for(int i = 0; i < 11; i++) {
            maxHeap.add(i);
            maxHeap.displayHeap();
        }

        maxHeap.displayHeap();
        System.out.println(Arrays.toString(maxHeap.getList()));
        return maxHeap.getList();
    }

    public static Object[] findMedianHeap() {
        int size = 11;
        MaxHeapByArray maxHeap = new MaxHeapByArray<>(size, true);
        for(int i = 0; i < size; i++) {
            maxHeap.add(i);
            maxHeap.displayHeap();
        }

        maxHeap.displayHeap();
        System.out.println(Arrays.toString(maxHeap.getList()));
        return maxHeap.getList();
    }

    /**
     * Пять набольших элементов через PriorityQueue
     *
     * @param nums
     * @param k
     */
    private static void findTopFiveElementsPriorityQueue(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((x, y) -> Integer.compare(y, x));
        for(int num: nums){
            priorityQueue.add(num);
        }

        for(int i = 5; i > 0; i--){
            System.out.println(priorityQueue.poll());
        }
    }

}
