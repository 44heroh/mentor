package com.company.search.binary;

import java.util.Arrays;

public class SearchBinary {

    public static Integer search(int[] array, int find) {
        int left = 0;
        int right = array.length - 1;
        int middleIndex = (int)(array.length / 2);

        while(left <= right) {
            middleIndex = (int)((left + right) / 2);
            if(array[middleIndex] == find) {
                return middleIndex;
            } else if (array[middleIndex] > find) {
                right = middleIndex - 1;
            } else {
                left = middleIndex + 1;
            }
        }

        return middleIndex;
    }

    public static Integer searchRecursive(int[] array, int find, int left, int right) {
        int middleIndex = (int)((left + right) / 2);
        if(array[middleIndex] == find) {
            return middleIndex;
        } else if (array[middleIndex] > find) {
            return searchRecursive(array, find, left, middleIndex - 1);
        } else {
            return searchRecursive(array, find,middleIndex + 1, right );
        }
    }
}
