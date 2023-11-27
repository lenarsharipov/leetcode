package com.algos.designgurus.stack;

import java.util.Stack;

/**
 * Time and Space Complexity Analysis
 * The time complexity of this algorithm is O(n),
 * where n is the length of the string.
 * This is because we're processing each character
 * in the string exactly once.
 *
 * The space complexity is also O(n) in the
 * worst-case scenario when all the characters
 * in the string are opening parentheses,
 * so we push each character onto the Stack.
 * In the average case, however, the space
 * complexity would be less than O(n).
 */
public class BalancedParentheses {
    public boolean isValid(String s) {
        if (s == null || s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        // Iterating through each character in the input string
        for (char character : s.toCharArray()) {
            // If the character is an opening parenthesis, push it onto the stack
            if (character == '(' || character == '{' || character == '[') {
                stack.push(character);
            } else {
                // If stack is empty, and we have a closing parenthesis, the string is not balanced
                if (stack.isEmpty()) {
                    return false;
                }
                // Pop the top character from the stack
                char top = stack.pop();
                // If the character is a closing parenthesis, check whether
                // it corresponds to the most recent opening parenthesis
                if (character == ')' && top != '(') {
                    return false;
                }
                if (character == '}' && top != '{') {
                    return false;
                }
                if (character == ']' && top != '[') {
                    return false;
                }
            }
        }
        // If the stack is empty, all opening parentheses had a corresponding closing match
        return stack.isEmpty();
    }

}
