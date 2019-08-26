package com.pabloSj.movies.data.api.service

import com.pabloSj.movies.data.api.MovieApiResponse
import com.pabloSj.movies.util.CATEGORY_POPULAR
import com.pabloSj.movies.util.CATEGORY_TOP_RATED
import com.pabloSj.movies.util.UPCOMINNG
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Service {
        @GET(CATEGORY_POPULAR)
        fun getMoviesPopular(@Query("api_key") api_key: String): Call<MovieApiResponse>

        @GET(CATEGORY_TOP_RATED)
        fun getMoviesRated(@Query("api_key") api_key: String): Call<MovieApiResponse>

        @GET(UPCOMINNG)
        fun getMoviesUpcoming(@Query("api_key") api_key: String): Call<MovieApiResponse>
}