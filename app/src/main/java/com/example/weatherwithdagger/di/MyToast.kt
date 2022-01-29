package com.example.weatherwithdagger.di

import android.content.Context
import android.widget.Toast
import com.example.weatherwithdagger.R

class MyToast (context: Context?) : Toast(context){

    override fun show() {
        duration = LENGTH_LONG
        setText(R.string.error)
        super.show()
    }
}