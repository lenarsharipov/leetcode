package com.algos.queue;

import com.algos.queue.P01ReverseQueue;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P01ReverseQueueTest {

    private final P01ReverseQueue solution = new P01ReverseQueue();

    @Test
    public void test1() {
        Queue<Integer> input = new LinkedList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        input.add(5);

        Queue<Integer> expected = new LinkedList<>();
        expected.add(5);
        expected.add(4);
        expected.add(3);
        expected.add(2);
        expected.add(1);

        Queue<Integer> actualResult = solution.reverseQueue(input);
        assertEquals(expected, actualResult);
    }

    @Test
    public void test2() {
        Queue<Integer> input = new LinkedList<>();
        input.add(10);
        input.add(20);
        input.add(30);
        input.add(40);
        input.add(50);

        Queue<Integer> expected = new LinkedList<>();
        expected.add(50);
        expected.add(40);
        expected.add(30);
        expected.add(20);
        expected.add(10);

        Queue<Integer> actualResult = solution.reverseQueue(input);
        assertEquals(expected, actualResult);
    }

    @Test
    public void test3() {
        Queue<Integer> input = new LinkedList<>();
        input.add(5);
        input.add(7);
        input.add(9);

        Queue<Integer> expected = new LinkedList<>();
        expected.add(9);
        expected.add(7);
        expected.add(5);

        Queue<Integer> actualResult = solution.reverseQueue(input);
        assertEquals(expected, actualResult);
    }

}