package com.hfad.crypt.new_data

data class BankRates(
    val bank: String,
    val timestamp: String,
    val rates: Map<String, Rate> // ключ = USD, EUR и т.д.
)