package com.algos.designgurus.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Problem 5: Next Greater Element
 * Problem Statement
 * Given an array, print the Next Greater Element (NGE) for every element.
 * The Next Greater Element for an element x is the first greater element
 * on the right side of x in the array. Elements for which no greater
 * element exist, consider the next greater element as -1.
 *
 * Examples
 * Example 1:
 *
 *  Input: [4, 5, 2, 25]
 *  Output: [5, 25, 25, -1]
 * Example 1:
 *
 *  Input: [13, 7, 6, 12]
 *  Output: [-1, 12, 12, -1]
 * Example 1:
 *
 *  Input: [1, 2, 3, 4, 5]
 *  Output: [2, 3, 4, 5, -1]
 *
 * Time Complexity: The worst-case time complexity of this
 * algorithm is O(n) as every element is pushed
 * and popped from the stack exactly once.
 *
 * Space Complexity: The space complexity of this
 * algorithm is O(n) as we are using a stack and
 * an array to store the next greater elements.
 */
public class P05NextGreaterElement {
    // Method to find the Next Greater Element (NGE) for each element in the array
    int[] printNGE(int[] arr) {
        int n = arr.length;
        Deque<Integer> stack = new ArrayDeque<>();
        int[] res = new int[n];

//        // Iterate through the array in reverse order
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
