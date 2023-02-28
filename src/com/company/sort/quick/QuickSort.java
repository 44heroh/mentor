package com.company.sort.quick;

import com.company.sort.SortAlgorithm;

import java.util.Arrays;

public class QuickSort extends SortAlgorithm {

    private PartitionStrategy _partitionAlgorithm;

    public QuickSort(PartitionStrategy _partitionAlgorithm) {
        this._partitionAlgorithm = _partitionAlgorithm;
    }

    public void sort(int[] array) {
        sortRecursive(array, 0, array.length - 1);
    }

    public void sortRecursive(int[] array, int left, int right) {
//        System.out.println();
//        System.out.println(Arrays.toString(array));
        // если left индекс >= right индекс
        if(left >= right)
            return;

        // Разделение массива
        int partition = _partitionAlgorithm.Partition(array, left, right);
        // запускаем на подмассиве с 0 до индекса разделяемого элемента
        sortRecursive(array, left, partition - 1);
        // запускаем на подмассиве с следующего индекса после индекса разделяемого элемента до конца
        sortRecursive(array, partition + 1, right);
    }

    public void sortOptimized(int[] array) {
        sortRecursiveOptimized(array, 0, array.length - 1);
    }

    private void sortRecursiveOptimized(int[] array, int left, int right) {
        while (left < right)
        {
            if(right - left < 10)
            {
                insertionSort(array, left, right);
                break;
            }
            else {
                int partition = _partitionAlgorithm.Partition(array, left, right);

                if(partition - left < right - partition) {
                    sortRecursiveOptimized(array, left, partition - 1);
                    left = partition + 1;
                } else {
                    sortRecursive(array, partition + 1, right);
                    right = partition - 1;
                }
            }
        }
    }

    // Функция для выполнения сортировки вставками для `arr[]`
    public static void insertionSort(int[] array, int left, int right)
    {
        // Цикл начинается со второго элемента
        for(int i = left + 1; i <= right; i++) {
            // Сохраняем текущее значение во временную переменную
            int tmp = array[i];
            // Сохраняем текущий счетчик
            int j = i;
            // Пробегаемся по массиву каждое перыдущее > значения временной переменной
            while(j > left && array[j - 1] > tmp) {
                // Присваиваем текущему предыдущее
                array[j] = array[j - 1];
                // Уменьшаем счетчик
                j--;
            }
            // Присваиваем в то место где должно быть данное значение
            array[j] = tmp;
        }
    }

    private int partitionLomut(int[] array, int left, int right) {
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

    private int partitionHoar(int[] array, int left, int right) {
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

    private void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    private int partitionHoar1(int[] array, int left, int right) {
        // опорный элемент
        int pivot = array[(left + right) / 2];
        // начальный элемень
        int i = left - 1;
        // конечный элемент
        int j = right + 1;

        // пока left < right
        while (i < j) {
            // пробегаемся по всем элементам которые < опорного и запоминаем индекс
            do {
                i++;
            } while (array[i] < pivot);
            // пробегаемся по всем элементам которые > опорного и запоминаем индекс
            do {
                j--;
            }
            while (array[j] > pivot);
            // если left >= right
            if(i >= j)
                break;
            // меняем местами left и right
            swap(array, i, j);
//            System.out.println(Arrays.toString(array));
        }

        return j;
    }

    private int partitionLomuto1(int[] array, int left, int right) {
        // опорный элемент
        int pivot = array[right];
        // на еденицу меньше так как индекс ноль входит в массив
        int i = (left - 1);
        // идём по массиву до последнего индекса
        for(int j = left; j <= right - 1; j++) {
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
        return (i + 1);
    }
}
