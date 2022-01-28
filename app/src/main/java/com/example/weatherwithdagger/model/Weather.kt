package com.example.weatherwithdagger.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Weather {

    @SerializedName("description")
    @Expose
    lateinit var description: String

    @SerializedName("icon")
    @Expose
    lateinit var icon: String
}