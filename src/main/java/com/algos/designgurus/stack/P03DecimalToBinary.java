package com.algos.designgurus.stack;

import java.util.Stack;

/**
 * Problem 3: Decimal to Binary Conversion
 * Problem Statement
 * Given a positive integer n, write a function that
 * returns its binary equivalent as a string.
 * The function should not use any in-built binary
 * conversion function.
 *
 * Examples
 * Example 1:
 *
 * Input: 2
 * Output: "10"
 * Explanation: The binary equivalent of 2 is 10.
 * Example 2:
 *
 * Input: 7
 * Output: "111"
 * Explanation: The binary equivalent of 7 is 111.
 * Example 3:
 *
 * Input: 18
 * Output: "10010"
 * Explanation: The binary equivalent of 18 is 10010.
 *
 *
 * The time complexity of this algorithm is O(log(n))
 * due to the division by 2 at each step.
 *
 * The space complexity is also O(log(n)) because in
 * each step we will be pushing an element
 * on the stack, and there are a total of steps.
 */
public class P03DecimalToBinary {

    public static String decimalToBinary(int num) {
        var sb = new StringBuilder();
        var stack = new Stack<Integer>();
        while (num > 0) {
            stack.push(num % 2);
            num /= 2;
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

}
