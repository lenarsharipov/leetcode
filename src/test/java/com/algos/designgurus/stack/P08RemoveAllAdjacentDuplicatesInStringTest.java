package com.algos.designgurus.stack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P08RemoveAllAdjacentDuplicatesInStringTest {
    private final P08RemoveAllAdjacentDuplicatesInString solution = new P08RemoveAllAdjacentDuplicatesInString();

    @Test
    @DisplayName("Input: abbaca, expected: ca")
    public void test1() {
        String input = "abbaca";
        String expected = "ca";

        String actualResult = solution.removeDuplicates(input);

        assertEquals(expected, actualResult, "Should have returned " + expected);
    }

    @Test
    @DisplayName("Input: azxxzy, expected: ay")
    public void test2() {
        String input = "azxxzy";
        String expected = "ay";

        String actualResult = solution.removeDuplicates(input);

        assertEquals(expected, actualResult, "Should have returned " + expected);
    }

    @Test
    @DisplayName("Input: abba, expected: empty string")
    public void test3() {
        String input = "abba";
        String expected = "";

        String actualResult = solution.removeDuplicates(input);

        assertEquals(expected, actualResult, "Should have returned " + expected);
    }

}