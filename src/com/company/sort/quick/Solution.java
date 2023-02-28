package com.company.sort.quick;

import com.company.sort.SortAlgorithm;
import com.company.sort.quick.partitions.PartitionHoar;
import com.company.sort.quick.partitions.PartitionLomut;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        long begin, end;
        long t1 = 0, t2 = 0;
        PartitionStrategy partition = new PartitionHoar();
        QuickSort quickSort = new QuickSort(partition);
//        int[] array = {6, 5, 3, 1, 8, 7, 2, 4};
        int[] array = generateRandomArr(-11000, 11000, 1000);
        System.out.println(Arrays.toString(array));
        begin = System.nanoTime();
        quickSort.sort(array);
        end = System.nanoTime();
        t1 += (end - begin);
        System.out.println("The average time taken by the non-optimized Quicksort: " +
                t1 + "ns");
        System.out.println(Arrays.toString(array));
        begin = System.nanoTime();
        quickSort.sortOptimized(array);
        end = System.nanoTime();
        t2 += (end - begin);
        System.out.println("The average time taken by the optimized Quicksort: " +
                t2 + "ns");
        System.out.println(Arrays.toString(array));
    }

    public static int[] sortLomut() {
        long begin, end;
        long t1 = 0, t2 = 0;
//        QuickSort quickSort = new QuickSort();
        PartitionLomut partition = new PartitionLomut();
        SortAlgorithm quickSort = new QuickSort(partition);
//        int[] array = {6, 5, 3, 1, 8, 7, 2, 4};
        int[] array = generateRandomArr(-11000, 11000, 1000);
        System.out.println(Arrays.toString(array));
        begin = System.nanoTime();
        quickSort.sort(array);
        end = System.nanoTime();
        t1 += (end - begin);
        System.out.println("The average time taken by the non-optimized Quicksort: " +
                t1 + "ns");
        System.out.println(Arrays.toString(array));
        begin = System.nanoTime();
        ((QuickSort) quickSort).sortOptimized(array);
        end = System.nanoTime();
        t2 += (end - begin);
        System.out.println("The average time taken by the optimized Quicksort: " +
                t2 + "ns");
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int[] sortHoar() {
        long begin, end;
        long t1 = 0, t2 = 0;
//        QuickSort quickSort = new QuickSort();
        PartitionStrategy partition = new PartitionHoar();
        SortAlgorithm quickSort = new QuickSort(partition);
//        int[] array = {6, 5, 3, 1, 8, 7, 2, 4};
        int[] array = generateRandomArr(-11000, 11000, 1000);
        System.out.println(Arrays.toString(array));
        begin = System.nanoTime();
        quickSort.sort(array);
        end = System.nanoTime();
        t1 += (end - begin);
        System.out.println("The average time taken by the non-optimized Quicksort: " +
                t1 + "ns");
        System.out.println(Arrays.toString(array));
        begin = System.nanoTime();
        ((QuickSort) quickSort).sortOptimized(array);
        end = System.nanoTime();
        t2 += (end - begin);
        System.out.println("The average time taken by the optimized Quicksort: " +
                t2 + "ns");
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int[] generateRandomArr(int from, int to, int n) {
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random()*(to * 2)) + from;
        }

        return arr;
    }
}
