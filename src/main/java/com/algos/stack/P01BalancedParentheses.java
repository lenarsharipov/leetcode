package com.algos.stack;

import java.util.Stack;

/**
 * Problem Statement
 * The "Balanced Parentheses" problem requires you to determine
 * if a given string of parentheses is balanced. A string of
 * parentheses is considered balanced if every opening parenthesis
 * has a corresponding closing parenthesis in the correct order.
 *
 * Example 1:
 *
 * Input: String s = "{[()]}";
 * Expected Output: true
 * Explanation: The parentheses in this string are perfectly
 * balanced. Every opening parenthesis '{', '[', '(' has a
 * corresponding closing parenthesis '}', ']', ')' in the
 * correct order. The stack will eventually be empty after
 * the complete traversal of the string, indicating the
 * string is balanced.
 *
 * Example 2:
 *
 * Input: string s = "{[}]";
 * Expected Output: false
 * Explanation: The brackets are not balanced in this string.
 * Although it contains the same number of opening and closing
 * brackets for each type, they are not correctly ordered.
 * The ']' closes '[' before '{' can be closed by '}',
 * and similarly, '}' closes '{' before '[' can be closed by ']'.
 * Hence, the string is not balanced, and the function should return false.
 *
 * Example 3:
 *
 * Input: String s = "(]";
 * Expected Output: false
 * Explanation: The parentheses in this string are not balanced. Here, ')'
 * does not have a matching opening parenthesis '(', and similarly, ']'
 * does not have a matching opening bracket '['.
 * So the function should return false.
 *
 *
 * Time and Space Complexity Analysis
 *
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
public class P01BalancedParentheses {
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
