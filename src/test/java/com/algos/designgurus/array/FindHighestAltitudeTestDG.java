package com.algos.designgurus.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindHighestAltitudeTestDG {
    private final FindHighestAltitude solution = new FindHighestAltitude();

    @Test
    public void test1() {
        int[] input = {-5, 1, 5, 0, -7};
        int expected = 1;
        assertThat(solution.largestAltitude(input)).isEqualTo(expected);
    }

    @Test
    public void test2() {
        int[] input = {4, -3, 2, -1, -2};
        int expected = 4;
        assertThat(solution.largestAltitude(input)).isEqualTo(expected);
    }

    @Test
    public void test3() {
        int[] input = {2, 2, -3, -1, 2, 1, -5};
        int expected = 4;
        assertThat(solution.largestAltitude(input)).isEqualTo(expected);
    }

    @Test
    public void test4() {
        int[] input = {2};
        int expected = 2;
        assertThat(solution.largestAltitude(input)).isEqualTo(expected);
    }

}