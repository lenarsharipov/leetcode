package com.algos.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class Leetcode1672TestDG {
    private final Leetcode1672 solution = new Leetcode1672();

    @Test
    void firstTest() {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1}
        };
        var expected = 6;
        assertThat(solution.maximumWealth(accounts))
                .isEqualTo(expected);
    }

    @Test
    void secondTest() {
        int[][] accounts = {
                {1, 5},
                {7, 3},
                {3, 5}
        };
        var expected = 10;
        assertThat(solution.maximumWealth(accounts))
                .isEqualTo(expected);
    }

    @Test
    void thirdTest() {
        int[][] accounts = {
                {2, 8, 7},
                {7, 1, 3},
                {1, 9, 5}
        };
        var expected = 17;
        assertThat(solution.maximumWealth(accounts))
                .isEqualTo(expected);
    }

}