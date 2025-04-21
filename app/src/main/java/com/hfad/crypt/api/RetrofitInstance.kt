package com.hfad.crypt.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private val retrofit by lazy{
        Retrofit.Builder()
            .baseUrl("https://api.privatbank.ua/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val api: ApiCashInterface by lazy{
        retrofit.create(ApiCashInterface::class.java)
    }
}