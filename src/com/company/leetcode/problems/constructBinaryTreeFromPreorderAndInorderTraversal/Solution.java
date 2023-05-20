package com.company.leetcode.problems.constructBinaryTreeFromPreorderAndInorderTraversal;

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
     * 105. Construct Binary Tree from Preorder and Inorder Traversal https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
     * @param preorder
     * @param inorder
     * @return
     */
    private int i, p;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        i = p = 0;
        TreeNode root = dfs(preorder, inorder, 3001);
        print(root);
        return root;
    }

    private void print(TreeNode root){
        if(root == null){
            return;
        }

        print(root.left);
        System.out.println(root.val);
        print(root.right);
    }

    private TreeNode dfs(int[] preorder, int[] inorder,  int rightBorder) {
        if(p == preorder.length || inorder[i] == rightBorder){
            return null;
        }

        TreeNode node = new TreeNode(preorder[p++]);
        node.left = dfs(preorder, inorder, node.val);
        i++;
        node.right = dfs(preorder, inorder, rightBorder);

        return node;
    }


}
