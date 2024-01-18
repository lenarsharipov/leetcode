package com.algos.linkedlist;

/**
 * Reverse Linked List (easy)
 * Problem Statement:
 * Given the head of a singly linked list, return the head of the reversed list.
 *
 * Examples
 * Example 1:
 * Input: [3, 5, 2]
 * Expected Output: [2, 5, 3]
 * Justification: Reversing the list [3, 5, 2] gives us [2, 5, 3].
 * Example 2:
 * Input: [7]
 * Expected Output: [7]
 * Justification: Since there is only one element in the list, the reversed
 * list remains the same.
 * Example 3:
 * Input: [-1, 0, 1]
 * Expected Output: [1, 0, -1]
 * Justification: The list is reversed, so the elements are in the order [1, 0, -1].
 *
 *
 * Time Complexity
 * The time complexity of the reverse linked list algorithm is O(n),
 * where n is the number of nodes in the linked list.
 * The algorithm traverses the entire linked list exactly once,
 * performing a constant amount of work for each node
 * (changing the next pointer and updating the current and previous pointers).
 * Since the amount of work done is directly proportional
 * to the number of nodes in the list, the time complexity is linear.
 *
 * Space Complexity
 * The space complexity of the algorithm is O(1), which represents constant space.
 * This is because the algorithm only uses a fixed number of extra variables
 * (previous, current, and next) to reverse the linked list, regardless of the size
 * of the input linked list. No additional data structures or recursive stack space
 * that scale with the input size are used, so the space used by the algorithm
 * does not depend on the number of elements in the linked list.
 */
public class P01ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next; // store next node
            current.next = prev; // reverse the link
            prev = current; // move one step forward in the list
            current = next; // move one step forward in the list
        }
        return prev; // prev is now pointing to the new head
    }

    private static class ListNode {
        int val;
        ListNode next;

        public ListNode(int value) {
            this.val = value;
        }
    }
}
