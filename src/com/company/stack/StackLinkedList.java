package com.company.stack;

public class StackLinkedList {

    Node top;
    int size;

    public Node getTop() {
        return top;
    }

    public int getSize() {
        return size;
    }

    public void push(Object value) {
        if(value == null)
            return;
        Node tmp = new Node(value);
        tmp.next = top;
        top = tmp;
        size++;
    }

    public Object pop() {
        if(isEmpty())
            return null;

        Node old = top;
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
