package com.company.leetcode.problems.intersectionOfTwoLinkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void getIntersectionNode() {
        Solution.ListNode rootMain = new Solution.ListNode(8);
        rootMain.next = new Solution.ListNode(4);
        rootMain.next.next = new Solution.ListNode(5);

        Solution.ListNode root1 = new Solution.ListNode(4);
        root1.next = new Solution.ListNode(1);
        root1.next.next = rootMain;
        root1.next.next.next = rootMain.next;
        root1.next.next.next.next = rootMain.next.next;

        Solution.ListNode root2 = new Solution.ListNode(5);
        root2.next = new Solution.ListNode(6);
        root2.next.next = new Solution.ListNode(1);
        root2.next.next.next = rootMain;
        root2.next.next.next.next = rootMain.next;
        root2.next.next.next.next.next = rootMain.next.next;

        Solution solution = new Solution();
        Solution.ListNode result = solution.getIntersectionNode(root1, root2);
        System.out.println(result.val);
    }
}