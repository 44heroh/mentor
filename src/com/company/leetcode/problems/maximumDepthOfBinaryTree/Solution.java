package com.company.leetcode.problems.maximumDepthOfBinaryTree;

public class Solution {

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

    /**
     * Рекурсивная функция для нахождения минимальной глубины пути, начинающегося из заданного узла в бинарном дереве
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        // если root == null
        if(root == null)
            return 0;

        // вызываем рекурсивно maxDepth root.left
        int left = maxDepth(root.left);
        // вызываем рекурсивно maxDepth root.right
        int right = maxDepth(root.right);

        // root.left == null, то увеличиваем right на 1
        if(root.left == null)
            return right + 1;

        // root.right == null, то увеличиваем left на 1
        if(root.right == null)
            return left + 1;

        // выбираем минимальное между left и right и увеличиваем на 1
        return Math.max(left, right) + 1;
    }
}
