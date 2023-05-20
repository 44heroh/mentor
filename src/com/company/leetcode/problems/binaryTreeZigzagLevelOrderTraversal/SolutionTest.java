package com.company.leetcode.problems.binaryTreeZigzagLevelOrderTraversal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void zigzagLevelOrder() {
        Solution.TreeNode root = new Solution.TreeNode(3);
        root.left = new Solution.TreeNode(9);
        root.right = new Solution.TreeNode(20);
        root.right.left = new Solution.TreeNode(15);
        root.right.right = new Solution.TreeNode(7);
        Solution solution = new Solution();
        System.out.println(solution.zigzagLevelOrder(root));
    }

    @Test
    void zigzagLevelOrder1() {
        Solution.TreeNode root = new Solution.TreeNode(1);
        root.left = new Solution.TreeNode(2);
        root.right = new Solution.TreeNode(3);
        root.left.left = new Solution.TreeNode(4);
        root.left.right = new Solution.TreeNode(5);
        Solution solution = new Solution();
        System.out.println(solution.zigzagLevelOrder(root));
    }

    @Test
    void zigzagLevelOrder2() {
        Solution.TreeNode root = new Solution.TreeNode(0);
        root.left = new Solution.TreeNode(2);
        root.right = new Solution.TreeNode(4);
        root.left.left = new Solution.TreeNode(1);
        root.left.left.left = new Solution.TreeNode(5);
        root.left.left.right = new Solution.TreeNode(1);
        root.right.left = new Solution.TreeNode(3);
        root.right.left.right = new Solution.TreeNode(6);
        root.right.right = new Solution.TreeNode(-1);
        root.right.right.right = new Solution.TreeNode(8);
        Solution solution = new Solution();
        System.out.println(solution.zigzagLevelOrder(root));
    }
}