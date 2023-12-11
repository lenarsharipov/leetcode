package com.algos.leetcode;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class Leetcode2433TestDG {
    private final Leetcode2433 solution = new Leetcode2433();

    @Test
    public void test1() {
        int[] pref = {5, 2, 0, 3, 1};
        int[] output = {5, 7, 2, 3, 2};
        assertThat(output).isEqualTo(solution.findArray(pref));
    }

    @Test
    public void test2() {
        int[] pref = {13};
        int[] output = {13};
        assertThat(output).isEqualTo(solution.findArray(pref));
    }

}