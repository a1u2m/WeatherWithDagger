package com.example.weatherwithdagger.di

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class AppModule (private val context: Context) {

    @Provides
    fun getAppContext(): Context {
        return context
    }

    @Provides
    fun getMyToast(): MyToast {
        return MyToast(context)
    }

}