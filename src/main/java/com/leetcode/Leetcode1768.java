package com.leetcode;

/**
 * https://leetcode.com/problems/merge-strings-alternately/
 *
 * 1768. Merge Strings Alternately
 *
 * You are given two strings word1 and word2. Merge the strings by adding letters
 * in alternating order, starting with word1. If a string is longer than the other,
 * append the additional letters onto the end of the merged string.
 *
 * Return the merged string.
 *
 * Example 1:
 * Input: word1 = "abc", word2 = "pqr"
 * Output: "apbqcr"
 * Explanation: The merged string will be merged as so:
 * word1:  a   b   c
 * word2:    p   q   r
 * merged: a p b q c r
 *
 * Example 2:
 * Input: word1 = "ab", word2 = "pqrs"
 * Output: "apbqrs"
 * Explanation: Notice that as word2 is longer, "rs" is appended to the end.
 * word1:  a   b
 * word2:    p   q   r   s
 * merged: a p b q   r   s
 *
 * Example 3:
 * Input: word1 = "abcd", word2 = "pq"
 * Output: "apbqcd"
 * Explanation: Notice that as word1 is longer, "cd" is appended to the end.
 * word1:  a   b   c   d
 * word2:    p   q
 * merged: a p b q c   d
 *
 * Constraints:
 *     1 <= word1.length, word2.length <= 100
 *     word1 and word2 consist of lowercase English letters.
 */
public class Leetcode1768 {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        /* Pointers are used to keep track of the positions in word1 and word2 respectively.*/
        int word1Counter = 0;
        int word2Counter = 0;

        /*
        (word1Counter < word1.length() || word2Counter < word2.length()) loop condition
        is used to ensure the loop continues until both strings are fully processed,
        the loop iterates until it reaches the end of both strings. */
        while (word1Counter < word1.length() || word2Counter < word2.length()) {
            if (word1Counter < word1.length()) {
                sb.append(word1.charAt(word1Counter));
                word1Counter++;
            }
            if (word2Counter < word2.length()) {
                sb.append(word2.charAt(word2Counter));
                word2Counter++;
            }
        }
        return sb.toString();
    }

}
