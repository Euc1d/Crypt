package com.hfad.crypt.new_api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://fetan.co/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: FetanApi by lazy {
        retrofit.create(FetanApi::class.java)
    }
}
