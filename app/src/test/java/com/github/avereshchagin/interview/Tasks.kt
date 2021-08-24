package com.github.avereshchagin.interview

import org.junit.Test

import org.junit.Assert.*

class Tasks {

    // true when content does not contain a sequence of 3 and more characters or digits in alphabetical order,
    // for example 123 or abc
    fun validateConsecutiveCharacters(content: CharSequence): Boolean {

    }

    @Test
    fun testConsecutiveCharacters() {
        assertTrue(validateConsecutiveCharacters("1"))
        assertTrue(validateConsecutiveCharacters("12"))
        assertTrue(validateConsecutiveCharacters("124"))
        assertTrue(validateConsecutiveCharacters("111222"))
        assertTrue(validateConsecutiveCharacters("a"))
        assertTrue(validateConsecutiveCharacters("aabbb"))
        assertTrue(validateConsecutiveCharacters("aBc"))

        assertFalse(validateConsecutiveCharacters("678"))
        assertFalse(validateConsecutiveCharacters("1112333"))
        assertFalse(validateConsecutiveCharacters("abcABC"))
        assertFalse(validateConsecutiveCharacters("23xyz87"))
        assertFalse(validateConsecutiveCharacters("3wDEF"))
    }

    // true when content contains only English characters and digits
    fun validateOnlyEnglishCharacters(content: CharSequence): Boolean {

    }

    @Test
    fun testOnlyEnglishCharacters() {
        assertTrue(validateOnlyEnglishCharacters("ahYK54"))
        assertTrue(validateOnlyEnglishCharacters("a"))
        assertTrue(validateOnlyEnglishCharacters("Z"))
        assertTrue(validateOnlyEnglishCharacters("7"))
        assertTrue(validateOnlyEnglishCharacters("7z"))
        assertTrue(validateOnlyEnglishCharacters("Q4"))

        assertFalse(validateOnlyEnglishCharacters("Q4t*"))
        assertFalse(validateOnlyEnglishCharacters("Q4š"))
        assertFalse(validateOnlyEnglishCharacters("??"))
        assertFalse(validateOnlyEnglishCharacters(","))
    }

    // Input: two sorted in ascending order lists of Int values,
    // output list must contain values from input lists in ascending order
    fun merge(first: List<Int>, second: List<Int>): List<Int> {

    }

    @Test
    fun testMerge() {
        assertEquals(listOf<Int>(), merge(listOf(), listOf()))
        assertEquals(listOf(4), merge(listOf(4), listOf()))
        assertEquals(listOf(7), merge(listOf(), listOf(7)))
        assertEquals(listOf(1, 2), merge(listOf(1), listOf(2)))
        assertEquals(listOf(3, 3), merge(listOf(3), listOf(3)))
        assertEquals(listOf(1, 2, 5, 5, 7, 7, 8), merge(listOf(2, 5, 7, 7, 8), listOf(1, 5)))
    }
}
