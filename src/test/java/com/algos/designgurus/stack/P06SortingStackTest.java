package com.algos.designgurus.stack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class P06SortingStackTest {

    @Test
    @DisplayName("Input: [34, 3, 31, 98, 92, 23], Output: [3, 23, 31, 34, 92, 98]")
    public void test1() {
        Stack<Integer> input = new Stack<>();
        input.add(34);
        input.add(3);
        input.add(31);
        input.add(98);
        input.add(92);
        input.add(23);

        Stack<Integer> expected = new Stack<>();
        expected.add(3);
        expected.add(23);
        expected.add(31);
        expected.add(34);
        expected.add(92);
        expected.add(98);

        Stack<Integer> actualResult = P06SortingStack.sortStack(input);

        assertEquals(expected, actualResult, "Should have returned stack: [3, 23, 31, 34, 92, 98]");

    }

    @Test
    @DisplayName("Input: [4, 3, 2, 10, 12, 1, 5, 6], Output: [1, 2, 3, 4, 5, 6, 10, 12]")
    public void test2() {
        Stack<Integer> input = new Stack<>();
        input.add(4);
        input.add(3);
        input.add(2);
        input.add(10);
        input.add(12);
        input.add(1);
        input.add(5);
        input.add(6);

        Stack<Integer> expected = new Stack<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(10);
        expected.add(12);

        Stack<Integer> actualResult = P06SortingStack.sortStack(input);

        assertEquals(expected, actualResult, "Should have returned stack: [1, 2, 3, 4, 5, 6, 10, 12]");
    }

    @Test
    @DisplayName("Input: [20, 10, -5, -1], Output: [-5, -1, 10, 20]")
    public void test3() {
        Stack<Integer> input = new Stack<>();
        input.add(20);
        input.add(10);
        input.add(-5);
        input.add(-1);

        Stack<Integer> expected = new Stack<>();
        expected.add(-5);
        expected.add(-1);
        expected.add(10);
        expected.add(20);

        Stack<Integer> actualResult = P06SortingStack.sortStack(input);

        assertEquals(expected, actualResult, "Should have returned stack: [-5, -1, 10, 20]");

    }

    @Test
    @DisplayName("Input: [1, 2, 3, 4, 5], Output: [1, 2, 3, 4, 5]")
    public void test4() {
        Stack<Integer> input = new Stack<>();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        input.add(5);

        Stack<Integer> expected = new Stack<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);

        Stack<Integer> actualResult = P06SortingStack.sortStack(input);

        assertEquals(expected, actualResult, "Should have returned stack: [1, 2, 3, 4, 5]");

    }

}