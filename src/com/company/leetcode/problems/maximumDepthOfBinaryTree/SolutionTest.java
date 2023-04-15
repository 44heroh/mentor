package com.company.leetcode.problems.maximumDepthOfBinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxDepth() {
        Solution solution = new Solution();
        Solution.TreeNode root = new Solution.TreeNode(3);
        root.left = new Solution.TreeNode(9);
        root.left.left = new Solution.TreeNode(5);
        root.left.right = new Solution.TreeNode(8);
        root.left.left.left = new Solution.TreeNode(18);
        root.left.left.right = new Solution.TreeNode(16);
        root.right = new Solution.TreeNode(20);
        root.right.left= new Solution.TreeNode(15);
        root.right.right = new Solution.TreeNode(7);
//        Solution.TreeNode root = new Solution.TreeNode(1);
//        root.right = new Solution.TreeNode(2);

        int result = solution.maxDepth(root);
        System.out.println(result);
    }
}