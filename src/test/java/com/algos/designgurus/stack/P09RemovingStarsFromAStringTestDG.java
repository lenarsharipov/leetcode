package com.algos.designgurus.stack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P09RemovingStarsFromAStringTestDG {

    private final P09RemovingStarsFromAString solution = new P09RemovingStarsFromAString();

    @Test
    @DisplayName("Input: abc*de*f, output: abdf")
    public void test1() {
        var input = "abc*de*f";
        var expected = "abdf";

        String actualResult = solution.removeStars(input);

        assertEquals(expected, actualResult, "Should have returned " + expected);
    }

    @Test
    @DisplayName("Input: a*b*c*d, output: d")
    public void test2() {
        var input = "a*b*c*d";
        var expected = "d";

        String actualResult = solution.removeStars(input);

        assertEquals(expected, actualResult, "Should have returned " + expected);
    }

    @Test
    @DisplayName("Input: abcd, output: abcd")
    public void test3() {
        var input = "abcd";
        var expected = "abcd";

        String actualResult = solution.removeStars(input);

        assertEquals(expected, actualResult, "Should have returned " + expected);
    }

    @Test
    @DisplayName("Input: a*b*c*d*, output: empty string")
    public void test4() {
        var input = "a*b*c*d*";
        var expected = "";

        String actualResult = solution.removeStars(input);

        assertEquals(expected, actualResult, "Should have returned " + expected);
    }

}