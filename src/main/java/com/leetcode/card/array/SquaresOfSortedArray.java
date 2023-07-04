package com.leetcode.card.array;

/**
 * Squares of a Sorted Array
 *
 * Given an integer array nums sorted in non-decreasing order,
 * return an array of the squares of each number sorted in non-decreasing order.
 *
 * Example 1:
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 *
 * Example 2:
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 *
 * Constraints:
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums is sorted in non-decreasing order.
 *
 * Follow up: Squaring each element and sorting the
 * new array is very trivial, could you find an O(n)
 * solution using a different approach?
 */
public class SquaresOfSortedArray {
    /**
     * To solve the problem with O(n) time complexity,
     * you can use a two-pointer approach.
     *
     * Here's the step-by-step algorithm:
     * 1. Initialize two pointers, left and right, pointing to the start and end of the nums array.
     * 2. Initialize a new result array, squares, with the same length as nums.
     * 3. Initialize an index variable, index, starting from the end of the squares array.
     * 4. Iterate while left is less than or equal to right:
     *      - Compare the absolute values of nums[left] and nums[right].
     *          - If abs(nums[left]) is greater than or equal to abs(nums[right]):
     *              - Assign nums[left] * nums[left] to squares[index].
     *              - Increment left by 1.
     *          - Otherwise:
     *              - Assign nums[right] * nums[right] to squares[index].
     *              - Decrement right by 1.
     *      - Decrement index by 1.
     * 5. Return the squares array.
     */
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] squares = new int[nums.length];
        int index = nums.length - 1;

        while (left <= right) {
            if (Math.abs(nums[left]) >= Math.abs(nums[right])) {
                squares[index] = nums[left] * nums[left];
                left++;
            } else {
                squares[index] = nums[right] * nums[right];
                right--;
            }
            index--;
        }

        return squares;
    }
}
