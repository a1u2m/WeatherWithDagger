package com.example.weatherwithdagger.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Main {

    @SerializedName("temp")
    @Expose
    lateinit var temp: String

    @SerializedName("feels_like")
    @Expose
    lateinit var feelsLike: String

    @SerializedName("pressure")
    @Expose
    lateinit var pressure: String

    @SerializedName("humidity")
    @Expose
    lateinit var humidity: String




}