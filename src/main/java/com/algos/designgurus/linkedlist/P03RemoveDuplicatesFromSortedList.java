package com.algos.designgurus.linkedlist;

public class P03RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {
        var solution = new P03RemoveDuplicatesFromSortedList();

        // Test Example 1
        ListNode head1 = new ListNode(1, new ListNode(1, new ListNode(2)));
        ListNode result1 = solution.deleteDuplicates(head1); // Expected: 1 -> 2
        solution.printList(result1);

        // Test Example 2
        ListNode head2 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3))));
        ListNode result2 = solution.deleteDuplicates(head2); // Expected: 1 -> 2 -> 3
        solution.printList(result2);

        // Test Example 3
        ListNode head3 = new ListNode(3, new ListNode(3, new ListNode(3)));
        ListNode result3 = solution.deleteDuplicates(head3); // Expected: 3
        solution.printList(result3);
    }

    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    /**
     * 1. Time Complexity:
     * The time complexity of this algorithm is determined
     * by the number of elements in the linked list since
     * we are traversing the list once.
     *
     *  -   We traverse each node of the linked list exactly once.
     *  -   For each node, we perform constant-time operations
     *      to check whether the next node is a duplicate
     *      and possibly update the next pointer.
     *
     * Therefore, the time complexity of this algorithm is O(n),
     * where n is the number of nodes in the linked list.
     *
     * 2. Space Complexity:
     * The space complexity of an algorithm analyzes
     * the amount of memory space required relative
     * to the input size.
     *
     *      - The algorithm uses a constant amount of space to
     *      store pointers (like the current pointer)
     *      and temporary variables, regardless of the input size.
     *      - We are not using any additional data structures
     *      that scale with the input size.
     *      - The algorithm modifies the input linked list
     *      in place and does not create any new nodes or linked lists.
     *
     * Therefore, the space complexity of this algorithm is O(1),
     * indicating constant space usage.

     */
    public ListNode deleteDuplicates(ListNode head) {
        // Initialize the current node as the head of the list.
        ListNode current = head;

        // Traverse through the list until the end is reached.
        while (current != null && current.next != null) {
            // If the next node is a duplicate, bypass it.
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                // If not, move to the next node.
                current = current.next;
            }
        }
        // Return the modified head of the list.
        return head;
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
