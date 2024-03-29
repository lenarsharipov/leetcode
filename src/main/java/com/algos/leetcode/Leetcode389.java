package com.algos.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/find-the-difference/
 * Tags: Hash Table, String, Bit Manipulation, Sorting
 *
 * 389. Find the Difference
 * You are given two strings s and t.
 * String t is generated by random shuffling string s
 * and then add one more letter at a random position.
 * Return the letter that was added to t.
 *
 * Example 1:
 * Input: s = "abcd", t = "abcde"
 * Output: "e"
 * Explanation: 'e' is the letter that was added.
 *
 * Example 2:
 * Input: s = "", t = "y"
 * Output: "y"
 *
 * Constraints:
 *     0 <= s.length <= 1000
 *     t.length == s.length + 1
 *     s and t consist of lowercase English letters.
 */
public class Leetcode389 {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> charCount = new HashMap<>();

        /* Count the occurrences of each character in string s */
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        /* Subtract the count of characters in string t
        This will eliminate the characters that are common in both strings */
        for (char c : t.toCharArray()) {
            if (!charCount.containsKey(c) || charCount.get(c) == 0) {
                return c; // Found the added letter
            }
            charCount.put(c, charCount.get(c) - 1);
        }

        /* Dummy return statement (shouldn't be reached) */
        return '\0';
    }
}
