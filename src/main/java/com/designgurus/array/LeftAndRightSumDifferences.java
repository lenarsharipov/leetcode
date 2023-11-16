package com.designgurus.array;

public class LeftAndRightSumDifferences {
    public int[] findDifferenceArray(int[] nums) {
        if (nums == null || nums.length < 2) return new int[1];

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
