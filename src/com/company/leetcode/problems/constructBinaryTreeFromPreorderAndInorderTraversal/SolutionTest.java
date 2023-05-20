package com.company.leetcode.problems.constructBinaryTreeFromPreorderAndInorderTraversal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void buildTree() {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        Solution solution = new Solution();
        System.out.println(solution.buildTree(inorder, preorder));
    }
}