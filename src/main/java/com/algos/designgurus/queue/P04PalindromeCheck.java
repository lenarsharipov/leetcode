package com.algos.designgurus.queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Problem 4: Palindrome Check using Queue
 * Problem Statement
 * Given a string, determine if that string
 * is a palindrome using a queue data structure.
 *
 * A palindrome is a word, number, phrase,
 * or other sequences of characters that reads
 * the same forward and backward, ignoring spaces,
 * punctuation, and capitalization.
 *
 * Examples:
 *
 * Input: "madam"
 * Output: True
 * Explanation: The word "madam" reads the same forwards and backwards.
 *
 * Input: "openai"
 * Output: False
 * Explanation: The word "openai" does not read the same forwards and backwards.
 *
 * Input: "A man a plan a canal Panama"
 * Output: True
 * Explanation: The phrase "A man a plan a canal Panama"
 * reads the same forwards and backwards when we ignore spaces and capitalization.
 */
public class P04PalindromeCheck {

    /**
     * Time and Space Complexity
     * The time complexity of this algorithm is O(n)
     * where n is the length of the string because
     * we need to iterate over the string to enqueue
     * all characters. The space complexity is
     * also O(n) because we store all characters
     * in a queue.
     */
    public static boolean checkPalindrome(String s) {
        // Remove all non-alphanumeric characters and convert to lowercase
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // Create a deque (double-ended queue) from the string
        Deque<Character> deque = new LinkedList<>();
        for (char c : s.toCharArray()) {
            deque.add(c);
        }

        // Continue until there is 0 or 1 character left
        while (deque.size() > 1) {
            // Remove and compare characters from both ends
            if (!deque.pollFirst().equals(deque.pollLast())) {
                return false;
            }
        }
        return true;
    }

}
