package com.company.main.tasks.mergeTwoLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void mergeTwoLists() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        Solution solution = new Solution();
        ListNode ans = solution.mergeTwoLists(l1, l2);

        while (ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}