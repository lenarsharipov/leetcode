package com.algos.designgurus.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Time Complexity: The worst-case time complexity of this
 * algorithm is O(n) as every element is pushed
 * and popped from the stack exactly once.
 *
 * Space Complexity: The space complexity of this
 * algorithm is O(n) as we are using a stack and
 * an array to store the next greater elements.
 */
public class NextGreaterElement {
    // Method to find the Next Greater Element (NGE) for each element in the array
    int[] printNGE(int[] arr) {
        int n = arr.length;
        Deque<Integer> stack = new ArrayDeque<>();
        int[] res = new int[n];

        // Iterate through the array in reverse order
        for (int i = n - 1; i >= 0; i--) {
            // Pop elements from the stack while they are smaller than or equal to the current element
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // If the stack is empty, there is no greater element on the right, so set it to -1
            // Otherwise, set it to the top element of the stack
            res[i] = stack.isEmpty() ? -1 : stack.peek();

            // Push the current element onto the stack
            stack.push(arr[i]);
        }

        return res;
    }
}
