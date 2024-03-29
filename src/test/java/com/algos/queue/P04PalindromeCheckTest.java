package com.algos.queue;

import com.algos.queue.P04PalindromeCheck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P04PalindromeCheckTest {

    @Test
    void test1() {
        String s = "madam";
        boolean actual = P04PalindromeCheck.checkPalindrome(s);
        assertTrue(actual);
    }

    @Test
    void test2() {
        String s = "openai";
        boolean actual = P04PalindromeCheck.checkPalindrome(s);
        assertFalse(actual);
    }

    @Test
    void test3() {
        String s = "A man a plan a canal Panama";
        boolean actual = P04PalindromeCheck.checkPalindrome(s);
        assertTrue(actual);
    }

    @Test
    void test4() {
        String s = "no x in nixon";
        boolean actual = P04PalindromeCheck.checkPalindrome(s);
        assertTrue(actual);
    }

}