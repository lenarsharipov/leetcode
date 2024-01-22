package com.algos.linkedlist;

public class DoublyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int length;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }

    public void displayForward() {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + " --> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public void displayBackward() {
        ListNode curr = tail;
        while (curr != null) {
            System.out.print(curr.data + " --> ");
            curr = curr.previous;
        }
        System.out.println("null");
    }

    public void insertFirst(int data) {
        ListNode newNode = new ListNode(data);
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.previous = newNode;
        }

        newNode.next = head;
        head = newNode;
        length++;
    }

    public static class ListNode {
        private int data;
        private ListNode previous;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        // Print elements
        var dll = new DoublyLinkedList();
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        first.next = second;
        second.previous = first;
        second.next = third;
        third.previous = second;
        dll.head = first;
        dll.tail = third;
        dll.displayForward();
        dll.displayBackward();

        // Insert first
        System.out.println("Insert at the beginning");
        dll = new DoublyLinkedList();
        dll.insertFirst(1);
        dll.insertFirst(2);
        dll.insertFirst(3);
        dll.displayForward();
    }

}
