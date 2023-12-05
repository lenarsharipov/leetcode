package com.algos.designgurus.stack;

import java.util.Stack;

/**
 * Problem Statement
 * Given a string, write a function that uses a stack to reverse the string.
 * The function should return the reversed string.
 *
 * Examples
 * Example 1:
 *
 * Input: "Hello, World!"
 * Output: "!dlroW ,olleH"
 * Example 2:
 *
 * Input: "OpenAI"
 * Output: "IANepO"
 * Example 3:
 *
 * Input: "Stacks are fun!"
 * Output: "!nuf era skcatS"
 *
 *
 * Time and Space Complexity:
 * Time Complexity: O(n), where n is the length of the input string.
 * This is because we iterate through the string once to push all
 * characters into the stack and then another time to pop all characters
 * out of the stack.
 *
 * Space Complexity: O(n), where n is the length of the input string.
 * This is because we use a stack to hold all characters of the string.
 */
public class P02ReverseString {
    public String reverseString(String s) {
        var stack = new Stack<Character>();
        for (var character: s.toCharArray()) {
            stack.push(character);
        }
        var sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
