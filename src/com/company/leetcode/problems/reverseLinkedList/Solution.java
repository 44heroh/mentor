package com.company.leetcode.problems.reverseLinkedList;

public class Solution {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(){
        }
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }

    /**
     * 206. Reverse Linked List https://leetcode.com/problems/reverse-linked-list/
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode current = head;

        while(current != null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public ListNode reverseList1(ListNode head) {
        ListNode current = head;
        ListNode last = new ListNode(head.val);
        while(current.next != null) {
            current = current.next;
            ListNode tmp = new ListNode(current.val);
            tmp.next = last;
            last = tmp;
        }

        return last;
    }
}
