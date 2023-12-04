package com.algos.designgurus.stack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NextGreaterElementTest {

    private final NextGreaterElement solution = new NextGreaterElement();

    @Test
    @DisplayName("input: [4, 5, 2, 25], output: [5, 25, 25, -1]")
    void test1() {
        int[] input = {4, 5, 2, 25};
        int[] expected = {5, 25, 25, -1};

        int[] actualResult = solution.printNGE(input);

        assertArrayEquals(expected, actualResult, "Should have returned " + Arrays.toString(expected));
    }

    @Test
    @DisplayName("input: [13, 7, 6, 12], output: [-1, 12, 12, -1]")
    void test2() {
        int[] input = {13, 7, 6, 12};
        int[] expected = {-1, 12, 12, -1};

        int[] actualResult = solution.printNGE(input);

        assertArrayEquals(expected, actualResult, "Should have returned " + Arrays.toString(expected));
    }

    @Test
    @DisplayName("input: [1, 2, 3, 4, 5], output: [2, 3, 4, 5, -1]")
    void test3() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {2, 3, 4, 5, -1};

        int[] actualResult = solution.printNGE(input);

        assertArrayEquals(expected, actualResult, "Should have returned " + Arrays.toString(expected));
    }

}