package com.designgurus;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class Problem2ContainsDuplicateTest {
    private final Problem2ContainsDuplicate solution = new Problem2ContainsDuplicate();

    @Test
    public void test1() {
        int[] nums = {1, 2, 3, 4};
        assertThat(solution.containsDuplicate(nums)).isFalse();
    }

    @Test
    public void test2() {
        int[] nums = {1, 2, 3, 1};
        assertThat(solution.containsDuplicate(nums)).isTrue();
    }

    @Test
    public void test3() {
        int[] nums = {};
        assertThat(solution.containsDuplicate(nums)).isFalse();
    }

    @Test
    public void test4() {
        int[] nums = {1};
        assertThat(solution.containsDuplicate(nums)).isFalse();
    }

    @Test
    public void test5() {
        assertThat(solution.containsDuplicate(null)).isFalse();
    }

}