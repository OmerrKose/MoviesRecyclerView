package com.example.movie

import retrofit2.http.GET

public interface MoviesApi {
    @GET("movie/popular")

    fun getPopularMovies(

    )
}