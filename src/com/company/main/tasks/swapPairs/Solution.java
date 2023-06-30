package com.company.main.tasks.swapPairs;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {

    /**
     * 24. Swap Nodes in Pairs https://leetcode.com/problems/swap-nodes-in-pairs/
     * @param node
     * @return
     */
     public ListNode swapPairs(ListNode node) {
         if(node == null || node.next == null) {
             return node;
         }

         ListNode next = node.next;
         node.next = swapPairs(next.next);
         next.next = node;

         return next;
     }

     public void print(ListNode head) {
         while (head != null) {
             System.out.println(head.val);
             head = head.next;
         }
     }
}
