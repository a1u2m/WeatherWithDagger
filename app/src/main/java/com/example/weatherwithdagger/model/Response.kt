package com.example.weatherwithdagger.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Response {

    @SerializedName("weather")
    @Expose
    lateinit var weather: List<Weather>

    @SerializedName("main")
    @Expose
    lateinit var main: Main

    @SerializedName("wind")
    @Expose
    lateinit var wind: Wind

}