package com.company.stack;

import javax.swing.text.html.Option;

/**
 * Стек на массиве
 */
public class Stack {

    private Object[] array;
    private int start = 0;
    private int end;

    public Stack(int capacity) {
        this.array = new Object[capacity];
        end = capacity;
    }

    public Object[] getArray() {
        return array;
    }

    public int getStart() {
        return start;
    }

    /**
     * Добавление элемента в стэк
     * @param item
     */
    public void put(Object item) {
        if(end == start)
            return;
        // добавление элемента в конец массива
        array[start] = item;
        // увеличение размера
        start++;
    }

    /**
     * Взятие элемента сверху
     * @return
     */
    public Object pop() {
        if(start == 0)
            return null;
        // текущий эжемент массива
        Object tmp = array[start];
        // обнуляем этот элемент
        array[start] = null;
        // уменьшаем размер
        start--;
        return tmp;
    }

    public Object peek() {
        return array[start];
    }

}
