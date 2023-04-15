package com.company.leetcode.problems.symmetricTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isSymmetricRecursive() {
        Solution solution = new Solution();
        Solution.TreeNode root = new Solution.TreeNode(1);
        root.left = new Solution.TreeNode(2);
        root.left.left = new Solution.TreeNode(3);
        root.left.right = new Solution.TreeNode(4);
        root.right = new Solution.TreeNode(2);
        root.right.left = new Solution.TreeNode(4);
        root.right.right = new Solution.TreeNode(3);

        assertEquals(true, solution.isSymmetricRecursive(root));
    }

    @Test
    void isSymmetricIteratively() {
        Solution solution = new Solution();
        Solution.TreeNode root = new Solution.TreeNode(1);
        root.left = new Solution.TreeNode(2);
        root.left.left = new Solution.TreeNode(3);
        root.left.right = new Solution.TreeNode(4);
        root.right = new Solution.TreeNode(1);
        root.right.left = new Solution.TreeNode(4);
        root.right.right = new Solution.TreeNode(3);

//        Solution solution = new Solution();
//        Solution.TreeNode root = new Solution.TreeNode(1);
//        root.left = new Solution.TreeNode(2);
//        root.left.left = new Solution.TreeNode(3);
//        root.right = new Solution.TreeNode(1);
//        root.right.left = new Solution.TreeNode(3);

        solution.isSymmetricIteratively(root);
        assertEquals(true, solution.isSymmetricRecursive(root));
    }
}