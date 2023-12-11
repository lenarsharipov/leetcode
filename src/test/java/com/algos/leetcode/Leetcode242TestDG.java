package com.algos.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class Leetcode242TestDG {
    private final Leetcode242 solution = new Leetcode242();

    @Test
    void firstTest() {
        assertThat(solution.isAnagram("anagram", "nagaram")).isTrue();
    }

    @Test
    void secondTest() {
        assertThat(solution.isAnagram("rat", "car")).isFalse();
    }

}