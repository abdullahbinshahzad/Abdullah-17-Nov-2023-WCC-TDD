package com.example.abdullah_17_nov_2023_wcc_tdd

class UsernameValidator {
    fun isValidUsername(username: String): Boolean {
        // Username should have a minimum length of 4 characters
        val minLength = 4

        // Username should have a maximum length of 20 characters
        val maxLength = 20

        // Username should only contain alphanumeric characters (letters and digits)
        val alphanumericRegex = Regex("[a-zA-Z0-9]+")

        return (
                username.length in minLength..maxLength &&
                        username.matches(alphanumericRegex)
                )
    }
}