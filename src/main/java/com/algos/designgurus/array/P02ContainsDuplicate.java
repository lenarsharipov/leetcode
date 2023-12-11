package com.algos.designgurus.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Problem 2: Contains Duplicate (easy)
 * Problem Statement
 * Given an integer array nums, return true
 * if any value appears at least twice in the array,
 * and return false if every element is distinct.
 *
 * Example 1:
 *
 * Input: nums= [1, 2, 3, 4]
 * Output: false
 * Explanation: There are no duplicates in the given array.
 *
 * Example 2:
 *
 * Input: nums= [1, 2, 3, 1]
 * Output: true
 * Explanation: '1' is repeating.
 */
public class P02ContainsDuplicate {
    /**
     * Time Complexity The algorithm takes O(n^2)
     * where N is the number of elements in the input array.
     * This is because we need to compare each element
     * with all other elements, which takes O(n^2) time.
     *
     * Space Complexity The algorithm takes O(1),
     * because we only need a few variables to store the indices,
     * which takes constant space.
     * @param nums
     * @return
     */
    public boolean containsDuplicateBruteForce(int[] nums) {
        boolean rsl = false;
        if (nums == null || nums.length < 2) {
            return rsl;
        }

        // time complexity O(n^2)
        // space complexity: O(1)
        for (int i = 0; i < nums.length - 1; i++) {
            int num = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == num) {
                    rsl = true;
                    break;
                }
            }
        }
        return rsl;
    }

    /**
     * Time Complexity The algorithm takes O(n) where N is the number
     * of elements in the input array. This is because we iterate the array only once.
     *
     * Space Complexity The algorithm takes O(n), as it stores the numbers in a set.
     */
    public boolean containsDuplicateViaHash(int[] nums) {
        boolean rsl = false;
        if (nums == null || nums.length < 2) {
            return rsl;
        }

        Set<Integer> set = new HashSet<>();

        // time complexity O(n)
        // space complexity: O(n)
        for (Integer num : nums) {
            if (!set.add(num)) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    /**
     * Time Complexity: O(N * logN), where N is the number of elements in the array nums.
     * This is because sorting the array takes O(N & logN) time.
     *
     * Space Complexity: O(1) or O(n), depending on the sorting algorithm used.
     * If an in-place sorting algorithm is used, the space complexity will be O(1).
     * If a sorting algorithm that creates a new array is used, the space complexity will be O(n),
     * where N is the number of elements in the array nums.
     */
    public boolean containsDuplicateViaSorting(int[] nums) {
        boolean rsl = false;
        if (nums == null || nums.length < 2) {
            return rsl;
        }

        Arrays.sort(nums); // O(n * log(n))

        // time complexity O(n)
        // space complexity: O(n) or O(1) depending on the sorting algorithm
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                rsl = true;
                break;
            }
        }

        return rsl;
    }

}
