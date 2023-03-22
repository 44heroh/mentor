package com.company.search.binary;

import java.util.Arrays;

public class SearchBinary {

    /**
     * Ищем через Binary Search
     * @param array
     * @param find
     * @return
     */
    public static Integer search(int[] array, int find) {
        int left = 0;
        int right = array.length - 1;
        int middleIndex = (int)(array.length / 2);

        // проходим по массиву пока left <= right
        while(left <= right) {
            // запоминаем индекс среднего элемента
            middleIndex = (int)((left + right) / 2);
            // если элемент по индексу среденего = искомому
            if(array[middleIndex] == find) {
                return middleIndex;
            // если элемент по индексу среденего > искомого
            } else if (array[middleIndex] > find) {
                // то передвигаем правый элемент к индексу среднего - 1
                right = middleIndex - 1;
            } else {
                // то передвигаем левый элемент к индексу среденего + 1
                left = middleIndex + 1;
            }
        }

        return middleIndex;
    }

    /**
     * Рекурсивный Binary Search
     * @param array
     * @param find
     * @param left
     * @param right
     * @return
     */
    public static Integer searchRecursive(int[] array, int find, int left, int right) {
        // запоминаем индекс среднего элемента
        int middleIndex = (int)((left + right) / 2);
        // если элемент по индексу среденего = искомому
        if(array[middleIndex] == find) {
            return middleIndex;
        // если элемент по индексу среденего > искомого
        } else if (array[middleIndex] > find) {
            // то следующий виток рекурсии буде до индекса среднего - 1
            return searchRecursive(array, find, left, middleIndex - 1);
            // если элемент по индексу среденего < искомого
        } else {
            // то следующий виток рекурсии буде от индекса среднего + 1
            return searchRecursive(array, find,middleIndex + 1, right );
        }
    }
}
