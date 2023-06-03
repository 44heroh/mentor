package com.company.leetcode.problems.populatingNextRightPointersInEachNode;

public class Solution {

    public static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    ", next=" + next +
                    '}';
        }
    };

    /**
     * 116. Populating Next Right Pointers in Each Node https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
     * @param root
     * @return
     */
    public Node connect(Node root) {
        if(root == null || root.left == null || root.right == null)
            return root;

        root.left.next = root.right;

        if(root.next != null)
            root.right.next = root.next.left;

        connect(root.left);
        connect(root.right);

        return root;
    }

    public Node connect1(Node root) {
        if(root == null || root.left == null || root.right == null)
            return root;

        root.next = null;
        Node current = root;
        Node next = root;

        while (current != null && next != null) {
            current.left.next = current.right;

            if(current.next != null){
                current.right.next = current.next.left;
            }

            current = current.next;
            if(current == null){
                current = next;
                next = current.left;
            }
        }

        System.out.println(root.toString());

        return root;
    }

    public void print(Node current){
        if(current == null)
            return;

        print(current.left);
        System.out.println(current.val);
        print(current.right);
    }
}
