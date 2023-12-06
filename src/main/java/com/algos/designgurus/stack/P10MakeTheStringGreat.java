package com.algos.designgurus.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Problem Statement
 * Given a string of English lowercase and uppercase letters,
 * we want to make the string "good" by removing two adjacent
 * characters that are the same but in different cases.
 * We continue to do this until there are no more adjacent
 * characters of the same letter but in different cases.
 * An empty string is also considered "good".
 *
 * Examples
 * Example 1
 *
 * Input: "AaBbCcDdEeff"
 * Output: "ff"
 * Explanation: In the first step, "AaBbCcDdEeff" becomes "BbcCDdEeff"
 * because 'A' and 'a' are the same letter,
 * but one is uppercase and the other is lowercase.
 * Then we remove "Bb", and then "cC", "dD", and "Ee".
 * In the end we are left with "ff" which we can't
 * remove - although both characters are the same but with the same case.
 *
 * Example 2
 *
 * Input: "abBA"
 * Output: ""
 * Explanation: In the first step, "abBA" becomes "aA"
 * because 'b' and 'B' are the same letter, but one is uppercase
 * and the other is lowercase. Then "aA" becomes ""
 * for the same reason. The final string is empty, which is good.
 *
 * Example 3
 *
 * Input: "s"
 * Output: "s"
 * Explanation: The string "s" is already good because it only contains one character.
 *
 *
 * Time and Space Complexity
 * The time complexity of the algorithm is O(n),
 * where n is the length of the string.
 * This is because we perform a single pass over the string.
 *
 * The space complexity of the algorithm is O(n),
 * where n is the length of the string.
 * In the worst case, if the string is already good,
 * the stack will contain all the characters of the string.
 */
public class P10MakeTheStringGreat {
    public String makeGood(String str) {
        Deque<Character> stack = new ArrayDeque<>();

        // Iterate through each character in the input string.
        for (char character : str.toCharArray()) {
            // Check if the stack is not empty and the current character (ignoring case)
            // is equal to the character at the top of the stack (ignoring case), but they
            // are of different cases (e.g., 'a' and 'A', or 'b' and 'B').
            if (!stack.isEmpty()
                    && Character.toLowerCase(stack.peek()) == Character.toLowerCase(character)
                    && !stack.peek().equals(character)) {
                // If the conditions are met, pop the character from the stack,
                // effectively removing the pair of characters.
                stack.pop();
            } else {
                // If the conditions are not met, push the current character onto the stack.
                stack.push(character);
            }
        }

        var sb = new StringBuilder();
        for (char character : stack) {
            sb.insert(0, character);
        }
        return sb.toString();
    }
}
