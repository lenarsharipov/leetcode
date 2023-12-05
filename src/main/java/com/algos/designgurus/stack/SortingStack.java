package com.algos.designgurus.stack;

import java.util.Stack;

/**
 * Time Complexity
 *
 * The time complexity of the sort stack algorithm is O(n^2),
 * where n is the number of elements in the stack. This is because,
 * in the worst case, for every element that we pop from the input stack,
 * we might have to pop all the elements in the temporary stack
 * (and push them back to the original stack) to find the correct place
 * to insert the element. Since we have to do this for all n elements,
 * the time complexity is n * n = n^2.
 *
 * Space Complexity
 *
 * The space complexity of the algorithm is O(n).
 * This is because we use an additional temporary stack
 * to sort the elements. In the worst-case scenario,
 * this temporary stack could store all the elements of
 * the original stack. Thus, the space complexity is
 * directly proportional to the number of elements in
 * the input stack, making it linear, O(n).
 *
 * Please note that the space complexity does not count
 * the input size itself (the input stack in this case),
 * it only counts the extra space we use related to the
 * size of the input. If we were to count the input size
 * as well, the total space used would be O(2n),
 * but since we drop the constant factor when expressing
 * space complexity, so it remains.
 */
public class SortingStack {
    public static Stack<Integer> sortStack(Stack<Integer> input) {
        Stack<Integer> tmpStack = new Stack<>();
        while (!input.isEmpty()) {
            int tmp = input.pop();
            while (!tmpStack.isEmpty() && tmp < tmpStack.peek()) {
                input.push(tmpStack.pop());
            }
            tmpStack.push(tmp);
        }
        return tmpStack;
    }
}