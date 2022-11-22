package ru.geekbrains.mymovieapp.model

class RepositoryImpl: Repository {
    override fun getMovieFromServer() = Movie()

    override fun getRussianMovies() = getListFromServer()

    override fun getAbroadMovies() = getListFromEnglishServer()
}