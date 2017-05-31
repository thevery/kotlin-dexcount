package com.example.thevery.kotlin3

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class MainActivityKotlin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Thread({ println("Runnable1.run()") }).start()
        Thread({ println("Runnable2.run()") }).start()
        val list = listOf(1, 2, 3).filter { it > 2 }
        val tv = findViewById(R.id.tv) as TextView
        tv. text = list.toString()
    }
}
