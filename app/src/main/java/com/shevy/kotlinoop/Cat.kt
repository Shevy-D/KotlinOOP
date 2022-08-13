package com.shevy.kotlinoop

import android.util.Log

class Cat {
    val age: Int = 0
    val name: String = ""

    fun talk() {
        Log.d("talk()", "Hi, my name is $name, I'm $age years old")
    }

}