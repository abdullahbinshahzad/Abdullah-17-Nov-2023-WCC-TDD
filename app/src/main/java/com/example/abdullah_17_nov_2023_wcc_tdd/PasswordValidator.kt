package com.example.abdullah_17_nov_2023_wcc_tdd

class PasswordValidator {
    fun isValidPassword(password: String): Boolean {
        // Password should have a minimum length of 8 characters
        val minLength = 8

        // Password should contain at least one uppercase letter
        val uppercaseRegex = Regex("[A-Z]")

        // Password should contain at least one lowercase letter
        val lowercaseRegex = Regex("[a-z]")

        // Password should contain at least one digit
        val digitRegex = Regex("\\d")

        // Password should contain at least one special character
        val specialCharRegex = Regex("[!@#\$%^&*()_+\\-=\\[\\]{};':\",.<>/?]")

        return (
                password.length >= minLength &&
                        password.contains(uppercaseRegex) &&
                        password.contains(lowercaseRegex) &&
                        password.contains(digitRegex) &&
                        password.contains(specialCharRegex)
                )

    }
}