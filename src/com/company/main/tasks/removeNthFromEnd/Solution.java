package com.company.main.tasks.removeNthFromEnd;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {

    /**
     * 19. Remove Nth Node From End of List https://leetcode.com/problems/remove-nth-node-from-end-of-list/
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0);
        ListNode fast = start, slow = start;
        slow.next = head;

        // Двигаем fast вперёд чтобы зазор slow и fast стал n
        for (int i = 1; i <= n + 1; i++) {
            fast = fast.next;
        }

        // Двигаем fast и оставляем зазор
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return start.next;
    }
}
