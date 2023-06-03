package com.company.leetcode.problems.populatingNextRightPointersInEachNode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void connect() {
        Solution.Node root = new Solution.Node(1);
        root.left = new Solution.Node(2);
        root.right = new Solution.Node(3);
        root.left.left = new Solution.Node(4);
        root.left.right = new Solution.Node(5);
        root.right.left = new Solution.Node(6);
        root.right.right = new Solution.Node(7);
        Solution solution = new Solution();
        solution.print(solution.connect(root));
    }
}