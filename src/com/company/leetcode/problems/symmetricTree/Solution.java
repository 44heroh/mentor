package com.company.leetcode.problems.symmetricTree;

import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    public boolean isSymmetricRecursive(TreeNode root) {
        return isMirror(root.left, root.right);
    }

    public boolean isMirror(TreeNode leftNode, TreeNode rightNode) {
        if(leftNode == null && rightNode == null) return true;
        if(leftNode == null || rightNode == null || leftNode.val != rightNode.val) return false;

        return isMirror(leftNode.left, rightNode.right) && isMirror(leftNode.right, rightNode.left);
    }

    public boolean isSymmetricIteratively(TreeNode root) {
        Queue<TreeNode> queue = new PriorityQueue<>((x, y) -> Integer.compare(x.val, y.val));
        queue.add(root.right);
        queue.add(root.left);

        System.out.println(queue.toString());
        while(!queue.isEmpty()) {
            TreeNode right = queue.poll();
            TreeNode left = queue.poll();

            if(left == null && right == null) {
                continue;
            }
            if(left == null || right == null || right.val != left.val) {
                return false;
            }

            queue.add(right.right);
            queue.add(left.left);
            queue.add(right.left);
            queue.add(left.right);
            System.out.println(queue.toString());
        }
        return true;
    }
}
