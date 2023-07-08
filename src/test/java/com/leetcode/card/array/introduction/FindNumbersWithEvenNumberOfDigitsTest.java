package com.leetcode.card.array.introduction;

import com.leetcode.card.array.introduction.FindNumbersWithEvenNumberOfDigits;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FindNumbersWithEvenNumberOfDigitsTest {
    private final FindNumbersWithEvenNumberOfDigits solution = new FindNumbersWithEvenNumberOfDigits();

    @Test
    void firstTest() {
        int[] nums = {12, 345, 2, 6, 7698};
        var expected = 2;
        assertThat(solution.findNumbers(nums))
                .isEqualTo(expected);
    }

    @Test
    void secondTest() {
        int[] nums = {555, 901, 482, 1771};
        var expected = 1;
        assertThat(solution.findNumbers(nums))
                .isEqualTo(expected);
    }

}