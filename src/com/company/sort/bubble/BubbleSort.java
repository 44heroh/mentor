package com.company.sort.bubble;

public class BubbleSort {
    private int[] array;

    public BubbleSort(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    /**
     * Сортировка
     */
    public void sort() {
        // Цикл начинается со второго элемента
        for(int i = 1; i < array.length; i++) {
            // Предыдущий элемент > текущего
            if(array[i - 1] > array[i]) {
                // Запоминаем индекс текущего
                int j = i;
                // Проходим циклом по предыдущий больше следующего
                while(array[j - 1] > array[j]){
                    // Меняем местами
                    this.swap(j - 1, j);
                    // Уменьшаем счетчик
                    j--;
                    if(j == 0)
                        break;
                }
            }
        }
    }

    private void swap(int i1, int i2) {
        int tmp = array[i1];
        array[i1] = array[i2];
        array[i2] = tmp;
    }
}
