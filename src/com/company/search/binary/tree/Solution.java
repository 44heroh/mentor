package com.company.search.binary.tree;

import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        BinaryTreeSearch.Node root = BinaryTreeSearch.createTree(arr, 0 , arr.length - 1);
        BinaryTreeSearch.printTree(root);
        System.out.println(BinaryTreeSearch.height(root));
    }

    public static BinaryTreeSearch.Node createBinaryTreeSearch(int[] arr) {

        BinaryTreeSearch.Node root = BinaryTreeSearch.createTree(arr, 0 , arr.length - 1);
        BinaryTreeSearch.printTree(root);
        System.out.println(BinaryTreeSearch.height(root));

        return root;
    }
}
