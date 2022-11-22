package ru.geekbrains.mymovieapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(private val liveDataToObserve: MutableLiveData<Any> = MutableLiveData()) :
ViewModel() {
    fun getDate(): LiveData<Any> {
        return liveDataToObserve
    }
    // TODO: Implement the ViewModel
}