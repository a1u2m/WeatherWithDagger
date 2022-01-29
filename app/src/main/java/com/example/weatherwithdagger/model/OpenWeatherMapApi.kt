package com.example.weatherwithdagger.model

import com.example.weatherwithdagger.model.Response
import io.reactivex.rxjava3.core.Flowable
import retrofit2.http.GET
import retrofit2.http.Query

interface OpenWeatherMapApi {

    @GET("/data/2.5/weather?")
    fun getResponse(@Query("id") key: String,
                    @Query("appid") appid: String,
                    @Query("lang") lang: String,
                    @Query("units") units: String): Flowable<Response>

}