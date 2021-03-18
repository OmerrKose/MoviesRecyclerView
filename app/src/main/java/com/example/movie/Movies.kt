package com.example.movie

data class Movies(
        @SerializedName("id") val id : Int?,
        @SerializedName("title") val title: String?,
        @SerializedName("title") val director: String?)