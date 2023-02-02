package com.company.hash.map;

public class LinkedList<N> {

    private Node root;
    private Object key;
    private int size;

    public LinkedList() {
        root = null;
        size = 0;
    }

    public LinkedList(Node root, Object key) {
        this.root = root;
        this.key = key;
        size = 0;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    /**
     * Добавляем элемент в LinkedList
     * @param node
     */
    public void add(Node node) {
        // Проверяем root на null
        if(root == null) {
            // Если равен то приравниваем входящий элемент
            root = node;
            // Увеличиваем размер
            size++;
            return;
        }

        // Пробегаем по всему LinkedList
        Node current = root;
        while(current.next != null) {
            current = current.next;
        }

        // Добавляем в конец входящий элемент
        current.next = node;
        size++;
    }

    /**
     * Возвращаем элемент по ключу
     * @param key
     * @return
     */
    public Node get(Object key) {
        // Пробегаем по всему LinkedList
        Node current = root;
        while(current.next != null) {
            // Ищем элемент по ключу
            if(current.key.equals(key)){
                // Если нашли возвращаем
                return current;
            }
            current = current.next;
        }
        return null;
    }

    /**
     * Распечатка всего LinkedList
     */
    public void print() {
        Node current = root;
        System.out.println(current.toString());
        while(current.next != null) {
            current = current.next;
            System.out.println(current.toString());
        }
    }
}
