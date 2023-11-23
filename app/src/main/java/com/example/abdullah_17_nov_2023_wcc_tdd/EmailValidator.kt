package com.example.abdullah_17_nov_2023_wcc_tdd

class EmailValidator {
    fun isValidEmail(email: String): Boolean {
        val emailRegex = Regex("[A-Za-z0-9!@#$%^&*()-=+]+@[A-Za-z0-9]+\\.[A-Z|a-z]{2,3}")
        return emailRegex.matches(email)
    }
}