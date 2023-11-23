package com.example.abdullah_17_nov_2023_wcc_tdd

import org.junit.Assert.*
import org.junit.Test

class PasswordValidatorTest {

    private val passwordValidator = PasswordValidator()

    @Test
    fun `valid password should return true`() {
        assertTrue(passwordValidator.isValidPassword("StrongPassword123!"))
    }

    @Test
    fun `password without special character should return false`() {
        assertFalse(passwordValidator.isValidPassword("WeakPassword123"))
    }

    @Test
    fun `password with less then minimum character should return false`() {
        assertFalse(passwordValidator.isValidPassword("Pasword"))
    }

    @Test
    fun `strongest valid password should return true`() {
        assertTrue(passwordValidator.isValidPassword("S!t@r#0*n(g)"))
    }

}