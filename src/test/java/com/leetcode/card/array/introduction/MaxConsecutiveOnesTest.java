package com.leetcode.card.array.introduction;

import com.leetcode.card.array.introduction.MaxConsecutiveOnes;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxConsecutiveOnesTest {
    private final MaxConsecutiveOnes solution = new MaxConsecutiveOnes();

    @Test
    void when110111Then3() {
        int[] nums = {1, 1, 0, 1, 1, 1};
        var expected = 3;
        assertThat(solution.findMaxConsecutiveOnes(nums))
                .isEqualTo(expected);
    }

    @Test
    void when101101Then2() {
        int[] nums = {1, 0, 1, 1, 0, 1};
        var expected = 2;
        assertThat(solution.findMaxConsecutiveOnes(nums))
                .isEqualTo(expected);
    }

    @Test
    void when1101Then2() {
        int[] nums = {1, 1, 0, 1};
        var expected = 2;
        assertThat(solution.findMaxConsecutiveOnes(nums))
                .isEqualTo(expected);
    }

    @Test
    void when1Then1() {
        int[] nums = {1};
        var expected = 1;
        assertThat(solution.findMaxConsecutiveOnes(nums))
                .isEqualTo(expected);
    }

    @Test
    void when0Then0() {
        int[] nums = {0};
        var expected = 0;
        assertThat(solution.findMaxConsecutiveOnes(nums))
                .isEqualTo(expected);
    }

}