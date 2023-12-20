package com.algos.designgurus.queue;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class P05ZigzagIteratorTest {
    List<Integer> v1;
    List<Integer> v2;

    @Test
    void test1() {
        v1 = List.of(1, 2);
        v2 = List.of(3, 4, 5, 6);
        P05ZigzagIterator sol = new P05ZigzagIterator(v1, v2);

        assertEquals(1, sol.next());
        assertEquals(3, sol.next());
        assertEquals(2, sol.next());
        assertEquals(4, sol.next());
        assertEquals(5, sol.next());
        assertEquals(6, sol.next());
        assertFalse(sol.hasNext());
    }

    @Test
    void test2() {
        v1 = List.of(1, 2, 3, 4);
        v2 = List.of(5, 6);
        P05ZigzagIterator sol = new P05ZigzagIterator(v1, v2);

        assertEquals(1, sol.next());
        assertEquals(5, sol.next());
        assertEquals(2, sol.next());
        assertEquals(6, sol.next());
        assertEquals(3, sol.next());
        assertEquals(4, sol.next());
        assertFalse(sol.hasNext());
    }

    @Test
    void test3() {
        v1 = List.of(1, 2);
        v2 = List.of();
        P05ZigzagIterator sol = new P05ZigzagIterator(v1, v2);

        assertEquals(1, sol.next());
        assertEquals(2, sol.next());
        assertFalse(sol.hasNext());
    }

}