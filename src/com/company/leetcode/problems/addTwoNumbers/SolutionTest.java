package com.company.leetcode.problems.addTwoNumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void addTwoNumbers() {
        Solution solution = new Solution();
        Solution.ListNode l1 = new Solution.ListNode(2);
        l1.next = new  Solution.ListNode(4);
        l1.next.next = new  Solution.ListNode(3);

        Solution.ListNode l2 = new Solution.ListNode(5);
        l2.next = new  Solution.ListNode(6);
        l2.next.next = new  Solution.ListNode(4);

        Solution.ListNode result = solution.addTwoNumbers(l1, l2);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }

    @Test
    void addTwoNumbers1() {
        Solution solution = new Solution();
        Solution.ListNode l1 = new Solution.ListNode(2);
        l1.next = new  Solution.ListNode(4);
        l1.next.next = new  Solution.ListNode(9);

        Solution.ListNode l2 = new Solution.ListNode(5);
        l2.next = new  Solution.ListNode(6);
        l2.next.next = new  Solution.ListNode(4);
        l2.next.next.next = new  Solution.ListNode(9);

        Solution.ListNode result = solution.addTwoNumbers(l1, l2);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}