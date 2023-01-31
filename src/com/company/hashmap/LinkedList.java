package com.company.hashmap;

public class LinkedList {

    private int key;
    private Node root;
    private int size;

    public LinkedList() {
        root = null;
        size = 0;
    }

    public LinkedList(Node root, int key) {
        this.root = root;
        this.key = key;
        size = 0;
    }

    /**
     * Возвращаем key
     * @return
     */
    public int getKey() {
        return key;
    }

    /**
     * Возвращаем root
     * @return
     */
    public Node getRoot() {
        return root;
    }

    /**
     * Возвращаем size
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * Добавление в связанный список
     * @param node
     */
    public void add(Node node) {
        //Пробегаемся до конца списка и вставляем в конечный элемент value
        if(root == null)
            root = node;
        Node current = root;
        while(current.next != null) {
            current = current.next;
        }
        //Вставляем в конец элемент
        current.next = node;
        //Увеличиваем размер
        size++;
    }

    /**
     * Поиск элемент в связанном списке
     * @param value
     * @return
     */
    public boolean find(Object value) {
        Node current = root;
        while(current.next != null) {
            current = current.next;
            if(current.value.equals(value)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Поиск элемент в связанном списке
     * @param value
     * @return
     */
    public Node get(Object value) {
        Node current = root;
        //Пробегаемся до конца списка
        while(current != null) {
            // ищем элемент
            if(current.value.equals(value)) {
                return current;
            }
            current = current.next;
            // если следующий элемент null
            if(current.next == null) {
                return null;
            }
        }

        return null;
    }

    /**
     * Просмотр связанного списка
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
