package com.company.hash.map;

public class Node<K, V> {

    public Object value;
    public Object key;
    public Node next;

    public Node(Object value, Object key) {
        this.value = value;
        this.key = key;
        this.next = null;
    }

    public Node(Object value, Object key, Node next) {
        this.value = value;
        this.key = key;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", key=" + key +
                ", next=" + next +
                '}';
    }
}
