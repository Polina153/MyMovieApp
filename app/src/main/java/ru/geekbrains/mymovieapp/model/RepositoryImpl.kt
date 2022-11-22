package ru.geekbrains.mymovieapp.model

class RepositoryImpl {
    fun getListFromServer(): ListOfMovies{
        return ListOfMovies()
    }
    fun getListFromLocalStorage(): ListOfMovies{
        return ListOfMovies()
    }
}