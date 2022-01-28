package com.example.weatherwithdagger.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Wind {

    @SerializedName("speed")
    @Expose
    lateinit var speed: String

}