package com.company.main.tasks.largestContentfulPaint.tree.test2;

import java.util.HashMap;
import java.util.Map;

class TreeNode {
    boolean isLeaf = false;
    Map<Character, TreeNode> characters = new HashMap<>();

    @Override
    public String toString() {
        return "TreeNode{" +
                "isLeaf=" + isLeaf +
                ", characters=" + characters +
                '}';
    }
}

public class Solution {

    /**
     *
     * @param strings
     * @return
     */
    public String findLCP(String[] strings) {
        TreeNode head = new TreeNode();
        for (String s : strings) {
            insert(head, s);
        }

        TreeNode curr = head;
        StringBuilder sb = new StringBuilder();
        while (curr != null && !curr.isLeaf && (curr.characters.size() == 1)) {
            for (Map.Entry<Character, TreeNode> entry : curr.characters.entrySet()) {
                sb.append(entry.getKey());
                curr = entry.getValue();
            }
        }

        return sb.toString();
    }

    private void insert(TreeNode head, String s) {
        TreeNode curr = head;
        for (char ch : s.toCharArray()) {
            curr.characters.putIfAbsent(ch, new TreeNode());
            curr = curr.characters.get(ch);
        }

        curr.isLeaf = true;
    }
}
