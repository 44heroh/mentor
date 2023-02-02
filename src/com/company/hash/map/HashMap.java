package com.company.hash.map;

import com.company.list.DataList;

public class HashMap<K, V> {

    private DataList<LinkedList<Node<K, V>>> list;
    private DataList listKeys;
    private int size;
    private int numsBucket;

    /**
     * Конструктор
     * @param numsBucket
     */
    public HashMap(int numsBucket) {
        list = new DataList<>();
        listKeys = new DataList<>();
        size = 0;
        this.numsBucket = numsBucket;
    }

    public DataList<LinkedList<Node<K, V>>> getList() {
        return list;
    }

    public DataList getListKeys() {
        return listKeys;
    }

    /**
     * Добавление в hash map
     * @param key
     * @param value
     */
    public void add(K key, V value) {
        // Находим hash
        int hash = hashFunc(key);
        // Проверяем есть ли hash в list
        if(list.get(hash) == null){
            // Если нет то создаём новый LinkedList
            LinkedList linkedList = new LinkedList<>(new Node(key, value), hash);
            // Добавляем его в list
            list.add(linkedList);
            listKeys.add(hash);
        } else {
            // Если есть то возвращаем LinkedList по hash
            LinkedList linkedList = (LinkedList) list.get(hash);
            // Добавляем в его конец элемент
            linkedList.add(new Node(key, value));
        }

        size++;
    }

    /**
     * Возвращаем элемент по ключу
     * @param key
     * @return
     */
    public Node get(K key) {
        // Проверяем есть ли элемент по hash в list
        if(list.get(hashFunc(key)) != null) {
            // Если есть то возвращаем LinkedList по hash
            LinkedList linkedList = (LinkedList) list.get(hashFunc(key));
            // Ищем в LinkedList элемент по ключу
            Node current = linkedList.getRoot();
            while(!current.key.equals(key)) {
                current = current.next;
            }

            return current;
        }

        return null;
    }

    /**
     * создание hash
     * @param key
     * @return
     */
    private int hashFunc(K key) {
        int index = 0;
        int hashCode = key.hashCode();
        if(hashCode > 0)
            index = hashCode % numsBucket;
        return index;
    }

    /**
     * Показываем весь HashMap
     */
    public void print() {
        for(int i = 0; i < list.getElements().length; i++) {
            LinkedList linkedList = (LinkedList) list.get(i);
            linkedList.print();
        }
    }
}
