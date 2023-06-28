package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/valid-anagram
 * Tags: Hash Table, String, Sorting
 *
 * 242. Valid Anagram
 * Given two strings s and t, return
 * true if t is an anagram of s, and false otherwise.
 *
 * An Anagram is a word or phrase formed by rearranging
 * the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 *
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 *
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 *
 * Constraints:
 *     1 <= s.length, t.length <= 5 * 10^4
 *     s and t consist of lowercase English letters.
 *
 * Follow up: What if the inputs contain Unicode characters?
 * How would you adapt your solution to such a case?
 */
public class Leetcode242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // Use HashMap to store character frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Count character frequencies in string s
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Decrement character frequencies using string t
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) - 1);

            // If a character's frequency becomes negative, it's not an anagram
            if (frequencyMap.get(c) < 0) {
                return false;
            }
        }

        // Check if all character frequencies are zero
        for (int frequency : frequencyMap.values()) {
            if (frequency != 0) {
                return false;
            }
        }

        return true;
    }

}
