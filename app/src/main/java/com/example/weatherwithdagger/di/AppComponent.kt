package com.example.weatherwithdagger.di

import dagger.Component
import dagger.Lazy

@Component (modules = [AppModule::class])
interface AppComponent {

    fun getMyToast(): Lazy<MyToast>

}