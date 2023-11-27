package com.algos.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class Leetcode412Test {
    private final Leetcode412 solution = new Leetcode412();

    @Test
    void firstTest() {
        var n = 3;
        var expected = List.of("1", "2", "Fizz");
        assertThat(solution.fizzBuzz(n))
                .usingRecursiveComparison()
                .isEqualTo(expected);
    }

    @Test
    void secondTest() {
        var n = 5;
        var expected = List.of("1", "2", "Fizz", "4", "Buzz");
        assertThat(solution.fizzBuzz(n))
                .usingRecursiveComparison()
                .isEqualTo(expected);
    }

    @Test
    void thirdTest() {
        var n = 15;
        var expected = List.of(
                "1", "2", "Fizz", "4", "Buzz",
                "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "13", "14", "FizzBuzz");
        assertThat(solution.fizzBuzz(n))
                .usingRecursiveComparison()
                .isEqualTo(expected);
    }

}