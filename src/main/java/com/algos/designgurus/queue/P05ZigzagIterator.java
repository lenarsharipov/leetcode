package com.algos.designgurus.queue;

import java.util.*;

/**
 * Problem 5: Zigzag Iterator
 * Problem Statement
 * Given two 1d vectors, implement an iterator
 * to return their elements alternately.
 *
 * For example, given two 1-d vectors:
 *
 * v1 = [1, 2] v2 = [3, 4, 5, 6]
 *
 * By calling next repeatedly until hasNext
 * returns false, the order of elements
 * returned by next should be: [1, 3, 2, 4, 5, 6].
 *
 * Example 1:
 *
 * i = ZigzagIterator([1, 2], [3, 4, 5, 6])
 * print(i.next())  # returns 1
 * print(i.next())  # returns 3
 * print(i.next())  # returns 2
 * print(i.next())  # returns 4
 * print(i.next())  # returns 5
 * print(i.next())  # returns 6
 * print(i.hasNext())  # returns False
 *
 * Example 2:
 *
 * i = ZigzagIterator([1, 2, 3, 4], [5, 6])
 * print(i.next())  # returns 1
 * print(i.next())  # returns 5
 * print(i.next())  # returns 2
 * print(i.next())  # returns 6
 * print(i.next())  # returns 3
 * print(i.next())  # returns 4
 * print(i.hasNext())  # returns False
 *
 * Example 3:
 *
 * i = ZigzagIterator([1, 2], [])
 * print(i.next())  # returns 1
 * print(i.next())  # returns 2
 * print(i.hasNext())  # returns False
 *
 *
 * Solution
 * The Zigzag Iterator can be implemented using
 * a Queue of Iterators. Here is a simple idea
 * of how we can implement the Zigzag Iterator:
 *
 * Push the iterators of v1 and v2 into the Queue in order.
 * For each next() operation, dequeue an iterator from
 * the Queue, retrieve the current element from the
 * iterator, then re-queue the iterator if there
 * are still elements left.
 *
 * Detailed Walkthrough:
 *
 * Initialize the queue and insert the iterators
 * of v1 and v2 only if they have elements.
 * In the next() function, pop an iterator from
 * the front of the queue. Get the next element
 * from the iterator, then re-insert the iterator
 * back into the queue if there are still elements
 * left in the iterator.
 * In the hasNext() function, simply check if the
 * queue is empty.
 *
 *
 * Time and Space Complexity:
 * The next() and hasNext() operations
 * have a time complexity of O(1).
 *
 * The space complexity is O(m),
 * where m is the total number
 * of vectors - since each vector
 * is represented as a separate
 * iterator in the deque.
 */
public class P05ZigzagIterator {
    private final Queue<Iterator<Integer>> queue;

    public P05ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        queue = new LinkedList<>();
        if (!v1.isEmpty()) {
            queue.add(v1.iterator());
        }

        if (!v2.isEmpty()) {
            queue.add(v2.iterator());
        }
    }

    public int next() {
        if (queue.isEmpty()) {
            throw new NoSuchElementException();
        }

        Iterator<Integer> iterator = queue.poll();
        int nextValue = iterator.next();
        if (iterator.hasNext()) {
            queue.add(iterator);
        }

        return nextValue;
    }

    public boolean hasNext() {
        return !queue.isEmpty();
    }

    public static void main(String[] args) {
        var sol1 = new P05ZigzagIterator(List.of(1, 2), List.of());
        System.out.println(sol1.next());
        System.out.println(sol1.next());
        System.out.println(sol1.hasNext());
    }

}
