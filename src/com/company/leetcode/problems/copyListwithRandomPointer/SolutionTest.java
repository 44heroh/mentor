package com.company.leetcode.problems.copyListwithRandomPointer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void copyRandomList() {
        Solution.Node root = new Solution.Node(7);
        root.next = new Solution.Node(13);
        root.next.random = root;
        root.next.next = new Solution.Node(11);
        root.next.next.next = new Solution.Node(10);
        root.next.next.next.random = root.next.next;
        root.next.next.next.next = new Solution.Node(1);
        root.next.next.random = root.next.next.next.next;
        root.next.next.next.next.random = root;

        Solution solution = new Solution();
        Solution.Node node = solution.copyRandomList(root);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}