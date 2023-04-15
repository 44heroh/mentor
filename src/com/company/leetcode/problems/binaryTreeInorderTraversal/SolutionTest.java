package com.company.leetcode.problems.binaryTreeInorderTraversal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void inorderTraversal() {
        Solution.TreeNode root;
        Solution solution = new Solution();
        root = new Solution.TreeNode(1);
        root.right = new Solution.TreeNode(2);
        root.right.left = new Solution.TreeNode(3);
        System.out.println(solution.inorderTraversal(root).toString());
    }

    @Test
    void inorderTraversalSecond() {
        Solution.TreeNode root;
        Solution solution = new Solution();
        root = new Solution.TreeNode();
        System.out.println(solution.inorderTraversal(root).toString());
    }
}