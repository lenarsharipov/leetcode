package com.algos.matrix;

/**
 * Time Complexity: O(n*m)
 * The algorithm traverses through all the customers and their respective accounts once.
 * If n represents the number of customers and m represents the maximum number of
 * accounts (i.e., length of sub-arrays), in the worst-case scenario, the algorithm
 * would need to perform O(n*m) operations.
 * Iterating through each customer is an O(n) operation, and calculating the sum of
 * their wealth by iterating through each of their m accounts makes the inner
 * operation O(m). Together, this results in a time complexity of O(n*m).
 *
 * Space Complexity: O(1)
 * The algorithm only utilizes a constant amount of extra space, which is not
 * dependent on the input size. Specifically, it uses two additional variables:
 * maxWealth and wealth, to keep track of the maximum wealth found so far and
 * the wealth of the current customer, respectively.
 * Since these variables are used for storing scalar values and their quantity
 * does not grow with the input, the space complexity is O(1).
 */
public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;  // Initialize maxWealth to 0
        if (accounts == null) {
            return maxWealth;
        }
        for (int[] account : accounts) {
            int temp = 0;
            for (int balance : account) {
                temp += balance;
            }
            maxWealth = Math.max(maxWealth, temp);
        }
        return maxWealth;
    }

}
