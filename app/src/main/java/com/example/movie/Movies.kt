package com.example.movie

import com.google.gson.annotations.SerializedName

data class Movies(
        @SerializedName("id")
        val id : Int?,
        @SerializedName("title")
        val title: String?,
        @SerializedName("director")
        val director: String?)