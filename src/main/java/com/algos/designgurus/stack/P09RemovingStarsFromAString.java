package com.algos.designgurus.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Problem Statement
 * Given a string s, where * represents a star.
 * We can remove a star along with its closest non-star
 * character to its left in a single operation.
 * The task is to perform as many such operations
 * as possible until all stars have been removed
 * and return the resultant string.
 *
 * Examples
 * Example 1
 *
 * Input: "abc*de*f"
 * Expected Output: "abdf"
 * Description: We remove c along with * to get "abde*f",
 * then remove e along with * to get "abdf"
 *
 * Example 2
 *
 * Input: "a*b*c*d"
 * Expected Output: "d"
 * Description: We remove a along with * to get "b*c*d",
 * then remove b with * to get "c*d", then remove c with * to get "d".
 *
 * Example 3
 *
 * Input: "abcd"
 * Expected Output: "abcd"
 * Description: As there is no *, the string remains the same.
 */
public class P09RemovingStarsFromAString {
    public String removeStars(String str) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char character : str.toCharArray()) { // Loop through each character in the input string
            if (character == '*' && !stack.isEmpty()) { // If the character is '*' and the stack is not empty
                stack.pop(); // Pop (remove) the top character from the stack
            } else if (character != '*') { // If the character is not '*'
                stack.push(character); // Push (add) the character to the stack
            }
        }
        var sb = new StringBuilder(); // Create a StringBuilder to build the result string
        for (char c : stack) { // Iterate through the characters in the stack
            sb.insert(0, c); // Append each character to the StringBuilder
        }
        return sb.toString(); // Convert the StringBuilder to a string and return the result
    }
}
