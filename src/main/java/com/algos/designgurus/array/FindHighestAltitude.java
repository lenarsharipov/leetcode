package com.algos.designgurus.array;

/**
 * Time Complexity: O(n)
 * The algorithm's time complexity is linear, O(n), where "n" represents the length of the input list.
 * This is because each element of the input list gain is visited once in a single loop to calculate
 * the cumulative sum and find the maximum altitude. There are no nested loops or recursive function
 * calls, keeping the time complexity linear.
 *
 * Space Complexity: O(1)
 * The space complexity of the algorithm is constant, O(1). Regardless of the size of the input list,
 * the algorithm only uses a few extra variables (max_altitude and current_altitude) to keep track
 * of the current altitude and the maximum altitude achieved so far. These variables consume constant
 * space, and no additional data structures, like arrays or matrices, that grow with the input are used,
 * thus ensuring that the space usage is not dependent on the input size. This means the memory used by
 * the algorithm does not increase with the input size, making it space-efficient for large inputs.
 */
public class FindHighestAltitude {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0;
        int currentAttitude = 0;
        for (int value : gain) {
            currentAttitude += value;
            maxAltitude = Math.max(currentAttitude, maxAltitude);
        }
        return maxAltitude;
    }
}
