package com.github.avereshchagin.interview

import org.junit.Test

import org.junit.Assert.*

class Tasks {

    // true если content содержит хотя бы одну английскую букву и одну цифру
    fun validateNumberAndCharacter(content: CharSequence): Boolean {

    }

    @Test
    fun testNumberAndCharacter() {
        assertTrue(validateNumberAndCharacter("a1a"))
        assertTrue(validateNumberAndCharacter("8g5"))
        assertTrue(validateNumberAndCharacter("8T2"))
        assertTrue(validateNumberAndCharacter("U7u"))

        assertFalse(validateNumberAndCharacter("75"))
        assertFalse(validateNumberAndCharacter("aT"))
        assertFalse(validateNumberAndCharacter("Un"))
    }

    // true если content не содержит последовательность из трёх и более идущих в алфавитном порядке букв и цифр,
    // например 123 или abc
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

    // true если content не содержит ничего, кроме букв английского алфавита и цифр
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

    // На вход поступают отсортированнвые списки значений типа Int,
    // выходной список должен содержать элементы из первых двух списков в порядке возрастания.
    // Необходимо реализовать оптимальный по алгоритмической сложности алгоритм
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