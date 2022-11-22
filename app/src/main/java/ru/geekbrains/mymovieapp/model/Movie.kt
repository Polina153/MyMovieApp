package ru.geekbrains.mymovieapp.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Movie (
    val title: String = "No title",
    val genre: String = "No genre",
    val overview: String = "No overview",
    val voteAverage: Double = 0.0
) : Parcelable

fun getDefaultMovie() = Movie("Best Movie Ever", "soap-opera", "bla-bla-bla", 9.9)

fun getListFromServer(): List<Movie> {
return listOf(Movie("Лучший фильм", "soap-opera", "bla-bla-bla", 9.9),
    Movie("Середнячок", "detective", "bla-bla", 8.8),
    Movie("Фу-фу такое смотреть", "thriller", "bla", 7.7)
)
}

fun getListFromEnglishServer(): List<Movie> {
    return listOf(Movie("Best Movie Ever", "soap-opera", "bla-bla-bla", 9.9),
        Movie("Some Movie", "detective", "bla-bla", 8.8),
        Movie("Worst Movie Ever", "thriller", "bla", 7.7)
    )
}