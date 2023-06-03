package com.company.leetcode.problems.sortList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void sortList() {
        Solution.ListNode root = new Solution.ListNode(-1);
        root.next = new Solution.ListNode(5);
        root.next.next = new Solution.ListNode(3);
        root.next.next.next = new Solution.ListNode(4);
        root.next.next.next.next = new Solution.ListNode(0);
        Solution solution = new Solution();
        System.out.println(solution.sortList(root));
    }
}