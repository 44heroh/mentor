package com.company.sort.quick.partitions;

import com.company.sort.quick.PartitionStrategy;

public class PartitionHoar extends PartitionStrategy {

    public int Partition(int[] array, int left, int right) {
        // опорный элемент
        int pivot = array[(left + right) / 2];
        // начальный элемень
        int i = left - 1;
        // конечный элемент
        int j = right + 1;

        // пока left < right
        while (i < j) {
            // пробегаемся по всем элементам которые < опорного и запоминаем индекс
            do{
                i++;
            }
            while (array[i] < pivot);
            // пробегаемся по всем элементам которые > опорного и запоминаем индекс
            do{
                j--;
            }
            while (array[j] > pivot);
            // если left >= right
            if(i >= j)
                break;
            // меняем местами left и right
            swap(array, i, j);
        }

        return j;
    }

}
