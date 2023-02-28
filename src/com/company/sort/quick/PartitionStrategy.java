package com.company.sort.quick;

public abstract class PartitionStrategy {
    public abstract int Partition(int[] array, int left, int right);

    public static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
