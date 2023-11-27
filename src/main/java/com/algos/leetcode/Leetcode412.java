package com.algos.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/fizz-buzz/
 *
 * 412. Fizz Buzz
 * Given an integer n, return a string array answer (1-indexed) where:
 *     answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 *     answer[i] == "Fizz" if i is divisible by 3.
 *     answer[i] == "Buzz" if i is divisible by 5.
 *     answer[i] == i (as a string) if none of the above conditions are true.
 *
 * Example 1:
 * Input: n = 3
 * Output: ["1","2","Fizz"]
 *
 * Example 2:
 * Input: n = 5
 * Output: ["1","2","Fizz","4","Buzz"]
 *
 * Example 3:
 * Input: n = 15
 * Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
 *
 * Constraints:
 *     1 <= n <= 104
 *
 * Tags:
 * Math, String, Simulation
 */
public class Leetcode412 {
    private final static String FIZZ = "Fizz";
    private final static String BUZZ = "Buzz";

    public List<String> fizzBuzz(int n) {
        var list = new ArrayList<String>(n);

        for (var val = 1; val <= n; val++) {
            var divisibleBy3 = val % 3 == 0;
            var divisibleBy5 = val % 5 == 0;
            var sb = new StringBuilder();

            if (divisibleBy3) {
                sb.append(FIZZ);
            }
            if (divisibleBy5) {
                sb.append(BUZZ);
            }
            if (sb.isEmpty()) {
                sb.append(val);
            }
            list.add(sb.toString());
        }

        return list;
    }
}
