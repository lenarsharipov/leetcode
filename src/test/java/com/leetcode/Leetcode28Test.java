package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class Leetcode28Test {
    private final Leetcode28 solution = new Leetcode28();

    @Test
    void firstTest() {
        var expected = 0;
        assertThat(expected)
                .isEqualTo(solution.strStr("sadbutsad", "sad"));
    }

    @Test
    void secondTest() {
        var expected = -1;
        assertThat(expected)
                .isEqualTo(solution.strStr("leetcode", "leeto"));
    }

}