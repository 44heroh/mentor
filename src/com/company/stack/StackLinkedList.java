package com.company.stack;

/**
 * стек на LinkedList
 */
public class StackLinkedList {

    Node top;
    int size;

    public Node getTop() {
        return top;
    }

    public int getSize() {
        return size;
    }

    /**
     * Добавляем элемент в стек
     * @param value
     */
    public void push(Object value) {
        if(value == null)
            return;
        // вносимый элемент в стек
        Node tmp = new Node(value);
        // делаем вносимый элемент верхним
        tmp.next = top;
        top = tmp;
        // увеличиваем размер
        size++;
    }

    public Object pop() {
        if(isEmpty())
            return null;
        // сохраняем верхний элемент
        Node old = top;
        // присваиваем следующий таким образом передвигаем
        top = top.next;
        size--;
        return old.value;
    }

    public Object peek() {
        if(isEmpty())
            return null;

        return top.value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void print() {
        Node current = top;
        while(current != null) {
            System.out.print(current.value);
            current = current.next;
            if(current != null)
                System.out.print(" -> ");
        }
    }
}
