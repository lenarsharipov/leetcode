package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class Leetcode1480Test {
    private final Leetcode1480 solution = new Leetcode1480();

    @Test
    void firstTest() {
        var original = new int[] {1, 2, 3, 4};
        var expected = new int[] {1, 3, 6, 10};
        assertThat(solution.runningSum(original))
                .isEqualTo(expected);
    }

    @Test
    void secondTest() {
        var original = new int[] {1, 1, 1, 1, 1};
        var expected = new int[] {1, 2, 3, 4, 5};
        assertThat(solution.runningSum(original))
                .isEqualTo(expected);
    }

    @Test
    void thirdTest() {
        var original = new int[] {3, 1, 2, 10, 1};
        var expected = new int[] {3, 4, 6, 16, 17};
        assertThat(solution.runningSum(original))
                .isEqualTo(expected);
    }

}