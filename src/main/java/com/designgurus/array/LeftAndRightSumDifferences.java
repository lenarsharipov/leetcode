package com.designgurus.array;

/**
 * Time Complexity
 * 1. Calculating Prefix and Suffix Sums:
 *
 * - Prefix Sum Calculation: The loop that calculates the prefix sum runs n times, where n is the number
 *   of elements in the input array. Therefore, it has a time complexity of (O(n)).
 * - Suffix Sum Calculation: Similarly, the loop for calculating the suffix sum also runs n times,
 *   resulting in a time complexity of (O(n)).
 *
 * 2. Calculating Answer Array:
 * - The loop that calculates the absolute difference between prefix and suffix sums at each index
 *   also runs n times, contributing (O(n)) to the time complexity.
 * Combining all these, the overall time complexity of the algorithm is (O(n) + O(n) + O(n) = O(3n)),
 * which simplifies to (O(n)) because we typically ignore constant factors in Big O notation.
 *
 * Space Complexity
 * 1. Prefix and Suffix Sum Arrays:
 *     - The algorithm utilizes two additional arrays: prefixSum and suffixSum, each of size n.
 *       This contributes (2n) to the space complexity, i.e., (O(2n)).
 * 2. Answer Array:
 *      - Additionally, an answer array of size n is used to store the final results.
 *        This adds an additional (O(n)) to the space complexity.
 *
 * Combining these, the overall space complexity is (O(2n) + O(n) = O(3n)),
 * which simplifies to (O(n)) when considering Big O notation.
 */
public class LeftAndRightSumDifferences {
    public int[] findDifferenceArray(int[] nums) {
        if (nums == null || nums.length < 2) {
            return new int[1];
        }

        int arrayLength = nums.length;
        int[] differenceArray = new int[arrayLength];
        int[] leftSum = new int[arrayLength];
        int[] rightSum = new int[arrayLength];

        leftSum[0] = nums[0];
        for (int i = 1; i < arrayLength; i++) {
            leftSum[i] = nums[i] + leftSum[i - 1];
        }

        rightSum[arrayLength - 1] = nums[arrayLength - 1];
        for (int i = arrayLength - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + nums[i];
        }

        for (int i = 0; i < arrayLength; i++) {
            differenceArray[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return differenceArray;

    }
}
