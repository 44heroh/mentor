package com.company.heap.max;

import org.openjdk.jmh.annotations.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

@State(Scope.Benchmark)
public class Solution {

    // из массива найти 5 максимальных элементов(тесты которые это показывают([1-10][10-1][рандомный массив]))
//    public static void main(String[] args) throws Exception {
//        int[] nums = {1, 2, 4, 5, 6, 8, 9, 10, 11, 16, 20};
//        int k = 5;
////        findTopFiveElementsPriorityQueue(nums, k);
//    }

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

    @Fork(value = 1, warmups = 1)
    @Warmup(iterations = 1)
    @org.openjdk.jmh.annotations.Benchmark
    @BenchmarkMode(Mode.All)
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
        MaxHeapByArray maxHeap = new MaxHeapByArray<>(5);
        for(int i = 0; i < 10; i++) {
            maxHeap.add(i);
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
