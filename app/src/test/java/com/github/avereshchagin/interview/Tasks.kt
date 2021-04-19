package com.github.avereshchagin.interview

import org.junit.Test

import org.junit.Assert.*

class Tasks {

    // true если длина content не меньше 6 символов
    fun validateAtLeast6Characters(content: CharSequence): Boolean {

    }

    @Test
    fun testAtLeast6Characters() {
        assertTrue(validateAtLeast6Characters("123456"))
        assertTrue(validateAtLeast6Characters("1234567890"))

        assertFalse(validateAtLeast6Characters(""))
        assertFalse(validateAtLeast6Characters("1"))
        assertFalse(validateAtLeast6Characters("12345"))
    }

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
        assertFalse(validateOnlyEnglishCharacters("??"))
        assertFalse(validateOnlyEnglishCharacters(","))
    }
}