package com.algos.designgurus.matrix;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RichestCustomerWealthTest {

    @Test
    public void test1() {
        int[][] accounts = {
                {5, 2, 3},
                {0, 6, 7}
        };
        int expected = 13;
        assertThat(RichestCustomerWealth.maximumWealth(accounts))
                .isEqualTo(expected);
    }

    @Test
    public void test2() {
        int[][] accounts = {
                {1, 2},
                {3, 4},
                {5, 6}
        };
        int expected = 11;
        assertThat(RichestCustomerWealth.maximumWealth(accounts))
                .isEqualTo(expected);
    }

    @Test
    public void test3() {
        int[][] accounts = {
                {10, 100},
                {200, 20},
                {30, 300}
        };
        int expected = 330;
        assertThat(RichestCustomerWealth.maximumWealth(accounts))
                .isEqualTo(expected);
    }

}