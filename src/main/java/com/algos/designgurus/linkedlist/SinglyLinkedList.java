package com.algos.designgurus.linkedlist;

import java.util.LinkedList;

public class SinglyLinkedList {
    private ListNode head;

    public void printElements() {
        ListNode listNode = head;
        while (listNode != null) {
            System.out.print(listNode.data + " --> ");
            listNode = listNode.next;
        }
        System.out.println("null");
    }

    public int length() {
        ListNode curr = head;
        int count = 0;
        while (curr != null) {
            curr = curr.next;
            count++;
        }
        return count;
    }

    public void insertFirst(int value) {
        ListNode node = new ListNode(value);
        node.next = head;
        head = node;
    }

    public void insertLast(int value) {
        ListNode node = new ListNode(value);
        if (head == null) {
            head = node;
            return;
        }

        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = node;
    }

    public void insertAt(int position, int value) {
        ListNode node = new ListNode(value);
        if (position == 1) {
            node.next = head;
            head = node;
        } else {
            ListNode prev = head;
            int count = 1;
            while (count < position - 1) {
                prev = prev.next;
                count++;
            }
            ListNode curr = prev.next;
            prev.next = node;
            node.next = curr;
        }

    }

    public ListNode deleteFirst() {
        if (head == null) {
            return null;
        }
        ListNode deleted = head;
        head = head.next;
        deleted.next = null;
        return deleted;
    }

    public ListNode deleteLast() {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode curr = head;
        ListNode prev = null;
        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }

        prev.next = null;
        return curr;
    }

    public void deleteAt(int position) {
        if (position == 1) {
            head = head.next;
        } else {
            ListNode prev = head;
            int count = 1;
            while (count < position - 1) {
                prev = prev.next;
                count++;
            }
            ListNode curr = prev.next;
            prev.next = curr.next;
        }
    }

    public void insertInSortedList(int value) {
        ListNode node = new ListNode(value);
        if (head == null || value <= head.data) {
            node.next = head;
            head = node;
        } else {
            ListNode curr = head;
            ListNode prev = null;
            while (curr != null && value > curr.data) {
                prev = curr;
                curr = curr.next;
            }
            node.next = curr;
            prev.next = node;
        }
    }

    public void removeDuplicatesInSortedList() {
        if (head == null || head.next == null) {
            return;
        }

        ListNode curr = head;
        while (curr.next != null) {
            if (curr.data == curr.next.data) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
    }

    public boolean searchElement(int key) {
        ListNode curr = head;
        while (curr != null) {
            if (curr.data == key) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public void reverseList() {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public ListNode findMiddleNode() {
        if (head == null) {
            return null;
        }

        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        return slowPtr;
    }

    public ListNode findNthNodeFromTheEnd(int position) {
        if (head == null) {
            return null;
        }

        if (position < 1) {
            throw new IllegalArgumentException("Invalid position value");
        }

        ListNode slow = head;
        ListNode fast = head;
        int count = 0;

        while (count < position) {
            if (fast == null) {
                throw new IllegalArgumentException("Invalid position value");
            }
            count++;
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }

    public void createLoopedLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);

        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;

    }

    public boolean containsLoop() {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                return true;
            }
        }

        return false;
    }

    private ListNode getStartingNode(ListNode slow) {
        ListNode temp = head;
        while (temp != slow) {
            temp = temp.next;
            slow = slow.next;
        }

        return temp;

    }

    public ListNode findLoopStartNode() {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return getStartingNode(slow);
            }
        }

        return null;
    }

    private static class ListNode {
        private int data; // Usually a Generic Type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return "ListNode{"
                    + "data=" + data
                    + ", next=" + next
                    + '}';
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();

//        linkedList.insertFirst(11);
//        linkedList.insertFirst(8);
//        linkedList.insertFirst(1);
//
//        linkedList.insertLast(555);
//        linkedList.insertLast(666);
//        linkedList.insertAt(6, 777);
//        linkedList.printElements();

//        System.out.println(linkedList.deleteLast());
//        System.out.println(linkedList.deleteLast());
//        System.out.println(linkedList.deleteLast());
//        System.out.println(linkedList.deleteLast());
//        System.out.println(linkedList.deleteLast());
//        linkedList.printElements();
//        System.out.println(linkedList.deleteLast());
//        linkedList.printElements();

//        linkedList.deleteAt(6);
//        linkedList.printElements();
//
//        linkedList.deleteAt(5);
//        linkedList.printElements();
//        linkedList.deleteAt(4);
//        linkedList.printElements();
//        linkedList.deleteAt(3);
//        linkedList.printElements();
//        linkedList.deleteAt(2);
//        linkedList.printElements();
//        linkedList.deleteAt(1);
//        linkedList.printElements();

        // Insert into sorted list
        var ll4 = new SinglyLinkedList();
        ll4.insertInSortedList(1);
        ll4.insertInSortedList(2);
        ll4.insertInSortedList(2);
        ll4.insertInSortedList(4);
        ll4.insertInSortedList(1);
        ll4.insertInSortedList(3);
        ll4.insertInSortedList(4);
        ll4.insertInSortedList(0);
        ll4.printElements();

        // Remove duplicates in sorted list
        var ll5 = new SinglyLinkedList();
        ll5.insertInSortedList(1);
        ll5.insertInSortedList(1);
        ll5.insertInSortedList(1);
        ll5.insertInSortedList(2);
        ll5.insertInSortedList(3);
        ll5.insertInSortedList(3);
        ll5.printElements();
        ll5.removeDuplicatesInSortedList();
        ll5.printElements();

        // Search for element in list
        var ll6 = new SinglyLinkedList();
        ll6.insertInSortedList(1);
        ll6.insertInSortedList(1);
        ll6.insertInSortedList(1);
        ll6.insertInSortedList(2);
        ll6.insertInSortedList(3);
        ll6.insertInSortedList(3);
        ll6.printElements();
        System.out.println(ll6.searchElement(1));

        // Reverse Linked List
        System.out.println("Reverse Linked List:");
        var ll7 = new SinglyLinkedList();
        ll7.insertAt(1, 1);
        ll7.insertAt(2, 2);
        ll7.insertAt(3, 3);
        ll7.printElements();
        ll7.reverseList();
        ll7.printElements();

        // How to find middle node in a Singly Linked List
        System.out.println("Find middle node in LinkedList");
        linkedList = new SinglyLinkedList();
        linkedList.insertAt(1, 1);
        linkedList.insertAt(2, 2);
        linkedList.insertAt(3, 3);
        linkedList.insertAt(4, 4);
        System.out.println(linkedList.findMiddleNode());

        // Find Nth node from the end in Singly Linked List
        System.out.println("Find Nth node from the end in Singly Linked List");
        linkedList = new SinglyLinkedList();
        System.out.println(linkedList.findNthNodeFromTheEnd(1));
        linkedList.insertAt(1, 1);
        linkedList.insertAt(2, 2);
        linkedList.insertAt(3, 3);
        linkedList.insertAt(4, 4);
        System.out.println(linkedList.findNthNodeFromTheEnd(4));
        System.out.println(linkedList.findNthNodeFromTheEnd(3));
        System.out.println(linkedList.findNthNodeFromTheEnd(2));
        System.out.println(linkedList.findNthNodeFromTheEnd(1));

        // Detect Loop
        System.out.println("Detect a Loop in Singly Linked List");
        linkedList = new SinglyLinkedList();
        linkedList.createLoopedLinkedList();
        System.out.println(linkedList.containsLoop());
        System.out.println("Find start of a loop in Singly Linked List");
        System.out.println(linkedList.findLoopStartNode().data);
    }

}
