package com.company.queue;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        QueueLinkedList qll = new QueueLinkedList();
        for(int i = 0; i < 10; i++) {
            qll.push(i);
        }
        qll.print();
        System.out.println("first = " + qll.getFirst().value);
        System.out.println("last = " + qll.getLast().value);
        Object old = qll.pop();
        System.out.println("old = " + old);
        System.out.println("first = " + qll.getFirst().value);
        System.out.println("last = " + qll.getLast().value);
        old = qll.pop();
        System.out.println("old = " + old);
        System.out.println("first = " + qll.getFirst().value);
        System.out.println("last = " + qll.getLast().value);
    }

    public static void mainArray(String[] args) {
        int size = 10;
        Queue queue = new Queue(size);
        for(int i = 0; i < size; i++) {
            queue.push(i);
        }

        System.out.println(Arrays.toString(queue.getArray()));
        queue.pop();
        System.out.println(Arrays.toString(queue.getArray()));
    }
}
