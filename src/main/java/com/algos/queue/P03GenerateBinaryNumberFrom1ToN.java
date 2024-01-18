package com.algos.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Problem 3: Generate Binary Numbers from 1 to N
 * Problem Statement
 * Given an integer N, generate all binary numbers
 * from 1 to N and return them as a list of strings.
 *
 * Examples:
 *
 * Input: N = 2
 * Output: ["1", "10"]
 * Explanation: The binary representation of 1 is "1",
 * and the binary representation of 2 is "10".
 *
 * Input: N = 3
 * Output: ["1", "10", "11"]
 * Explanation: The binary representation of 1 is "1",
 * the binary representation of 2 is "10", and the
 * binary representation of 3 is "11".
 *
 * Input: N = 5
 * Output: ["1", "10", "11", "100", "101"]
 * Explanation: These are the binary representations
 * of the numbers from 1 to 5.
 */
public class P03GenerateBinaryNumberFrom1ToN {

    /**
     * The time complexity of this algorithm is O(N)
     * because we're processing N binary numbers.
     *
     * The space complexity is also O(N)
     * because we're storing N binary numbers
     * in the queue and the result list.
     */
    public static String[] generateBinaryNumbers(int n) {
        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = queue.poll();
            queue.add(res[i] + "0");
            queue.add(res[i] + "1");
        }
        return res;
    }

    public static void main(String[] args) {
        String[] binaryNums = generateBinaryNumbers(5);
        for (String binaryNum : binaryNums) {
            System.out.println(binaryNum);
        }
    }

}
