package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class Leetcode1342Test {
    private final Leetcode1342 solution = new Leetcode1342();

    @Test
    void when14Then6() {
        var num = 14;
        var expected = 6;
        assertThat(solution.numberOfSteps(num)).isEqualTo(expected);
    }

    @Test
    void when8Then4() {
        var num = 8;
        var expected = 4;
        assertThat(solution.numberOfSteps(num)).isEqualTo(expected);
    }

    @Test
    void when123Then12() {
        var num = 123;
        var expected = 12;
        assertThat(solution.numberOfSteps(num)).isEqualTo(expected);
    }

}