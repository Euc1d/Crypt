package com.hfad.crypt.api

import com.hfad.crypt.data.NocushCurrenceRate
import com.hfad.crypt.data.cushCurrencyRate
import retrofit2.Response
import retrofit2.http.GET

interface ApiCashInterface {
    @GET("p24api/pubinfo?exchange&coursid=5")
    suspend fun getCashRates(): Response<cushCurrencyRate>

    @GET("p24api/pubinfo?exchange&coursid=11")
    suspend fun getNonCashRates(): Response<NocushCurrenceRate>
}