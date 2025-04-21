package com.hfad.crypt.new_api

import com.hfad.crypt.new_data.BankRates
import com.hfad.crypt.new_data.Rate
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header

interface FetanApi {
    @GET("api/exchange-rates")
    suspend fun getExchangeRates(
        @Header("Authorization") token: String = "Bearer c8241d2632b31962e45f9fa0a678ef824aee5918b4e518c1e7a419c00a0aeb18"
    ): Response<List<BankRates>>
}
