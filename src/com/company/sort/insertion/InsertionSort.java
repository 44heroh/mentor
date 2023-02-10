package com.company.sort.insertion;

public class InsertionSort {

    private int[] array;

    public InsertionSort(int[] array) {
        this.array = array;
    }

    /**
     * Сортировка
     */
    public void sort() {
        // Цикл начинается со второго элемента
        for(int i = 1; i < array.length; i++) {
            // Сохраняем текущее значение во временную переменную
            int tmp = array[i];
            // Сохраняем текущий счетчик
            int j = i;
            // Пробегаемся по массиву каждое перыдущее > значения временной переменной
            while(array[j - 1] > tmp) {
                // Присваиваем текущему предыдущее
                array[j] = array[j - 1];
                // Уменьшаем счетчик
                j--;
                if(j == 0)
                    break;
            }
            // Присваиваем в то место где должно быть данное значение
            array[j] = tmp;
        }
    }

    public int[] getArray() {
        return array;
    }
}
