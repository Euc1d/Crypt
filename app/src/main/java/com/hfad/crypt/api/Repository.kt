package com.hfad.crypt.api

import com.hfad.crypt.data.NocushCurrenceRate
import com.hfad.crypt.data.cushCurrencyRate
import retrofit2.Response

class Repository() {
    suspend fun  getCash(): Response<cushCurrencyRate>{
        return RetrofitInstance.api.getCashRates()
    }
    suspend fun getNoCash(): Response<NocushCurrenceRate>{
        return RetrofitInstance.api.getNonCashRates()
    }
}