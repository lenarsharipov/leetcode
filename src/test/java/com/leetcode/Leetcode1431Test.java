package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class Leetcode1431Test {
    private final Leetcode1431 solution = new Leetcode1431();

    @Test
    void firstTest() {
        List<Boolean> expected = List.of(true, true, true, false, true);
        assertThat(expected)
                .isEqualTo(solution.kidsWithCandies(new int[] {2, 3, 5, 1, 3}, 3));
    }

    @Test
    void secondTest() {
        List<Boolean> expected = List.of(true, false, false, false, false);
        assertThat(expected)
                .isEqualTo(solution.kidsWithCandies(new int[] {4, 2, 1, 1, 2}, 1));
    }

    @Test
    void thirdTest() {
        List<Boolean> expected = List.of(true, false, true);
        assertThat(expected)
                .isEqualTo(solution.kidsWithCandies(new int[] {12, 1, 12}, 10));
    }

}