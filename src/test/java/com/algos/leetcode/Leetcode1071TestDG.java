package com.algos.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class Leetcode1071TestDG {
    private final Leetcode1071 solution = new Leetcode1071();

    @Test
    public void solve1071A() {
        assertThat("ABC").isEqualTo(solution.gcdOfStrings("ABCABC", "ABC"));
    }

    @Test
    public void solve1071B() {
        assertThat("AB").isEqualTo(solution.gcdOfStrings("ABABAB", "ABAB"));
    }

    @Test
    public void solve1071C() {
        assertThat("").isEqualTo(solution.gcdOfStrings("LEET", "CODE"));
    }

    @Test
    public void solve1071D() {
        assertThat("ABAB").isEqualTo(solution.gcdOfStrings("ABABABAB", "ABAB"));
    }

}