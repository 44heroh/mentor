package com.company.linkedlist;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void addTwoNumbers() {
        int[] arr1 = {2, 4, 3};
        LinkedList linkedList1 = new LinkedList();
        for(int value: arr1) {
            linkedList1.add(value);
        }

        int[] arr2 = {5,6,4};
        LinkedList linkedList2 = new LinkedList();
        for(int value: arr2) {
            linkedList2.add(value);
        }
        LinkedList actual = Solution.addTwoNumbers(linkedList1, linkedList2);
        LinkedList expected = new LinkedList<>();
        expected.add(7);
        expected.add(0);
        expected.add(8);
        assertArrayEquals(actual, expected);
    }

    private boolean assertArrayEquals(LinkedList actual, LinkedList expected) {
        return actual.equals(expected);
    }
}