package com.company.leetcode.problems.binaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    /**
     * 102. Binary Tree Level Order Traversal https://leetcode.com/problems/binary-tree-level-order-traversal/
     * @param root
     * @return
     */
    private List<List<Integer>> ans = new ArrayList<>();
    private List<Integer> list = new ArrayList<>();
    private int level = 0;
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null)
            return new ArrayList<>(ans);
        helper(root);
        if(!list.isEmpty())
            ans.add(list);
        return new ArrayList<>(ans);
    }

    private void helper(TreeNode current) {
        if(current == null)
            return;
        else
            level++;

        int currentLevel = level - 1;
        list.add(current.val);
        if(ans.size() - 1 >= currentLevel) {
            ans.get(currentLevel).add(current.val);
        } else {
            ans.add(new ArrayList<>(list));
        }
        list.clear();

        System.out.println(current.val);
        helper(current.left);
        helper(current.right);
        level--;
    }


















    private void helper1(TreeNode current) {
        if(current == null)
            return;
        else
            level++;

        if(!list.isEmpty()){
            if(ans.size() > level - 1){
                ans.get(level - 1).add(list.get(0));
            } else {
                ans.add(new ArrayList<>(list));
            }
            list.clear();
        }

        if(current.left != null) {
            list.add(current.left.val);
        }
        if(current.right != null) {
            list.add(current.right.val);
        }
        if(list.size() == 2 && current.left != null && current.right != null){
            ans.add(new ArrayList<>(list));
            list.clear();
        }

        System.out.println(current.val);
        helper(current.left);
        helper(current.right);
        level--;
    }
}
