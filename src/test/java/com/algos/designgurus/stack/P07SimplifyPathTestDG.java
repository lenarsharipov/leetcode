package com.algos.designgurus.stack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P07SimplifyPathTestDG {

    @Test
    @DisplayName("Input: /a//b////c/d//././/.., Output: /a/b/c")
    void test1() {
        String input = "/a//b////c/d//././/..";
        String expected = "/a/b/c";
        String actualResult = P07SimplifyPath.simplifyPath(input);

        assertEquals(expected, actualResult, "Should have returned " + expected);
    }

    @Test
    @DisplayName("Input: /../, Output: /")
    void test2() {
        String input = "/../";
        String expected = "/";
        String actualResult = P07SimplifyPath.simplifyPath(input);

        assertEquals(expected, actualResult, "Should have returned " + expected);
    }

    @Test
    @DisplayName("Input: /home//foo/, Output: /home/foo")
    void test3() {
        String input = "/home//foo/";
        String expected = "/home/foo";
        String actualResult = P07SimplifyPath.simplifyPath(input);

        assertEquals(expected, actualResult, "Should have returned " + expected);
    }

    @Test
    @DisplayName("Input: /home/foo, Output: /home/foo")
    void test4() {
        String input = "/home/foo";
        String expected = "/home/foo";
        String actualResult = P07SimplifyPath.simplifyPath(input);

        assertEquals(expected, actualResult, "Should have returned " + expected);
    }

    @Test
    @DisplayName("Input: /, Output: /")
    void test5() {
        String input = "/";
        String expected = "/";
        String actualResult = P07SimplifyPath.simplifyPath(input);

        assertEquals(expected, actualResult, "Should have returned " + expected);
    }

    @Test
    @DisplayName("Input: /, Output: /")
    void test6() {
        String input = "/a/b/..";
        String expected = "/a";
        String actualResult = P07SimplifyPath.simplifyPath(input);

        assertEquals(expected, actualResult, "Should have returned " + expected);
    }

}