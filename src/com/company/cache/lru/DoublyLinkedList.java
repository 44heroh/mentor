package com.company.cache.lru;

public class DoublyLinkedList {

    DoublyLinkedListNode head;
    DoublyLinkedListNode last;
    int size = 0;

    /**
     * Конструктор
     */
    public DoublyLinkedList() {
        size = 0;
        head = null;
        last = null;
    }

    /**
     * Вставка в начало списка
     * @param node
     */
    public void insertHeadNode(DoublyLinkedListNode node) {
        // если head == null
        if(head == null){
            // приравниваем вставляемый элемент к голове списка
            head = node;
            // если last == null
            if(last == null)
                // приравниваем конец списка к вставляемому элементу
                last = node;
        } else {
            // следующий вставляемого приравниваем голове списка
            node.next = head;
            // предыдущий головы списка приравниваем к вставляемому
            head.prev = node;
            // голову списка приравниваем к вставляемому элементу
            head = node;

        }
        // увеличиваем счетчик
        size++;
    }

    /**
     * Вставка в начала списка
     * @param value
     */
    public void insertHead(Object value) {
        // если head == null
        if(head == null){
            // создаём вставляемый элемент
            DoublyLinkedListNode temp = new DoublyLinkedListNode(value, value);
            // приравниваем вставляемый элемент к голове списка
            head = temp;
            // если last == null
            if(last == null)
                // приравниваем конец списка к вставляемому элементу
                last = temp;
        } else {
            // создаём вставляемый элемент
            DoublyLinkedListNode temp = new DoublyLinkedListNode(value, value);
            // следующий вставляемого приравниваем голове списка
            temp.next = head;
            // предыдущий головы списка приравниваем к вставляемому
            head.prev = temp;
            // голову списка приравниваем к вставляемому элементу
            head = temp;

        }
        // увеличиваем счетчик
        size++;
    }

    /**
     * Вставляем узел в конец списка
     * @param node
     */
    public void insertLastNode(DoublyLinkedListNode node) {
        if(last == null){
            // приравниваем конец списка к вставляемому элементу
            last = node;
            // если head == null
            if(head == null)
                // голову списка приравниваем к вставляемому элементу
                head = node;
        } else {
            // предыдущий вставляемого приравниваем к концу списка
            node.prev = last;
            // следующий конца списка приравниваем к вставляемому
            last.next = node;
            // приравниваем конец списка к вставляемому элементу
            last = node;
        }

        size++;
    }

    /**
     * Вставляем элемент в конец списка
     * @param value
     */
    public void insertLast(Object value) {
        // если last == null
        if(last == null){
            // создаём вставляемый элемент
            DoublyLinkedListNode temp = new DoublyLinkedListNode(value, value);
            // приравниваем конец списка к вставляемому элементу
            last = temp;
            // если head == null
            if(head == null)
                // голову списка приравниваем к вставляемому элементу
                head = temp;
        } else {
            // создаём вставляемый элемент
            DoublyLinkedListNode temp = new DoublyLinkedListNode(value, value);
            // предыдущий вставляемого приравниваем к концу списка
            temp.prev = last;
            // следующий конца списка приравниваем к вставляемому
            last.next = temp;
            // приравниваем конец списка к вставляемому элементу
            last = temp;
        }

        size++;
    }

//    public void insertLastNode(DoublyLinkedListNode node) {
//        if(head == null){
//            DoublyLinkedListNode DoublyLinkedListNode = node;
//            head = DoublyLinkedListNode;
//            last = DoublyLinkedListNode;
//        } else {
//            DoublyLinkedListNode DoublyLinkedListNode = node;
//            DoublyLinkedListNode.prev = last;
//            last.next = DoublyLinkedListNode;
//            last = DoublyLinkedListNode;
//        }
//
//        size++;
//    }

    /**
     * Удаляем элемент из головы списка
     * @return
     */
    public DoublyLinkedListNode removeHead() {
        // сохраняем во временную переменную голову списка
        DoublyLinkedListNode temp = head;
        // передвигаем голову списка к следующему элементу
        head = head.next;
        // предыдущий головы списка приравниваем к null
        head.prev = null;

        size--;
        return temp;
    }

    /**
     * Удаляем элемент из конца списка
     */
    public DoublyLinkedListNode removeLast() {
        // сохраняем во временную переменную конец списка
        DoublyLinkedListNode temp = last;
        // передвигаем конец списка к предыдущему элементу
        last = last.prev;
        // предыдущий конец списка приравниваем к null
        last.next = null;

        size--;
        return temp;
    }

    public DoublyLinkedListNode getHead() {
        return head;
    }

    public DoublyLinkedListNode getLast() {
        return last;
    }

    public int getSize() {
        return size;
    }

    public void setHead(DoublyLinkedListNode head) {
        this.head = head;
    }

    public void setLast(DoublyLinkedListNode last) {
        this.last = last;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void print() {
        DoublyLinkedListNode current = head;
        while(current != null) {
            System.out.print(current.value);
            current = current.next;
            if(current != null)
                System.out.print(" -> ");
        }

        System.out.println();
    }
}
