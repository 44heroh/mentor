package com.company.cache.lru;

public class DoublyLinkedListNode<K, V> {

    public Object value;
    public Object key;
    public DoublyLinkedListNode next;
    public DoublyLinkedListNode prev;

    public DoublyLinkedListNode(Object value, Object key) {
        this.value = value;
        this.key = key;
        this.next = null;
        this.prev = null;
    }

    public DoublyLinkedListNode(Object value, Object key, DoublyLinkedListNode next, DoublyLinkedListNode prev) {
        this.value = value;
        this.key = key;
        this.next = next;
    }

//    @Override
//    public String toString() {
//        return "DoublyLinkedListNode{" +
//                "value=" + value +
//                ", key=" + key +
//                ", next=" + next +
//                ", prev=" + prev +
//                '}';
//    }
}
