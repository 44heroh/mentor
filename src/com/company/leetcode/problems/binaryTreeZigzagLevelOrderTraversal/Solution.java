package com.company.leetcode.problems.binaryTreeZigzagLevelOrderTraversal;

import java.util.*;

public class Solution {

    public static class TreeNode {
        int val;
        Solution.TreeNode left;
        Solution.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, Solution.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    /**
     * 103. Binary Tree Zigzag Level Order Traversal https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
     * @param root
     * @return
     */
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        if(root == null)
            return res;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);

        while(!deque.isEmpty()){
            LinkedList<Integer> current = new LinkedList<>();
            int m = deque.size();
            for (int i = 0; i < m; i++){
                TreeNode node = deque.removeFirst();

                if(res.size() % 2 == 0) {
                    current.add(node.val);
                } else {
                    current.add(0, node.val);
                }

                if(node.left != null)
                    deque.add(node.left);
                if(node.right != null)
                    deque.add(node.right);

            }

            res.add(current);
        }
        return res;
    }

}
