package com.dicoding.kenalikan

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity


class SplashScreen : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_splash_screen)
            @Suppress("DEPRECATION")
            Handler().postDelayed(Runnable {
                val intent = Intent(
                    this@SplashScreen,
                    MainActivity::class.java
                )
                startActivity(intent)
                finish()
            }, 2000)
    }
}