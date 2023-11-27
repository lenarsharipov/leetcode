package com.algos.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class Leetcode383Test {
    private final Leetcode383 solution = new Leetcode383();

    @Test
    void whenAFromBThenFalse() {
        var ransomNote = "a";
        var magazine = "b";
        assertThat(solution.canConstruct(ransomNote, magazine)).isFalse();
    }

    @Test
    void whenAAFromABThenFalse() {
        var ransomNote = "aa";
        var magazine = "ab";
        assertThat(solution.canConstruct(ransomNote, magazine)).isFalse();
    }

    @Test
    void whenAAFromAABThenTrue() {
        var ransomNote = "aa";
        var magazine = "aab";
        assertThat(solution.canConstruct(ransomNote, magazine)).isTrue();
    }

}