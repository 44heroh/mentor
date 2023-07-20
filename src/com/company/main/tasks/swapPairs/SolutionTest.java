package com.company.main.tasks.swapPairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void swapPairs() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        Solution solution = new Solution();
        ListNode ans = solution.swapPairs(head);
        solution.print(ans);
    }
}