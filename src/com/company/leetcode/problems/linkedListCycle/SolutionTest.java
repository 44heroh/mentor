package com.company.leetcode.problems.linkedListCycle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void hasCycle() {
        Solution solution = new Solution();

//        Solution.ListNode root = new Solution.ListNode(3);
//        root.next = new Solution.ListNode(2);
//        root.next.next = new Solution.ListNode(0);
//        root.next.next.next = new Solution.ListNode(-4);
//        root.next.next.next = root.next;

//        Solution.ListNode root = new Solution.ListNode(1);
//        root.next = new Solution.ListNode(2);
//        root.next = root;

        Solution.ListNode root = new Solution.ListNode(1);

        System.out.println(solution.hasCycle(root));
    }
}