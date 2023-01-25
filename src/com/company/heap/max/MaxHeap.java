package com.company.heap.max;

import com.company.list.DataList;

public class MaxHeap<E> {

    private DataList list;
    private int size;

    public MaxHeap() {
        list = new DataList();
        size = 0;
    }

    /**
     * Плучаем весь список
     * @return
     */
    public DataList getList() {
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
        list.swap(index1, index2);
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
        while (index > 0 && (int)list.get(parentIndex) < (int)list.get(index)) {
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
        if(leftIndex < list.getElements().length && list.get(leftIndex) != null) {
            // если левый > наибольшего
            if((int)list.get(leftIndex) > (int)list.get(large))
                large = leftIndex;
        }
        // если правый < размера массива и != null
        if(rightIndex < list.getElements().length && list.get(rightIndex) != null) {
            // если правый > наибольшего
            if((int)list.get(rightIndex) > (int)list.get(large))
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
        // добавляем в список
        list.add(e);
        // просеиваем вверх
        siftUp(size);
        // увеличиваем размер
        size++;
    }

    /**
     * Забираем верхний элемент
     * @return
     */
    public int top() {
        Integer top = (int)list.get(0);
        remove((E) top);
        return top;
    }

    /**
     * Возвращаем наибольший элемент
     * @return
     */
    public int peek() {
        return (int)list.get(0);
    }

    /**
     * Удаление элемента
     * @param e
     */
    public void remove(E e) {
        Integer searchIndex = null;
        // ищим элемент
        for(int i = 0; i < list.getElements().length; i++) {
            if(list.get(i).equals(e)) {
                searchIndex = i;
                // обновляем искомый элемент на нижний для просеивания вниз
                list.updateElem(searchIndex, list.get(size - 1));
                // удаляем последний элемент
                list.removeByIndex(size - 1);
                // уменьшаем размер
                size--;
                break;
            }
        }

        if (searchIndex == 0 || (int)list.get(searchIndex) < (int)list.get(getParentIndex(searchIndex))) {
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
            if(list.get(j) != null)
                System.out.print(list.get(j));

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
