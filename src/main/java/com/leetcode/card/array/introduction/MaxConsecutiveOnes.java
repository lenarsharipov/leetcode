package com.leetcode.card.array.introduction;

/**
 * Given a binary array nums, return the maximum
 * number of consecutive 1's in the array.
 *
 * Example 1:
 * Input: nums = [1,1,0,1,1,1]
 * Output: 3
 *
 * Example 2:
 * Input: nums = [1,0,1,1,0,1]
 * Output: 2
 *
 * Constraints:
 * 1 <= nums.length <= 10^5
 * nums[i] is either 0 or 1.
 */
public class MaxConsecutiveOnes {
    /*
    Time complexity: O(n)
    Space complexity: O(1)
    */
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;
                maxCount = Math.max(count, maxCount);
            } else {
                count = 0;
            }
        }

        return maxCount;
    }
}
