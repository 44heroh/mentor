package com.company.cache.lru;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void headInsert() {
        DoublyLinkedList dll = Solution.headInsert();
        assertEquals(dll.getSize(), 10);
    }

    @Test
    void headRemove() {
        DoublyLinkedList dll = Solution.headRemove();
        assertEquals(dll.getSize(), 0);
    }

    @Test
    void lastInsert() {
        DoublyLinkedList dll = Solution.lastInsert();
        assertEquals(dll.getSize(), 10);
    }

    @Test
    void lastRemove() {
        DoublyLinkedList dll = Solution.lastRemove();
        assertEquals(dll.getSize(), 0);
    }
}