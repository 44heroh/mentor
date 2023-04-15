package com.company.leetcode.problems.convertSortedArrayToBinarySearchTree;

import com.company.search.binary.tree.BinaryTreeSearch;

public class Solution {

    public class TreeNode {
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
     * 108. Convert Sorted Array to Binary Search Tree https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
     * @param nums
     * @return
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int middle = (left + right) / 2;
        TreeNode root = new TreeNode(nums[middle]);
        root.left = createBST(nums, left, middle - 1);
        root.right = createBST(nums, middle + 1, right);

        return root;
    }

    public TreeNode createBST(int[] nums, int left, int right) {
        if(left > right) {
            return null;
        } else if(left == right) {
            return new TreeNode(nums[left]);
        }

        int middle = (left + right) / 2;
        TreeNode node = new TreeNode(nums[middle]);
        node.left = createBST(nums, left, middle - 1);
        node.right = createBST(nums, middle + 1, right);

        return node;
    }
}



