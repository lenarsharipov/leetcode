package com.algos.leetcode;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/ransom-note/
 *
 * 383. Ransom Note
 * Given two strings ransomNote and magazine, return true
 * if ransomNote can be constructed by using the letters
 * from magazine and false otherwise.
 *
 * Each letter in magazine can only be used once in ransomNote.
 *
 * Example 1:
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 *
 * Example 2:
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 *
 * Example 3:
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 *
 * Constraints:
 *     1 <= ransomNote.length, magazine.length <= 10^5
 *     ransomNote and magazine consist of lowercase English letters.
 *
 * Tags:
 * Hash Table, String, Counting
 */
public class Leetcode383 {
    /*
    Time complexity: O(m)
    Space complexity: O(1), as this problem uses only lower cases, k <= 26.
    As k is constant, space complexity is constant as well O(1)
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        var map = new HashMap<Character, Integer>();

        if (magazine.length() < ransomNote.length()) {
            return false;
        }

        for (var index = 0; index < magazine.length(); index++) {
            var character = magazine.charAt(index);
            var currentCount = map.getOrDefault(character, 0);
            map.put(character, currentCount + 1);
        }

        for (var index = 0; index < ransomNote.length(); index++) {
            var character = ransomNote.charAt(index);
            var currentCount = map.getOrDefault(character, 0);

            if (currentCount == 0) {
                return false;
            }

            map.put(character, currentCount - 1);
        }

        return true;
    }
}
