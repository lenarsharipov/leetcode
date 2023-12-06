package com.algos.designgurus.stack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P10MakeTheStringGreatTest {
    private final P10MakeTheStringGreat solution = new P10MakeTheStringGreat();

    @Test
    @DisplayName("input: AaBbCcDdEeff, output: ff")
    void test1() {
        var input = "AaBbCcDdEeff";
        var expected = "ff";

        String actualResult = solution.makeGood(input);

        assertEquals(expected, actualResult, "Should have returned " + expected);
    }

    @Test
    @DisplayName("input: abBA, output: empty string")
    void test2() {
        var input = "abBA";
        var expected = "";

        String actualResult = solution.makeGood(input);

        assertEquals(expected, actualResult, "Should have returned " + expected);
    }

    @Test
    @DisplayName("input: s, output: s")
    void test3() {
        var input = "s";
        var expected = "s";

        String actualResult = solution.makeGood(input);

        assertEquals(expected, actualResult, "Should have returned " + expected);
    }

    @Test
    @DisplayName("input: s, output: s")
    void test4() {
        var input = "s";
        var expected = "s";

        String actualResult = solution.makeGood(input);

        assertEquals(expected, actualResult, "Should have returned " + expected);
    }

}