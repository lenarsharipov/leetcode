package leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class L0001Leetcode1768Test {
    private final L0001Leetcode1768 solution = new L0001Leetcode1768();

    @Test
    void testMergeAlternately() {
        assertThat("apbqcr").isEqualTo(solution.mergeAlternately("abc", "pqr"));
        assertThat("apbqrs").isEqualTo(solution.mergeAlternately("ab", "pqrs"));
        assertThat("apbqcd").isEqualTo(solution.mergeAlternately("abcd", "pq"));
    }

}