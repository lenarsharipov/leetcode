package com.algos.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Problem 8: Remove All Adjacent Duplicates In String
 * Problem Statement
 * You are given a string s. We want to make it a valid string.
 * A string is considered valid if it does not have any two adjacent
 * duplicate characters. The goal is to remove the minimum number
 * of characters from s such that it becomes valid.
 * The removal of characters should be done in a way that no
 * further removals are required.
 *
 * Examples
 * Example 1
 *
 * Input: "abbaca"
 * Expected Output: "ca"
 * Description: We remove 'b' from "abbaca" to get "aaca", then remove 'a' from "aaca" to get "ca"
 * Example 2
 *
 * Input: "azxxzy"
 * Expected Output: "ay"
 * Description: We remove 'x' from "azxxzy" to get "azzy", then remove 'z' from "azzy" to get "ay"
 * Example 3
 *
 * Input: "abba"
 * Expected Output: ""
 * Description: We remove 'b' from "abba" to get "aa", then remove 'a' from "aa" to get an empty string
 *
 *
 * Time and Space Complexity
 * The time complexity of the algorithm is O(n),
 * where n is the length of the string.
 * This is because we perform a single pass over the string.
 *
 * The space complexity of the algorithm is O(n),
 * where n is the length of the string. In the worst case,
 * if there are no adjacent duplicates, the stack will
 * contain all the characters of the string.
 */
public class P08RemoveAllAdjacentDuplicatesInString {

    public String removeDuplicates(String str) {
        Deque<Character> stack = new ArrayDeque<>();

        // Iterate through each character in the input string.
        for (char c : str.toCharArray()) {
            // Check if the stack is not empty and the current character matches the top of the stack.
            if (!stack.isEmpty() && stack.peek() == c) {
                // If a duplicate is found, pop the character from the stack.
                stack.pop();
            } else {
                // If no duplicate is found, push the character onto the stack.
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char character : stack) {
            sb.insert(0, character);
        }
        return sb.toString();
    }

}