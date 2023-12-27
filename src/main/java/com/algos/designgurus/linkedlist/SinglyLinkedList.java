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
            ListNode prev = node;
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

    private static class ListNode {
        private int data; // Usually a Generic Type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
//        linkedList.head = new ListNode(10);
//        ListNode second = new ListNode(1);
//        ListNode third = new ListNode(8);
//        ListNode fourth = new ListNode(11);
//
//        linkedList.head.next = second; // 10 --> 1
//        second.next = third; // 10 --> 1 --> 8
//        third.next = fourth; // 10 --> 1 --> 8 --> 11 --> null
//        linkedList.insertFirst(111);

        linkedList.insertFirst(11);
        linkedList.insertFirst(8);
        linkedList.insertFirst(1);
        linkedList.insertLast(333);
        linkedList.printElements();

        linkedList.insertAt(2, 666);

        linkedList.printElements();
        System.out.println(linkedList.length());
    }
}
