package leetcode.problems;

/**
 * <a href="https://leetcode.com/problems/greatest-common-divisor-of-strings/">...</a>
 *
 * 1071. Greatest Common Divisor of Strings
 * For two strings s and t, we say "t divides s"
 * if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).
 *
 * Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 *
 * Example 1:
 * Input: str1 = "ABCABC", str2 = "ABC"
 * Output: "ABC"
 *
 * Example 2:
 * Input: str1 = "ABABAB", str2 = "ABAB"
 * Output: "AB"
 *
 * Example 3:
 * Input: str1 = "LEET", str2 = "CODE"
 * Output: ""
 *
 * Constraints:
 *     1 <= str1.length, str2.length <= 1000
 *     str1 and str2 consist of English uppercase letters.
 */
public class L0002Leetcode1071 {
    public String gcdOfStrings(String str1, String str2) {
        /*

         */
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }

    private int gcd(int a, int b) {
        while (true) {
            if (a == 0) {
                return b;
            }
            if (b == 0) {
                return a;
            }
            if (a >= b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
    }
}
