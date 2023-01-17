package com.company.list;

import java.util.Arrays;

public class MyList
{

    private static final int begin = 10;
    private Object[] buffer;
    private int length;
    private int size;

    public MyList()
    {
        buffer = new Object[begin];
        length = 0;
        size = begin;
    }

    /**
     * Удаление элемента из списа
     *
     * @param o
     * @return
     */
    public boolean remove(Object o)
    {
        if(o == null){
            return false;
        }

        boolean isRemoved = false;
//        Проходим по массиву
        for(int i = 0; i < length; i++){
//            Если не равен null
            if(buffer[i] != null){
//            Если находим данный элемент
                if(buffer[i].equals(o)){
//                    Ставим отметку то что элемент удалён
                    isRemoved = true;
//                Проверяем если длина - 1 равна половине размера
                    if(length - 1 == size / 2){
//                    То уменьшаем размер в 2 раза
                        size /= 2;
//                    Уменьшаем длину на 1
                        length--;
//                    Копируем это в новый массив c новым размером
                        Object[] newArr = copyToNewArr(new Object[size]);
//                    Присваиваем новый массив buffer
                        buffer = newArr;
                    }
                }

            }
//            Проверяем отметку удален ли элемент
            if(isRemoved){
                if(length > i + 1){
                    buffer[i] = buffer[i + 1];
                } else {
                    buffer[i] = null;
                }
            }
        }

        return true;
    }

    /**
     *
     *
     * @param i1
     * @param i2
     * @return
     */
    private boolean swap(int i1, int i2)
    {
        Object tmp = buffer[i1];
        buffer[i1] = buffer[i2];
        buffer[i2] = tmp;

        return true;
    }

    /**
     * Добавление в list элемента
     *
     * @param value
     * @return
     */
    public boolean add(Object value)
    {
        /*if(length > 0) {
            System.out.println();
        }*/

//        Если длина строки >= размеру
        if(length >= size) {
//            увеличиваем размер в 2 раза
            size *= 2;
//            System.out.println(Arrays.toString(new Object[size]));
//            Копируем в новый массив с новым размером старый массив
            Object[] newArr = copyToNewArr(new Object[size]);
//            System.out.println(Arrays.toString(newArr));
//            Присваиваем старому массиву новый
            buffer = newArr;
        }
//        System.out.println("length = " + length);
//        System.out.println("size = " + size);
//        Добавляем в старый массив по ключу элемент
        buffer[length] = value;
//        Увеличиваем строку на 1
        length++;
        return true;
    }

    /**
     * Копируем из старого массива в новый
     *
     * @param newArr
     * @return
     */
    private Object[] copyToNewArr(Object[] newArr)
    {
//        По символьно копируем из одного массива в другой
        for(int i = 0; i < length; i++){
            newArr[i] = buffer[i];
        }

        return newArr;
    }

    public Object[] getBuffer()
    {
        return buffer;
    }

    public void setBuffer(Object[] buffer)
    {
        this.buffer = buffer;
    }

    public int getLength()
    {
        return length;
    }

    public int getSize()
    {
        return size;
    }
}
