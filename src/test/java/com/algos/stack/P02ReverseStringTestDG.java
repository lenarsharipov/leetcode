package com.algos.stack;

import com.algos.stack.P02ReverseString;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P02ReverseStringTestDG {

    private final P02ReverseString solution = new P02ReverseString();

    @Test
    @DisplayName("Hello world! reversed as !dlroW ,olleH")
    void test1() {
        var s = "Hello, World!";
        var expected = "!dlroW ,olleH";

        var actualResult = solution.reverseString(s);

        assertEquals(expected, actualResult, "Should have returned !dlroW ,olleH");
    }

    @Test
    @DisplayName("OpenAI reversed as IANepO")
    void test2() {
        var s = "OpenAI";
        var expected = "IAnepO";

        var actualResult = solution.reverseString(s);

        assertEquals(expected, actualResult, "Should have returned " + expected);
    }

    @Test
    @DisplayName("Stacks are fun! reversed as !nuf era skcatS")
    void test3() {
        var s = "Stacks are fun!";
        var expected = "!nuf era skcatS";

        var actualResult = solution.reverseString(s);

        assertEquals(expected, actualResult, "Should have returned !nuf era skcatS");
    }

    @Test
    @DisplayName("S reversed as S")
    void test4() {
        var s = "S";
        var expected = "S";

        var actualResult = solution.reverseString(s);

        assertEquals(expected, actualResult, "Should have returned S");
    }

}