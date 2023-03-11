package com.company.cache.lru;

public class Node {

    Object value;
    Node next;
    Node prev;

    public Node(Object value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}
