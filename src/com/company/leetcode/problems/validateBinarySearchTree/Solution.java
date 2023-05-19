package com.company.leetcode.problems.validateBinarySearchTree;

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
    }

    /**
     * 98. Validate Binary Search Tree https://leetcode.com/problems/validate-binary-search-tree/
     * @param root
     * @return
     */

    public boolean isValid = true;
    public TreeNode prev = null;
    public boolean direction = false;
    public boolean isValidBST(TreeNode root) {
        helper(root, direction);
        return isValid;
    }

    private void helper(TreeNode current, boolean dirc) {
        if (current == null)
            return;
        if(dirc == true && direction != true)
            direction = !direction;
        helper(current.left, false);

        if(prev != null && current != prev){
            if(!direction && current.val >= prev.val){
                isValid = false;
                return;
            } else if(direction && current.val <= prev.val) {
                isValid = false;
                return;
            }
        }

        prev = current;
        helper(current.right, true);
        if(dirc == direction)
            direction = !direction;
    }
}
