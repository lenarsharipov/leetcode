package com.algos.designgurus.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P03GenerateBinaryNumberFrom1ToNTest {

    @Test
    void test1() {
        int n = 2;
        String[] expected = {"1", "10"};
        String[] actual = P03GenerateBinaryNumberFrom1ToN.generateBinaryNumbers(n);

        assertArrayEquals(expected, actual);
    }

    @Test
    void test2() {
        int n = 3;
        String[] expected = {"1", "10", "11"};
        String[] actual = P03GenerateBinaryNumberFrom1ToN.generateBinaryNumbers(n);

        assertArrayEquals(expected, actual);
    }

    @Test
    void test3() {
        int n = 5;
        String[] expected = {"1", "10", "11", "100", "101"};
        String[] actual = P03GenerateBinaryNumberFrom1ToN.generateBinaryNumbers(n);

        assertArrayEquals(expected, actual);
    }

}