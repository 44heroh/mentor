package com.company.sort.quick.partitions;

import com.company.sort.quick.PartitionStrategy;

public class PartitionHoar extends PartitionStrategy {

    public int Partition(int[] array, int left, int right) {
        // опорный элемент
        int pivot = array[right];
        // на еденицу меньше так как индекс ноль входит в массив
        int i = left - 1;

        // идём по массиву до последнего индекса
        for(int j = left; j < right; j++) {
            // если array[j] < опорный элемент
            if(array[j] < pivot) {
                // увеличиваем на 1, меньший индекс
                i++;
                // меняем местами
                swap(array, i, j);
            }
        }
        // меньший индекс меняем местами с большим
        swap(array, i + 1, right);
        return i + 1;
    }

}
