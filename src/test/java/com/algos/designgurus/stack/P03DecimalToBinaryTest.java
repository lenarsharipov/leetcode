package com.algos.designgurus.stack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P03DecimalToBinaryTest {

    @Test
    @DisplayName("Convert 2 into binary")
    void test1() {
        var num = 2;
        var expectedResult = "10";

        var actualResult = P03DecimalToBinary.decimalToBinary(num);

        assertEquals(expectedResult, actualResult, "Should have returned " + expectedResult);
    }

    @Test
    @DisplayName("Convert 7 into binary")
    void test2() {
        var num = 7;
        var expectedResult = "111";

        var actualResult = P03DecimalToBinary.decimalToBinary(num);

        assertEquals(expectedResult, actualResult, "Should have returned " + expectedResult);
    }

    @Test
    @DisplayName("Convert 18 into binary")
    void test3() {
        var num = 18;
        var expectedResult = "10010";

        var actualResult = P03DecimalToBinary.decimalToBinary(num);

        assertEquals(expectedResult, actualResult, "Should have returned " + expectedResult);
    }

    @Test
    @DisplayName("Convert 1 into binary")
    void test5() {
        var num = 1;
        var expectedResult = "1";

        var actualResult = P03DecimalToBinary.decimalToBinary(num);

        assertEquals(expectedResult, actualResult, "Should have returned " + expectedResult);
    }

}