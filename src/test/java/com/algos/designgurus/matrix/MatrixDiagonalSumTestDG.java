package com.algos.designgurus.matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixDiagonalSumTestDG {

    @Test
    void test1() {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        int expected = 25;
        int actual = MatrixDiagonalSum.diagonalSum(mat);
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        int[][] mat = {
                {1, 2},
                {3, 4}
        };
        int expected = 10;
        int actual = MatrixDiagonalSum.diagonalSum(mat);
        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        int[][] mat = {
                {1}
        };
        int expected = 1;
        int actual = MatrixDiagonalSum.diagonalSum(mat);
        assertEquals(expected, actual);
    }

    @Test
    void test4() {
        int[][] mat = {
                {5, 3, 9},
                {4, 7, 1},
                {8, 6, 2}
        };
        int expected = 31;
        int actual = MatrixDiagonalSum.diagonalSum(mat);
        assertEquals(expected, actual);
    }

}