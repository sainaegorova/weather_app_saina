package com.example.weathersaina


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.weathersaina.adapters.WeatherModel


class MainViewModel : ViewModel() {
    val liveDataCurrent = MutableLiveData<WeatherModel>()
    val liveDataList = MutableLiveData<List<WeatherModel>>()
}
