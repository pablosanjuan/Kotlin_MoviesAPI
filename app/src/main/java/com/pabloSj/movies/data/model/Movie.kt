package com.pabloSj.movies.data.model

import com.google.gson.annotations.SerializedName

data class Movie(
    @SerializedName("vote_count") val vote_count: String,
    @SerializedName("id") val id: String,
    @SerializedName("video") val video: String,
    @SerializedName("vote_average") val vote_average: String,
    @SerializedName("title") val title: String,
    @SerializedName("popularity") val popularity: String,
    @SerializedName("poster_path") val poster_path: String,
    @SerializedName("original_language") val original_language: String,
    @SerializedName("original_title") val original_title: String,
    @SerializedName("backdrop_path") val backdrop_path: String,
    @SerializedName("overview") val overview: String,
    @SerializedName("adult") val adult: String,
    @SerializedName("release_date") val release_date: String
)