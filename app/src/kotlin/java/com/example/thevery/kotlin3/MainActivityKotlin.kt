package com.example.thevery.kotlin3

import android.os.Bundle
import android.support.annotation.Keep
import android.support.v7.app.AppCompatActivity

@Keep
class MainActivityKotlin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val am = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager?
//        val pids: List<ActivityManager.RunningAppProcessInfo> = am?.runningAppProcesses?: emptyList()
//        var passportPid = pids.find { it.processName.equals("$packageName:passport", ignoreCase = true) }?.pid ?: 0

//        Thread({ println("Runnable1.run()") }).start()
//        Thread { println("Runnable2.run()") }.start()
//        Thread({ println("Runnable3.run()") }).start()
//        Thread({ println("Runnable4.run()") }).start()
//        val list = listOf(1, 2, 3).filter { it > 2 }
//        val tv = findViewById(R.id.tv) as TextView
//        tv.text = list.toString()
    }
}
