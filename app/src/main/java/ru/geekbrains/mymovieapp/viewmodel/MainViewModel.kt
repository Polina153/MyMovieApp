package ru.geekbrains.mymovieapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.geekbrains.mymovieapp.model.Repository
import ru.geekbrains.mymovieapp.model.RepositoryImpl

class MainViewModel(
    private val liveDataToObserve: MutableLiveData<Any> = MutableLiveData(),
    private val repositoryImpl: Repository = RepositoryImpl()
) :
    ViewModel() {
    fun getDate(): LiveData<Any> {
        return liveDataToObserve
    }
    fun getListOfRussianMovies() = getRussianMovies()
    fun getListOfAbroadMovies() = getAbroadMovies()
}