package com.algos.designgurus.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SinglyLinkedListTest {

    private SinglyLinkedList sol;

    @BeforeEach
    void init() {
        sol = new SinglyLinkedList();
    }

    @Test
    void testInsertFirst() {
        sol.insertLast(1);
        sol.insertLast(2);
        sol.insertLast(3);

        sol.insertFirst(111);

    }

}