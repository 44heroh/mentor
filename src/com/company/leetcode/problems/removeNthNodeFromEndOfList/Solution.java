package com.company.leetcode.problems.removeNthNodeFromEndOfList;

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
     * 19. Remove Nth Node From End of List https://leetcode.com/problems/remove-nth-node-from-end-of-list/
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.equals(null))
            return new ListNode();

        int size = 0;
        ListNode tmp = head;
        while(tmp != null){
            tmp = tmp.next;
            size++;
        }

        if(size == 1){
            return null;
        }

        ListNode current = head;
        int count = 0;
        ListNode currentPrev = head;
        ListNode currentEdit = new ListNode();
        ListNode result = currentEdit;
        while(current != null){
            if(count == size - n){
                currentPrev.next = current.next;
            } else {
                currentPrev = current;
                currentEdit.next = new ListNode(currentPrev.val);
                currentEdit = currentEdit.next;
            }

            current = current.next;
            count++;
        }

        return result.next;
    }
}
