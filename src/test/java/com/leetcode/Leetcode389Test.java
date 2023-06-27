package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Leetcode389Test {
    private final Leetcode389 solution = new Leetcode389();

    @Test
    void firstTest() {
        var expected = 'e';
        assertThat(expected)
                .isEqualTo(solution.findTheDifference("abcd", "abcde"));
    }

    @Test
    void secondTest() {
        var expected = 'y';
        assertThat(expected)
                .isEqualTo(solution.findTheDifference("", "y"));
    }

    @Test
    void thirdTest() {
        var expected = 'd';
        assertThat(expected)
                .isEqualTo(solution.findTheDifference("abcd", "abcdd"));
    }

    @Test
    void forthTest() {
        var expected = 'a';
        assertThat(expected)
                .isEqualTo(solution.findTheDifference("ae", "aea"));
    }

}