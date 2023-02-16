package com.company.sort.heap;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] array = {6, 5, 3, 1, 8, 7, 2, 4};
        HeapSort heapByArray = new HeapSort<>(array.length, false);
        for(Object obj: array) {
            heapByArray.add(obj);
        }

        int[] top = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            top[i] = heapByArray.top();
        }
        System.out.println(Arrays.toString(top));
    }

    public static int[] sort() {
        int[] array = {6, 5, 3, 1, 8, 7, 2, 4};
        HeapSort heapByArray = new HeapSort<>(array.length, false);
        for(Object obj: array) {
            heapByArray.add(obj);
        }

        String res = "";
        int[] top = new int[array.length];
        for(int i = 0; i < top.length; i++) {
            top[i] = heapByArray.top();
            String str = getString(heapByArray.getList(), top, top.length - i - 1);
            System.out.println(str);
        }

        return top;
    }

    /**
     * Выыодим строку на каком элементе находимся сейчас
     * @param arrFromHeap
     * @param arrFromTop
     * @param count
     * @return
     */
    private static String getString(Object[] arrFromHeap, int[] arrFromTop, int count) {
        String strHeap = "";
        String res = "";
        if(count > 0) {
            strHeap = Arrays.stream(arrFromHeap)
                    .filter((x) -> x != null)
                    .map(String::valueOf)
                    .reduce((x, y) -> x + ", " + y)
                    .get();
        }
        String strTop = Arrays.stream(arrFromTop)
                .filter((x) -> x != 0)
                .mapToObj(String::valueOf)
                .reduce((x, y) -> x + ", " + y)
                .get();
        if(count > 0) {
            res = strTop + "|, " + strHeap;
        } else {
            res = strTop + "|";
        }

        return res;
    }
}
