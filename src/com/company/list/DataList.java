package com.company.list;

import java.util.Arrays;

public class DataList<E> {
    private static final int commonMulti = 2;
    private Object[] elements;
    public int size;
    private static final int defaultSize = 10;

    /**
     * Конструктор
     */
    public DataList() {
        this.elements = new Object[defaultSize];
        this.size = 0;
    }

    /**
     * Получаем массив элементов
     * @return
     */
    public Object[] getElements() {
        return elements;
    }

    /**
     * Получаем размер
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * Добавление элемента в list
     * @param e
     */
    public void add(E e) {
        // если длина массива < размер + 1
        if(elements.length < size + 1){
            // модифицируем массив
            modifyArr(new Object[(int) (size * commonMulti)], size);
        }
        // добавляем элемент в массив
        elements[size++] = e;
    }

    /**
     * Удаление элемента из list
     * @param e
     */
    public void remove(E e) {
        int sizeTmp = size;
        // если половина длины массива >= размер - 1 и длина >= 10
        if(elements.length / commonMulti >= size - 1 && elements.length >= defaultSize){
            sizeTmp = (int) elements.length / commonMulti;
        }
        // проходим массив до установленного sizeTmp + 1
        for(int i = 0; i < sizeTmp + 1; i++) {
            if(elements[i] != null){
                // если находим элемент
                if(elements[i].equals(e)) {
                    // то начиная с этого элемента приравниваем следующий элемент
                    elements[i] = elements[i + 1];
                }
            }
        }
        // если установленный sizeTmp равен половине длины и длина >= 10
        if((int) elements.length / commonMulti == sizeTmp && elements.length >= defaultSize){
            // модифицируем массив
            modifyArr(new Object[sizeTmp], sizeTmp);
        }
        size--;
    }

    /**
     * Удаление по индексу
     * @param index
     */
    public void removeByIndex(int index) {
        int sizeTmp = size;
        // если index != последнему индексу
        if(index != size - 1) {
            for(int i = 0; i < sizeTmp + 1; i++) {
                if(i >= index) {
                    elements[i] = elements[i + 1];
                }
            }
        // если index == последнему индексу
        } else if(index == size - 1) {
            elements[index] = null;
        }

        // если установленный sizeTmp равен половине длины и длина >= 10
        if((int) elements.length / commonMulti == size - 1 && elements.length >= defaultSize){
            // модифицируем массив
            modifyArr(new Object[(int) elements.length / commonMulti], (int) elements.length / commonMulti);
        }
        size--;
    }

    /**
     * Получаем элемент по индексу
     * @param index
     * @return
     */
    public Object get(int index) {
        Object element = elements[index];
        return element;
    }

    /**
     * Получаем индекс элемента
     * @param e
     * @return
     */
    public Integer getIndex(int e) {
        for(int i = 0; i < elements.length; i++) {
            if(elements[i] != null) {
                if(elements[i].equals(e)) {
                    return i;
                }
            } else {
                break;
            }
        }
        return null;
    }

    /**
     * Проверка на существование элемента в массиве
     * @param e
     * @return
     */
    public boolean isExist(E e) {
        for(int i = 0; i < elements.length; i++) {
            if(elements[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    /**
     * модифицирование массива
     * @param newArr
     * @param newSize
     */
    private void modifyArr(Object[] newArr, int newSize) {
        elements = copy(newArr, newSize);
    }

    /**
     * копирование массива
     * @param newArr
     * @param size
     * @return
     */
    private Object[] copy(Object[] newArr, int size) {
        for(int i = 0; i < size; i++) {
            newArr[i] = elements[i];
        }
        return newArr;
    }

    /**
     * Меняем местами элементы в массиве
     * @param index1
     * @param index2
     */
    public void swap(int index1, int index2) {
        Object tmp = elements[index1];
        elements[index1] = elements[index2];
        elements[index2] = tmp;
    }

    /**
     * Обновление элемента
     * @param index
     * @param value
     */
    public void updateElem(int index, Object value) {
        elements[index] = value;
    }

    /**
     * проверка на пустоту
     * @return
     */
    public boolean isEmpty() {
        return size == 0 || elements == null;
    }
}
