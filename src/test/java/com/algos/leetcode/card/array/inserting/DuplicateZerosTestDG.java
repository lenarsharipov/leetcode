package com.algos.leetcode.card.array.inserting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

class DuplicateZerosTestDG {

    private final DuplicateZeros solution = new DuplicateZeros();

    @Test
    void firstTest() {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        int[] result = {1, 0, 0, 2, 3, 0, 0, 4};
        solution.duplicateZeros(arr);
        assertThat(arr).isEqualTo(result);
    }

    @Test
    void secondTest() {
        int[] arr = {1, 2, 3};
        int[] result = {1, 2, 3};
        solution.duplicateZeros(arr);
        assertThat(arr).isEqualTo(result);
    }

    @Test
    void thirdTest() {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        int[] result = {1, 0, 0, 2, 3, 0, 0, 4};
        solution.duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
        assertThat(arr).isEqualTo(result);
    }

}