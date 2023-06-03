package com.company.leetcode.problems.copyListwithRandomPointer;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    /**
     * 138. Copy List with Random Pointer https://leetcode.com/problems/copy-list-with-random-pointer/
     * @param head
     * @return
     */
    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        Node current = head;
        while (current != null) {
            Node node = new Node(current.val);
            map.put(current, node);
            current = current.next;
        }

        current = head;
        while (current != null) {
            Node node = map.get(current);
            node.next = map.get(current.next);
            node.random = map.get(current.random);
            current = current.next;
        }

        return map.get(head);
    }
}
