package com.algos.designgurus.linkedlist;

/**
 * Problem 3: Merge Two Sorted Lists (easy)
 *
 * Problem Statement
 * Given the head of two sorted linked lists, l1 and l2.
 *
 * Return a new sorted list created by merging together
 * the nodes of the first two lists.
 *
 * Examples
 *
 * Example 1:
 *
 * Input:
 * [1, 3, 5]
 * [2, 4, 6]
 * Expected Output:
 * [1, 2, 3, 4, 5, 6]
 * Justification: Merging the two sorted linked lists,
 * node by node, results in a single sorted linked
 * list containing all elements from both input lists.
 *
 * Example 2:
 *
 * Input:
 * [2, 4, 6]
 * [1, 3, 5]
 * Expected Output:
 * [1, 2, 3, 4, 5, 6]
 * Justification: Both lists are in ascending order;
 * merging them node by node in ascending order
 * gives us the sorted linked list with all elements.
 *
 * Example 3:
 *
 * Input:
 * [1, 2, 3]
 * [4, 5, 6]
 * Expected Output:
 * [1, 2, 3, 4, 5, 6]
 * Justification: As the first list contains all smaller
 * elements, combining them results in a new list with
 * elements from the first list followed by the second one.
 */
public class P03MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode curr;
        while (l1.next != null && l2.next != null) {
            if (l1.val < l2.val) {

            }
        }
        return l1;
    }

     private static class ListNode {
         int val;
         ListNode next;

         ListNode() {

         }

         ListNode(int val) {
             this.val = val;
         }

         ListNode(int val, ListNode next) {
             this.val = val; this.next = next;
         }

    }
}
