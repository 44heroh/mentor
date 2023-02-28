package com.company.sort.heap;

import com.company.sort.SortAlgorithm;

import java.util.Arrays;

public class HeapSort extends SortAlgorithm {

    @Override
    public void sort(int[] array) {
        sortRun(array, '<');
    }

    private void sortRun(int[] arr, char direction) {
        int n = arr.length;

        // Заполняем кучу
        for(int i = n/2; i >= 0; i--) {
            heapify(arr, n, i, direction);
            displayHeap(arr);
            System.out.println(Arrays.toString(arr));
        }

        System.out.println();
        // Получаем один за одним элемент из кучи
        for(int i = n - 1; i >= 0; i--) {
            // Перемещаем корень в конец
            swap(arr, i, 0);
            // Вызываем на уменьшенной куче c 0 до i
            heapify(arr, i, 0, direction);
            displayHeap(arr);
            System.out.println(Arrays.toString(arr));
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
        displayHeap(arr);
    }

    private void heapify(int[] arr, int size, int index, char direction) {
        // индекс левого элемента
        int left = (index * 2) + 1;
        // индекс правого элемента
        int right = (index * 2) + 2;
        // устанавливаем основной элемент
        int main = index;

        // если левый индекс < размера
        if(left < size){
            if(direction == '>') {
                // основной элемент > левого элемента
                if(arr[main] > arr[left])
                    main = left;
            } else if(direction == '<') {
                // основной элемент < левого элемента
                if(arr[main] < arr[left])
                    main = left;
            }
        }

        // если правый индекс < размера
        if(right < size) {
            if(direction == '>') {
                // основной элемент > правого элемента
                if(arr[main] > arr[right])
                    main = right;
            }else if(direction == '<') {
                // основной элемент < правого элемента
                if(arr[main] < arr[right])
                    main = right;
            }
        }

        // index не равен main
        if(index != main) {
            // меняем местами текущий и основной
            swap(arr, index, main);
            // вызываем на затронутом поддереве
            heapify(arr, size, main, direction);
        }
    }

    private static void swap(int[] arr, int x, int y) {
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }

    public static void displayHeap(int[] arr){
        int nBlanks = 32;
        int itemsPerRow = 1;
        int column = 0;
        int j = 0; // Текущий элемент
        String dots = "...............................";
        System.out.println(dots+dots); // Верхний пунктир
        int size = arr.length;
        while(size > 0){ // Для каждого элемента пирамиды
            if(column == 0){ // Первый элемент в строке?
                for(int k = 0; k < nBlanks; k++) // Предшествующие пробелы
                    System.out.print(' ');
            }
            // Вывод элемента
            System.out.print(arr[j]);


            if(++j == size)  // Вывод завершен?
                break;

            if(++column == itemsPerRow){ // Конец строки?
                nBlanks /= 2; // Половина пробелов
                itemsPerRow *= 2; // Вдвое больше элементов
                column = 0; // Начать заново
                System.out.println(); // Переход на новую строку
            } else { // Следующий элемент в строке
                for(int k = 0; k < nBlanks*2-2; k++)
                    System.out.print(' '); // Внутренние пробелы
            }
        }
        System.out.println("\n" + dots + dots);
    }

    public void sortOptimized(int[] array) {

    }
}
