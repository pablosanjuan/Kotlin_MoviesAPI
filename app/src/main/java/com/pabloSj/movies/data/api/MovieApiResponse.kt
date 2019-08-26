package com.pabloSj.movies.data.api

import com.google.gson.annotations.SerializedName
import com.pabloSj.movies.data.model.Movie

data class MovieApiResponse(
    @SerializedName("page")
    var page: Int,
    @SerializedName("total_results")
    var total_results: Int,
    @SerializedName("total_pages")
    var total_pages: Int,
    @SerializedName("results")
    var results: List<Movie> = emptyList()
)