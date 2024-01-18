package com.algos.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Reverse a Queue
 * Problem Statement
 * You are given a queue data structure.
 * Your task is to write an algorithm to reverse the order of its elements.
 *
 * Examples: *
 * Input: Queue = [1, 2, 3, 4, 5]
 * Output: [5, 4, 3, 2, 1]
 * Explanation: The input queue elements are reversed.
 *
 * Input: Queue = [10, 20, 30, 40, 50]
 * Output: [50, 40, 30, 20, 10]
 * Explanation: The input queue elements are reversed.
 *
 * Input: Queue = [5, 7, 9]
 * Output: [9, 7, 5]
 * Explanation: The input queue elements are reversed.
 */
public class P01ReverseQueue {

    /**
     * The time complexity of this algorithm is O(n),
     * where n is the number of elements in the queue.
     * This is because each element is dequeued and
     * enqueued exactly once.
     *
     * The space complexity is also O(n), because all
     * the elements are stored in the stack when
     * reversing the queue.
     */
    public Queue<Integer> reverseQueue(Queue<Integer> q) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (Integer element : q) {
            stack.push(element);
        }

        return new LinkedList<>(stack);
    }

}
