package com.company.linkedlist;

public class Node<K, V> {
    public Object value;
    public Node<K, V> next;

    public Node(Object value) {
        this.value = value;
        this.next = null;
    }

    public Node(Object value, Node<K, V> next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
