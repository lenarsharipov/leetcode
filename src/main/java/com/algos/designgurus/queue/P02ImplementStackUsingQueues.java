package com.algos.designgurus.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Problem 2: Implement Stack using Queues
 * Problem Statement
 * Your task is to implement a stack using two queues.
 * The stack should support standard operations like
 * push (add an element to the top of the stack) and
 * pop (remove an element from the top of the stack).
 *
 * Examples:
 * Input: Push operations: [1, 2, 3], Pop operations: 2
 * Output: [1]
 * Explanation: After pushing 1, 2, 3 the stack looks like [1, 2, 3].
 * Then we perform 2 pop operations, removing 3 and 2, so the output is [1].
 *
 * Input: Push operations: [9, 8], Pop operations: 1
 * Output: [9]
 * Explanation: After pushing 9, 8 the stack looks like [9, 8].
 * Then we perform 1 pop operation, removing 8, so the output is [9].
 *
 * Input: Push operations: [5, 6, 7, 8], Pop operations: 4
 * Output: []
 * Explanation: After pushing 5, 6, 7, 8 the stack looks like [5, 6, 7, 8].
 * After performing 4 pop operations we are left with zero elements in the stack [].
 *
 *
 * Solution
 * We can use two queues to simulate the behavior of a stack.
 * We maintain a main queue which represents our stack and
 * an auxiliary queue which is used to help perform the push operation.
 *
 * Algorithm Walkthrough
 *
 * When pushing an element, we add it to the auxiliary queue,
 * then we dequeue all elements from the main queue and enqueue
 * them to the auxiliary queue. After this, we swap the main
 * and auxiliary queues so that the main queue always represents our stack.
 *
 * When popping an element, we just dequeue it from the main queue.
 * The last element added will always be at the front, simulating
 * the behavior of a stack.
 *
 *
 * Time and Space Complexity
 *
 * The time complexity for the push operation is O(n)
 * because we're transferring all elements from the
 * main queue to the auxiliary queue. The pop operation
 * is O(1) because we're just dequeue from the main queue.
 *
 * The space complexity is O(n), where n is the number
 * of elements in the stack. This is because we store
 * all elements in the main and/or auxiliary queues.
 */
public class P02ImplementStackUsingQueues {
    Queue<Integer> main = new LinkedList<>();
    Queue<Integer> aux = new LinkedList<>();

    public void push(int x) {
        aux.add(x);
        while (!main.isEmpty()) {
            aux.add(main.remove());
        }
        Queue<Integer> temp = main;
        main = aux;
        aux = temp;
    }

    public int pop() {
        return main.remove();
    }

    public static void main(String[] args) {
        P02ImplementStackUsingQueues stack = new P02ImplementStackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

}
