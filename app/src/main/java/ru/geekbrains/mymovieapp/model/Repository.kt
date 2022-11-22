package ru.geekbrains.mymovieapp.model

interface Repository {
    fun getMovieFromServer(): Movie
    fun getRussianMovies(): List<Movie>
    fun getAbroadMovies(): List<Movie>

}