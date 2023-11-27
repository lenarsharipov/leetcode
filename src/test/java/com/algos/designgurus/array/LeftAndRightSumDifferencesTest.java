package com.algos.designgurus.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LeftAndRightSumDifferencesTest {

    private final LeftAndRightSumDifferences solution = new LeftAndRightSumDifferences();

    @Test
    public void test1() {
        int[] input = {2, 5, 1, 6};
        int[] expected = {12, 5, 1, 8};
        assertThat(solution.findDifferenceArray(input)).isEqualTo(expected);
    }

    @Test
    public void test2() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {14, 11, 6, 1, 10};
        assertThat(solution.findDifferenceArray(input)).isEqualTo(expected);
    }

    @Test
    public void test3() {
        int[] input = {3, 3, 3};
        int[] expected = {6, 0, 6};
        assertThat(solution.findDifferenceArray(input)).isEqualTo(expected);
    }

    @Test
    public void test4() {
        int[] input = {3, 1, 4, 2, 2};
        int[] expected = {9, 5, 0, 6, 10};
        assertThat(solution.findDifferenceArray(input)).isEqualTo(expected);
    }

}