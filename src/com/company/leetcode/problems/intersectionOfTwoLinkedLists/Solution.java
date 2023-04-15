package com.company.leetcode.problems.intersectionOfTwoLinkedLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /**
     * 160. Intersection of Two Linked Lists https://leetcode.com/problems/intersection-of-two-linked-lists/
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;

        int count1 = 0;
        ListNode root1 = headA;
        while(root1 != null){
            root1 = root1.next;
            count1++;
        }

        int count2 = 0;
        ListNode root2 = headB;
        while(root2 != null){
            root2 = root2.next;
            count2++;
        }

        while(headA != null && headB != null) {
            if(count1 > count2){
                headA = headA.next;
                count1--;
            } else if(count1 < count2) {
                headB = headB.next;
                count2--;
            } else if(headA.equals(headB)){
                return headA;
            } else {
                headA = headA.next;
                headB = headB.next;
                count1--;
                count2--;
            }
        }

        return null;
    }

    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;

        int[] arr1 = new int[30000];
        int[] arr2 = new int[100000];

        int count = 0;
        while(headA != null){
            arr1[count] = headA.val;
            headA = headA.next;
            count++;
        }

        count = 0;
        while(headB != null){
            arr2[count] = headB.val;
            headB = headB.next;
            count++;
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        return null;
    }
}
