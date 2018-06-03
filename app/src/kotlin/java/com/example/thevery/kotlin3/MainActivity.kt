package com.example.thevery.kotlin3

import android.os.Bundle
import android.support.annotation.Keep
import android.support.v7.app.AppCompatActivity

@Keep
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
