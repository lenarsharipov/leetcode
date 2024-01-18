package com.algos.array;

import com.algos.array.P02ContainsDuplicate;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class P02ContainsDuplicateTest {
    private final P02ContainsDuplicate solution = new P02ContainsDuplicate();

    @Test
    public void test1() {
        int[] nums = {1, 2, 3, 4};
        assertThat(solution.containsDuplicateBruteForce(nums)).isFalse();
    }

    @Test
    public void test2() {
        int[] nums = {1, 2, 3, 1};
        assertThat(solution.containsDuplicateBruteForce(nums)).isTrue();
    }

    @Test
    public void test3() {
        int[] nums = {};
        assertThat(solution.containsDuplicateBruteForce(nums)).isFalse();
    }

    @Test
    public void test4() {
        int[] nums = {1};
        assertThat(solution.containsDuplicateBruteForce(nums)).isFalse();
    }

    @Test
    public void test5() {
        assertThat(solution.containsDuplicateBruteForce(null)).isFalse();
    }

    @Test
    public void testViaHashSet1() {
        int[] nums = {1, 2, 3, 4};
        assertThat(solution.containsDuplicateViaHash(nums)).isFalse();
    }

    @Test
    public void testViaHashSet2() {
        int[] nums = {1, 2, 3, 1};
        assertThat(solution.containsDuplicateViaHash(nums)).isTrue();
    }

    @Test
    public void testViaHashSet3() {
        int[] nums = {};
        assertThat(solution.containsDuplicateViaHash(nums)).isFalse();
    }

    @Test
    public void testViaHashSet4() {
        int[] nums = {1};
        assertThat(solution.containsDuplicateViaHash(nums)).isFalse();
    }

    @Test
    public void testViaHashSet5() {
        assertThat(solution.containsDuplicateViaHash(null)).isFalse();
    }

    @Test
    public void testViaSorting1() {
        int[] nums = {1, 2, 3, 4};
        assertThat(solution.containsDuplicateViaSorting(nums)).isFalse();
    }

    @Test
    public void testViaSorting2() {
        int[] nums = {1, 2, 3, 1};
        assertThat(solution.containsDuplicateViaSorting(nums)).isTrue();
    }

    @Test
    public void testViaSorting3() {
        int[] nums = {};
        assertThat(solution.containsDuplicateViaSorting(nums)).isFalse();
    }

    @Test
    public void testViaSorting4() {
        int[] nums = {1};
        assertThat(solution.containsDuplicateViaSorting(nums)).isFalse();
    }

    @Test
    public void testViaSorting5() {
        assertThat(solution.containsDuplicateViaSorting(null)).isFalse();
    }

}