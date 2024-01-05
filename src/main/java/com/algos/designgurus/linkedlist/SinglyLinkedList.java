package com.algos.designgurus.linkedlist;

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

        linkedList.insertInSortedList(1);
        linkedList.insertInSortedList(2);
        linkedList.insertInSortedList(1);
        linkedList.insertInSortedList(2);
        linkedList.insertInSortedList(3);
        linkedList.insertInSortedList(4);
        linkedList.insertInSortedList(4);
        linkedList.insertInSortedList(0);
        linkedList.printElements();
    }
}
