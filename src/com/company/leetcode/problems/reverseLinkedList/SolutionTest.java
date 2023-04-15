package com.company.leetcode.problems.reverseLinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reverseList() {
        Solution solution = new Solution();
        Solution.ListNode root = new Solution.ListNode(1);
        root.next = new Solution.ListNode(2);
        root.next.next = new Solution.ListNode(3);
        root.next.next.next = new Solution.ListNode(4);
        root.next.next.next.next = new Solution.ListNode(5);

        Solution.ListNode last = solution.reverseList(root);

        while(last != null) {
            System.out.println(last.val);
            last = last.next;
        }
    }
}