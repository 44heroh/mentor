package com.company.main.tasks.largestContentfulPaint.tree;

import com.company.trees.build.Node;
import com.company.trees.build.Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class TreeNode {
    boolean isLeaf = false;
    Map<Character, TreeNode> character = new HashMap<>();

    @Override
    public String toString() {
        return "TreeNode{" +
                "\nisLeaf=" + isLeaf +
                "\n, character=" + character +
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

        StringBuilder lcp = new StringBuilder();
        TreeNode curr = head;

        // повторяем до тех пор, пока не найдем конечный узел или узел не имеет более 1 дочернего узла
        while (curr != null && !curr.isLeaf && (curr.character.size() == 1)) {
            for (Map.Entry<Character, TreeNode> entry : curr.character.entrySet()){
//                System.out.println(entry.getKey());
                lcp.append(entry.getKey());
                // обновить указатель `curr` на дочерний узел
                curr = entry.getValue();
            }
        }

//        print(head);

        return lcp.toString();
    }

    private void insert(TreeNode head, String s) {
        TreeNode curr = head;

        for (char ch : s.toCharArray()) {
            // создаем новый узел, если пути не существует
            curr.character.putIfAbsent(ch, new TreeNode());

            // переходим к следующему узлу
            curr = curr.character.get(ch);
        }

        curr.isLeaf = true;
    }

    public void print(TreeNode head) {
        TreeNode current = head;
        while (current != null) {
            for (Map.Entry<Character, TreeNode> entry : current.character.entrySet()){
                System.out.println(entry.getKey());
                // обновить указатель `curr` на дочерний узел
                current = entry.getValue();
            }
        }
    }
}
