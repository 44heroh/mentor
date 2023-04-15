package com.company.leetcode.problems.binaryTreeInorderTraversal;

import com.company.search.binary.tree.BinaryTreeSearch;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> list = new ArrayList<>();
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

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        recursiveInorderTraversal(root, list);

        return list;
    }

    public void recursiveInorderTraversal(TreeNode root, List<Integer> result) {
        if(root == null)
            return ;
        if(root.left != null)
            recursiveInorderTraversal(root.left, result);
        result.add(root.val);
        if(root.right != null)
            recursiveInorderTraversal(root.right, result);
    }

}
