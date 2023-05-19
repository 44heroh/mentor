package com.company.leetcode.problems.validateBinarySearchTree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isValidBST() {
        Solution.TreeNode root = new Solution.TreeNode(2);
        root.left= new Solution.TreeNode(1);
        root.right= new Solution.TreeNode(3);
        Solution solution = new Solution();
        boolean res = solution.isValidBST(root);
        System.out.println(res);
        Assertions.assertEquals(true, res);
    }

    @Test
    void isValidBST1() {
        Solution.TreeNode root = new Solution.TreeNode(5);
        root.left= new Solution.TreeNode(1);
        root.right = new Solution.TreeNode(4);
        root.right.left = new Solution.TreeNode(3);
        root.right.right = new Solution.TreeNode(6);
        Solution solution = new Solution();
        boolean res = solution.isValidBST(root);
        System.out.println(res);
        Assertions.assertEquals(false, res);
    }

    @Test
    void isValidBST2() {
        Solution.TreeNode root = new Solution.TreeNode(5);
        root.left= new Solution.TreeNode(4);
        root.right = new Solution.TreeNode(6);
        root.right.left = new Solution.TreeNode(3);
        root.right.right = new Solution.TreeNode(7);
        Solution solution = new Solution();
        boolean res = solution.isValidBST(root);
        System.out.println(res);
        Assertions.assertEquals(false, res);
    }

    @Test
    void isValidBST3() {
        Solution.TreeNode root = new Solution.TreeNode(2);
        root.left= new Solution.TreeNode(2);
        root.right = new Solution.TreeNode(2);
        Solution solution = new Solution();
        boolean res = solution.isValidBST(root);
        System.out.println(res);
        Assertions.assertEquals(false, res);
    }

    @Test
    void isValidBST4() {
        Solution.TreeNode root = new Solution.TreeNode(0);
        root.right = new Solution.TreeNode(-1);
        Solution solution = new Solution();
        boolean res = solution.isValidBST(root);
        System.out.println(res);
        Assertions.assertEquals(false, res);
    }

    @Test
    void isValidBST5() {
        Solution.TreeNode root = new Solution.TreeNode(3);
        root.left= new Solution.TreeNode(1);
        root.right = new Solution.TreeNode(5);
        root.left.left = new Solution.TreeNode(0);
        root.left.right = new Solution.TreeNode(2);
        root.right.left = new Solution.TreeNode(4);
        root.right.right = new Solution.TreeNode(6);
        Solution solution = new Solution();
        boolean res = solution.isValidBST(root);
        System.out.println(res);
        Assertions.assertEquals(true, res);
    }
}