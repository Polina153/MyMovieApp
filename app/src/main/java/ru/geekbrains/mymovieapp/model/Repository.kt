package ru.geekbrains.mymovieapp.model

interface Repository {
    fun getListFromServer(): ListOfMovies
    fun getListFromLocalStorage(): ListOfMovies

}