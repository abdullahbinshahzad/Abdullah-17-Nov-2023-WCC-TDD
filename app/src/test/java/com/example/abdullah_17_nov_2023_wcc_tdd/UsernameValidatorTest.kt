package com.example.abdullah_17_nov_2023_wcc_tdd
import org.junit.Assert.*
import org.junit.Test
class UsernameValidatorTest {
    private val usernameValidator = UsernameValidator()

    @Test
    fun `valid username should return true`() {
        assertTrue(usernameValidator.isValidUsername("Abdullah123go"))
    }

    @Test
    fun `username with special characters should return false`() {
        assertFalse(usernameValidator.isValidUsername("Abdullah-Shahzad@1"))
    }

    @Test
    fun `username without uppercase should return true`() {
        assertTrue(usernameValidator.isValidUsername("sonofshahzad"))
    }

    @Test
    fun `username exceeding max characters should return false`() {
        assertFalse(usernameValidator.isValidUsername("abdullahshahzad1234567890"))
    }

}