package com.company.search.binary;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
//        System.out.println(Arrays.toString(arr));
//        int[] arr1 = Arrays.copyOfRange(arr, 0, (int)(arr.length / 2));
//        System.out.println(Arrays.toString(arr1));
//        int k = 8;
//        System.out.println(Arrays.toString(arr));
//
//        int result = SearchBinary.search(arr, k);
//        System.out.println(result);

//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
//        System.out.println(SearchBinary.searchRecursive(arr, 6, 0, arr.length - 1));


    }

    public static int search(int[] array, int find) {
        return  SearchBinary.search(array, find);
    }

    public static int searchRecursive(int[] array, int find, int left, int right) {
        return  SearchBinary.searchRecursive(array, find, left, right);
    }
}
