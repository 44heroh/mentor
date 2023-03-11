package com.company.cache.lru;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int capacity = 5;
//        HashMap map = new HashMap();
//        for(int i = 0; i < capacity; i++) {
//            map.put(i, i);
//        }
//        map.remove(3);
//        int capacity = 5;
        CacheLru cacheLru = new CacheLru(capacity);
        for(int i = 0; i < capacity + capacity; i++) {
            cacheLru.set(i, i);
        }

//        cacheLru.printCache();
        cacheLru.getCache_vals().print();
        cacheLru.get(7);
//        cacheLru.printCache();
        cacheLru.getCache_vals().print();
        cacheLru.get(5);
//        cacheLru.printCache();
        cacheLru.getCache_vals().print();
        cacheLru.get(5);
//        cacheLru.printCache();
        cacheLru.getCache_vals().print();
        cacheLru.get(9);
        cacheLru.getCache_vals().print();
    }

    public static DoublyLinkedList lastInsert() {
        int capacity = 10;
        DoublyLinkedList dll = new DoublyLinkedList();
        for(int i = 0; i < capacity; i++) {
            dll.insertLast(i);
        }
        dll.print();

        return dll;
    }

    public static DoublyLinkedList lastRemove() {
        int capacity = 10;
        DoublyLinkedList dll = new DoublyLinkedList();
        for(int i = 0; i < capacity; i++) {
            dll.insertLast(i);
        }
        dll.print();

        for(int i = 0; i < capacity; i++) {
            dll.removeLast();
        }
        dll.print();

        return dll;
    }

    public static DoublyLinkedList headInsert() {
        int capacity = 10;
        DoublyLinkedList dll = new DoublyLinkedList();
        for(int i = 0; i < capacity; i++) {
            dll.insertHead(i);
        }
        dll.print();

        return dll;
    }

    public static DoublyLinkedList headRemove() {
        int capacity = 10;
        DoublyLinkedList dll = new DoublyLinkedList();
        for(int i = 0; i < capacity; i++) {
            dll.insertHead(i);
        }
        dll.print();

        for(int i = 0; i < capacity; i++) {
            dll.removeHead();
        }
        dll.print();

        return dll;
    }
}
