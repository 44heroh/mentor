package com.company.leetcode.problems.sortList;

import java.util.*;

public class Solution {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    /**
     * 148. Sort List https://leetcode.com/problems/sort-list/
     * @param head
     * @return
     */
    public ListNode sortList(ListNode head) {
        ListNode result = sortList(head, null);
//        while (result != null) {
//            System.out.println(result.val);
//            result = result.next;
//        }
        return result;
    }

    private ListNode sortList(ListNode p, ListNode q) {
        if(p == null || p == q) {
            return p;
        }

        boolean sorted = true;
        ListNode current = p;
        //Находим элемент который надо переставить
        while (current.next != null && current != q) {
            if(current.val > current.next.val){
                sorted = false;
                break;
            }
            current = current.next;
        }

        if(sorted)
            return p;

        ListNode pre = p;
        ListNode head = p;
        current = pre.next;

        while (current != null && current != q) {
            ListNode next = current.next;
            if(current.val < p.val) {
                pre.next = next;
                current.next = head;
                head = current;
            } else {
                pre = current;
            }
            current = next;
        }

        p.next = sortList(p.next, q);
        return sortList(head, p);
    }

    public ListNode sortList3(ListNode head) {
        if(head == null)
            return head;

        List<Integer> list = new ArrayList<>();
        ListNode current = head;
        int len = 0;
        while (current != null) {
            list.add(current.val);
            current = current.next;
            len++;
        }

        Collections.sort(list);

        ListNode node = new ListNode(list.get(0));
        ListNode root = node;
        for (int i = 1; i < list.size(); i++) {
            ListNode tmp = new ListNode(list.get(i));
            node.next = tmp;
            node = tmp;
        }

        return root;
    }

    public ListNode sortList2(ListNode head) {
        if(head == null)
            return head;

        ListNode current = head;
        HashMap<Integer, ListNode> map = new HashMap<>();
        int len = 0;
        while (current != null) {
            map.put(len, current);
            current = current.next;
            len++;
        }

        for (int i = 0; i < len; i++) {
            ListNode tmp = map.get(i);
            int j = i;
            while (j > 0 && map.get(j - 1).val > tmp.val) {
                map.put(j, map.get(j - 1));
                j--;
            }
            map.put(j, tmp);
        }

        ListNode root = map.get(0);
        ListNode node = root;
        int count = 0;
        while (node != null) {
            node.next = map.get(count);
            node = node.next;
            count++;
        }

        return root;
    }


    public ListNode sortList1(ListNode head) {
        if(head == null)
            return head;

        List<Integer> list = new ArrayList<>();
        ListNode current = head;
        int len = 0;
        while (current != null) {
            list.add(current.val);
            current = current.next;
            len++;
        }

        Integer[] arr = list.toArray(new Integer[0]);

        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i];
            int j = i;
            while (j > 0 && tmp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = tmp;
        }

        ListNode node = new ListNode(arr[0]);
        ListNode root = node;
        for (int i = 1; i < arr.length; i++) {
            ListNode tmp = new ListNode(arr[i]);
            node.next = tmp;
            node = tmp;
        }

        while (root != null) {
            System.out.println(root.val);
            root = root.next;
        }

        return root;
    }
}
