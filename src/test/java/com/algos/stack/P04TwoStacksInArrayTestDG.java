package com.algos.stack;

import com.algos.stack.P04TwoStacksInArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P04TwoStacksInArrayTestDG {
    private P04TwoStacksInArray solution;

    @BeforeEach
    void init() {
        solution = new P04TwoStacksInArray(100);
    }

    @Test
    @DisplayName("push1(1), push1(4) pops1 4, push2(2), push2(3) pops2 3")
    void test1() {
        var expected1 = 4;
        var expected2 = 3;

        solution.push1(1);
        solution.push2(2);
        solution.push2(3);
        solution.push1(4);

        assertEquals(expected1, solution.pop1(), "Should have returned " + expected1);
        assertEquals(expected2, solution.pop2(), "Should have returned " + expected2);
    }

    @Test
    @DisplayName("push2(1), push2(2), push1(3), push2(4) then pop1 returns 3, pops2 returns 4")
    void test2() {
        var expected1 = 3;
        var expected2 = 4;

        solution.push2(1);
        solution.push2(2);
        solution.push1(3);
        solution.push2(4);

        assertEquals(expected1, solution.pop1(), "Should have returned " + expected1);
        assertEquals(expected2, solution.pop2(), "Should have returned " + expected2);
    }

    @Test
    @DisplayName("push2(1), push2(2), push1(3), push2(4) then pop1 returns 3, pops2 return 4")
    void test3() {
        var expected1 = 3;
        var expected2 = 4;

        solution.push1(1);
        solution.push1(2);
        solution.push1(3);
        solution.push2(4);

        assertEquals(expected1, solution.pop1(), "Should have returned " + expected1);
        assertEquals(expected2, solution.pop2(), "Should have returned " + expected2);
    }

}