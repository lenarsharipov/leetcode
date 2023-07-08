package com.leetcode.card.array.introduction;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SquaresOfSortedArrayTest {
    private final SquaresOfSortedArray solution = new SquaresOfSortedArray();

    @Test
    void firstTest() {
        final int[] nums = {-4, -1, 0, 3, 10};
        int[] expected = {0, 1, 9, 16, 100};
        assertThat(solution.sortedSquares(nums)).isEqualTo(expected);
    }

    @Test
    void secondTest() {
        final int[] nums = {-7, -3, 2, 3, 11};
        int[] expected = {4, 9, 9, 49, 121};
        assertThat(solution.sortedSquares(nums)).isEqualTo(expected);
    }

}