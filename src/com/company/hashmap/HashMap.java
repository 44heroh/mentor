package com.company.hashmap;

import com.company.list.DataList;

import java.util.Arrays;

public class HashMap<E> {

    private int size;
    private DataList<LinkedList> list;
    private DataList<Integer> listKeys;

    /**
     * Конструктор
     */
    public HashMap() {
        list = new DataList<LinkedList>();
        listKeys = new DataList<Integer>();
        size = 0;
    }

    /**
     * Возвращаем size
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * Возвращаем list
     * @return
     */
    public DataList<LinkedList> getList() {
        return list;
    }

    /**
     * Возвращаем listKeys
     * @return
     */
    public DataList<Integer> getListKeys() {
        return listKeys;
    }

    /**
     * Добавление в HashMap
     * @param value
     */
    public void add(Object value) {
        // находим ключ
        int key = hashCode(value);
        // Если list пустой и index ключа == null
        if(list.isEmpty() || listKeys.getIndex(key) == null) {
            // Создаём новый LinkedList
            LinkedList linkedList = new LinkedList(new Node(value), key);
            // Добавляем ключ в список ключей
            listKeys.add(key);
            // Добавляем LinkedList в список списков LinkedList
            list.add(linkedList);
            // Увеличиваем размер
            size++;
        } else {
            // Проходим по списку списков LinkedList
            for(int i = 0; i < list.getElements().length; i++) {
                LinkedList linkedList = (LinkedList) list.get(i);
                // ищем LinkedList по ключу
                if(linkedList.getKey() == key) {
                    // Добавляем новое значение в список
                    linkedList.add(new Node(value));
                    // Увеличиваем размер
                    size++;
                    break;
                }
            }
        }
    }

    /**
     * Возвращение элемента
     * @param e
     * @return
     */
    public Object get(E e){
        int key = hashCode(e);
        Integer index = listKeys.getIndex(key);
        if(index != null) {
            LinkedList linkedList = (LinkedList) list.get(index);
            return linkedList.get(e);
        }

        return null;
    }

    /**
     * создание hash
     * @param value
     * @return
     */
    public static int hashCode(Object value) {
        int hash = 7;
        hash = 31 * hash + (value == null ? 0 : value.hashCode());
        return hash;
    }

//    public int hashCode() {
//        int hash = 7;
//        hash = 31 * hash + (int) id;
//        hash = 31 * hash + (name == null ? 0 : name.hashCode());
//        hash = 31 * hash + (email == null ? 0 : email.hashCode());
//        return hash;
//    }

}
