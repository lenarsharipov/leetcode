package com.algos.designgurus.stack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedParenthesesTest {

    @Test
    @DisplayName("fvdv")
    void whenBalancedThenShouldReturnTrue() {
        var solution = new BalancedParentheses();
        var input = "{[()]}";
        assertTrue(solution.isValid(input), "");
    }

    @Test
    void whenNotBalancedThenShouldReturnFalse() {
        var solution = new BalancedParentheses();
        var input = "{[}]";
        assertFalse(solution.isValid(input), "");
    }

    @Test
    void whenNotBalanced2ThenShouldReturnFalse() {
        var solution = new BalancedParentheses();
        var input = "(]";
        assertFalse(solution.isValid(input), "");
    }

    @Test
    void whenNotBalanced3ThenShouldReturnFalse() {
        var solution = new BalancedParentheses();
        var input = "]}";
        assertFalse(solution.isValid(input), "");
    }

}