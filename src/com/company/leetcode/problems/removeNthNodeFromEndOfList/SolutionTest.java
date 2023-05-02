package com.company.leetcode.problems.removeNthNodeFromEndOfList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void removeNthFromEnd() {
        Solution.ListNode root = new Solution.ListNode(1);
        root.next = new Solution.ListNode(2);
        root.next.next = new Solution.ListNode(3);
        root.next.next.next = new Solution.ListNode(4);
        root.next.next.next.next = new Solution.ListNode(5);

        Solution solution = new Solution();
        Solution.ListNode result = solution.removeNthFromEnd(root, 2);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }

    @Test
    void removeNthFromEnd1() {
        Solution.ListNode root = new Solution.ListNode(1);

        Solution solution = new Solution();
        Solution.ListNode result = solution.removeNthFromEnd(root, 2);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }

    @Test
    void removeNthFromEnd2() {
        Solution.ListNode root = new Solution.ListNode(1);
        root.next = new Solution.ListNode(2);

        Solution solution = new Solution();
        Solution.ListNode result = solution.removeNthFromEnd(root, 1);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}