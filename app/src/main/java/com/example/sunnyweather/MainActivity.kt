package com.example.sunnyweather

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (SunnyWeatherApplication.TOKEN.isEmpty()) {
            Toast.makeText(this, "请在SunnyWeatherApplication中填入你申请到的令牌值", Toast.LENGTH_LONG).show()
            finish()
        }
    }
}