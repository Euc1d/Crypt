package com.hfad.crypt.new_api

import com.hfad.crypt.new_data.BankRates
import retrofit2.Response

class Repository {
    suspend fun getRates(): Response<List<BankRates>> {
        return RetrofitInstance.api.getExchangeRates()
    }
}