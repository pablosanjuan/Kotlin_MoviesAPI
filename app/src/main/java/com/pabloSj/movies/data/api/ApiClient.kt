package com.pabloSj.movies.data.api

import com.pabloSj.movies.data.api.service.Service
import com.pabloSj.movies.util.API_URL
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient{
    lateinit var retrofit:Retrofit
    fun provideHttpClient(): Retrofit {
        retrofit = Retrofit.Builder()
            .baseUrl(API_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit
    }

}

