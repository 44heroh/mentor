package com.company.heap.max;

import com.company.list.DataList;

import java.util.Arrays;

public class MaxHeapByArray<E> {
    private Object[] list;
    private int size;
    private int capacity;

    public MaxHeapByArray(int capacity) {
        list = new Object[capacity];
        size = 0;
        this.capacity = capacity;
    }

    /**
     * Плучаем весь список
     * @return
     */
    public Object[] getList() {
        return list;
    }

    /**
     * Получаем размер
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * Меняем местами элементы из списка
     * @param index1
     * @param index2
     */
    private void swap(int index1, int index2) {
        Object tmp = list[index1];
        list[index1] = list[index2];
        list[index2] = tmp;
    }

    /**
     * Получаем индекс родителя
     * @param index
     * @return
     */
    private int getParentIndex(int index) {
        return (index - 1) / 2;
    }

    /**
     * Получаем индекс левого элемента
     * @param index
     * @return
     */
    private int getLeftIndex(int index) {
        return (2 * index) + 1;
    }

    /**
     * Получаем индекс правого элемента
     * @param index
     * @return
     */
    private int getRightIndex(int index) {
        return (2 * index) + 2;
    }

    /**
     * Просеиваем элементы вверх
     * @param index
     */
    private void siftUp(int index) {
        // получаем индекс родителя
        int parentIndex = getParentIndex(index);
        // идем по списку пока индекс > 0 и текущий элемент < родительского
        while (index > 0 && (int)list[parentIndex] < (int)list[index]) {
            // меняем местами
            swap(index, parentIndex);
            // присваиваем индекс родителя -> index так как поменяли местами
            index = parentIndex;
            parentIndex = getParentIndex(index);
        }
    }

    /**
     *
     * @param index
     * @return
     */
    public boolean isLeaf(int index) {
        if(index < (size / 2) || index <= size) {
            return true;
        }

        return false;
    }

    /**
     * Просеиваем вниз
     * @param index
     */
    private void siftDown(int index) {
        int leftIndex = getLeftIndex(index);
        int rightIndex = getRightIndex(index);
        // присваиваем наибольшему текущий индекс
        int large = index;

        // если левый < размера массива и != null
        if(leftIndex < list.length && list[leftIndex] != null) {
            // если левый > наибольшего
            if((int)list[leftIndex] > (int)list[large])
                large = leftIndex;
        }
        // если правый < размера массива и != null
        if(rightIndex < list.length && list[rightIndex] != null) {
            // если правый > наибольшего
            if((int)list[rightIndex] > (int)list[large])
                large = rightIndex;
        }

        // наибольший != текущкму
        if(index != large) {
            // меняем местами
            swap(index, large);
            // продолжаем просеивание вниз
            siftDown(large);
        }
    }

    /**
     * Добавление элемента
     * @param e
     */
    public void add(E e) {
        if(capacity <= size) {
            // изменяем массив на новый массив с размером(size + 1) и длиной size
            modifyArr(new Object[size + 1], size);
        }
        // добавляем в список
        list[size] = e;
        // просеиваем вверх
        siftUp(size);

        if(capacity == size) {
            // удаляем минимальный элемент
            removeMinElement();
            // изменяем массив на новый массив с размером(size + 1) и длиной size + 1
            modifyArr(new Object[size + 1], size + 1);
            // просеиваем вверх
            siftUp(size);
        }
        // увеличиваем размер
        size++;
    }

    /**
     * модифицирование массива
     * @param newArr
     * @param newSize
     */
    private void modifyArr(Object[] newArr, int newSize) {
        list = copy(newArr, newSize);
    }


    /**
     * копирование массива
     * @param newArr
     * @param size
     * @return
     */
    private Object[] copy(Object[] newArr, int size) {
        for(int i = 0; i < size; i++) {
            newArr[i] = list[i];
        }
        return newArr;
    }

    /**
     * Забираем верхний элемент
     * @return
     */
    public int top() {
        Integer top = (int)list[0];
        remove((E) top);
        return top;
    }

    /**
     * Возвращаем наибольший элемент
     * @return
     */
    public int peek() {
        return (int)list[0];
    }

    /**
     * Поиск индекса минимального значения в массиве
     * @return
     */
    private int findMinElementIndex() {
        int minimum = Integer.MAX_VALUE;
        Integer minIndex = null;
        for(int i = list.length - 1; i >= 0; i--) {
            // ищем минимальный элемент
            if((int)list[i] <= minimum){
                minimum = (int)list[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    /**
     * Удаление по индексу
     */
    public void removeMinElement() {
        // Находим индекс минимального элемента
        int minIndex = findMinElementIndex();

        int sizeTmp = size;
        // Проходим по массиву
        for(int i = minIndex; i < list.length - 1; i++) {
            // то каждый элемент начиная с него приравниваем следующему
            if(i >= minIndex) {
                list[i] = list[i + 1];
            }
        }
        list[size] = null;
        // уменьшшаем размер
        size--;
    }

    /**
     * Удаление элемента
     * @param e
     */
    public void remove(E e) {
        Integer searchIndex = null;
        // ищим элемент
        for(int i = 0; i < list.length; i++) {
            if(list[i].equals(e)) {
                searchIndex = i;
                // обновляем искомый элемент на нижний для просеивания вниз
                list[searchIndex] = list[size - 1];
                // удаляем последний элемент
                list[size - 1] = null;
                // уменьшаем размер
                size--;
                break;
            }
        }

        if (searchIndex == 0 || (int)list[searchIndex] < (int)list[getParentIndex(searchIndex)]) {
            // просеиваем вниз
            siftDown(searchIndex);
        } else {
            // просеиваем вверх
            siftUp(searchIndex);
        }

    }

    public void displayHeap(){
        int nBlanks = 32;
        int itemsPerRow = 1;
        int column = 0;
        int j = 0; // Текущий элемент
        String dots = "...............................";
        System.out.println(dots+dots); // Верхний пунктир

        while(size > 0){ // Для каждого элемента пирамиды
            if(column == 0){ // Первый элемент в строке?
                for(int k = 0; k < nBlanks; k++) // Предшествующие пробелы
                    System.out.print(' ');
            }
            // Вывод элемента
            if(list[j] != null)
                System.out.print(list[j]);

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

}
