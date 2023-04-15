package com.company.leetcode.problems.linkedListCycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /**
     * 141. Linked List Cycle https://leetcode.com/problems/linked-list-cycle/
     * @param head
     * @return
     */
    public boolean hasCycle1(ListNode head) {

        ListNode current = head;
        HashMap<ListNode, Integer> map = new HashMap<>();
        while(current != null) {
            if(map.get(current) == null) {
                map.put(current, 1);
            } else {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    /**
     * 141. Linked List Cycle https://leetcode.com/problems/linked-list-cycle/
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {

        ListNode current = head;
        Set<ListNode> set = new HashSet<>();
        while(current != null) {
            if(!set.contains(current)) {
                set.add(current);
            } else {
                return true;
            }
            current = current.next;
        }

        return false;
    }
}
