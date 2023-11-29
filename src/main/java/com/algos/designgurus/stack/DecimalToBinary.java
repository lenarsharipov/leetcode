package com.algos.designgurus.stack;

import java.util.Stack;

/**
 * The time complexity of this algorithm is
 * due to the division by 2 at each step.
 *
 * The space complexity is also  because in
 * each step we will be pushing an element
 * on the stack, and there are a total of steps.
 */
public class DecimalToBinary {

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
