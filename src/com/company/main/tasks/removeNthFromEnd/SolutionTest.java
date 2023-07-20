package com.company.main.tasks.removeNthFromEnd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void removeNthFromEnd() {
        int n = 2;
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);

        Solution solution = new Solution();
        ListNode ans = solution.removeNthFromEnd(node, n);

        while (ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}