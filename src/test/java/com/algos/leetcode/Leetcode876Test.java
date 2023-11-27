package com.algos.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class Leetcode876Test {
    private final Leetcode876 solution = new Leetcode876();

    @Test
    void when12345Then345() {
        var listNode = new Leetcode876.ListNode(1,
                new Leetcode876.ListNode(2,
                        new Leetcode876.ListNode(3,
                                new Leetcode876.ListNode(4,
                                        new Leetcode876.ListNode(5)))));
        var expected = new Leetcode876.ListNode(3,
                new Leetcode876.ListNode(4,
                        new Leetcode876.ListNode(5)));

        assertThat(solution.middleNode(listNode))
                .usingRecursiveComparison()
                .isEqualTo(expected);
    }

    @Test
    void when123456Then456() {
        var listNode = new Leetcode876.ListNode(1,
                new Leetcode876.ListNode(2,
                        new Leetcode876.ListNode(3,
                                new Leetcode876.ListNode(4,
                                        new Leetcode876.ListNode(5,
                                                new Leetcode876.ListNode(6))))));
        var expected = new Leetcode876.ListNode(4,
                new Leetcode876.ListNode(5,
                        new Leetcode876.ListNode(6)));

        assertThat(solution.middleNode(listNode))
                .usingRecursiveComparison()
                .isEqualTo(expected);
    }

}