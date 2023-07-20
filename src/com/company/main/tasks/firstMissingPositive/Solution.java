package com.company.main.tasks.firstMissingPositive;

public class Solution {

    /**
     *
     * @param arr
     * @return
     */
    public int firstMissingPositive(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] > 0 && arr[i] <= arr.length && arr[arr[i] - 1] != arr[i]) {
                swap(arr, i, arr[i] - 1);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i + 1) {
                return i + 1;
            }
        }

        return arr.length + 1;
    }

    private void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
