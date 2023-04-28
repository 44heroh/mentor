package com.company.leetcode.problems.addTwoNumbers;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Solution {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(){
        }
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }

    /**
     * 2. Add Two Numbers https://leetcode.com/problems/add-two-numbers/description/
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null)
            return new ListNode();

        ListNode root = new ListNode();
        ListNode current = root;
        int add = 0, first = 0, second = 0, sum = 0;
        while(l1 != null || l2 != null){
            if(l1 != null){
                first = l1.val > 0 ? l1.val : 0;
                l1 = l1.next;
            } else {
                first = 0;
            }

            if(l2 != null){
                second = l2.val > 0 ? l2.val : 0;
                l2 = l2.next;
            } else {
                second = 0;
            }

            sum = first + second + add;
            current.val = sum % 10;
            add = sum / 10;

            if(l1 != null || l2 != null) {
                current.next = new ListNode();
                current = current.next;
            }
        }

        if(add > 0){
            current.next = new ListNode(add);
        }

        return root;
    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null)
            return new ListNode();

        int carry = 0;
        int sum = 0;
        ListNode node = null;
        ListNode temp = null;
        ListNode root = null;
        while(l1 != null || l2 != null){
            sum = carry;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            node = new ListNode(sum % 10);
            if(temp == null){
                temp = node;
                root = temp;
            } else {
                temp.next = node;
                temp = temp.next;
            }
            carry = sum / 10;
        }

        if(carry > 0){
            temp.next = new ListNode(carry);
        }

        return root;
    }
}
