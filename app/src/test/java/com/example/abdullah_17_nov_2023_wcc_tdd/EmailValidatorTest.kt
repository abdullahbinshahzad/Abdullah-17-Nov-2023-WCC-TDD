package com.example.abdullah_17_nov_2023_wcc_tdd
import org.junit.Assert.*
import org.junit.Test
class EmailValidatorTest {
    private val emailValidator = EmailValidator()

    @Test
    fun `valid email should return true`() {
        assertTrue(emailValidator.isValidEmail("abdullah@gmail.com"))
    }

    @Test
    fun `email without @ should return false`() {
        assertFalse(emailValidator.isValidEmail("abdullahgmail.com"))
    }

    @Test
    fun `valid email including special characters should return true`() {
        assertTrue(emailValidator.isValidEmail("abdullah$12@gmail.com"))
    }

    @Test
    fun `email having TLD of two characters should return false`() {
        assertFalse(emailValidator.isValidEmail("abdullah@gmail.co"))
    }
}