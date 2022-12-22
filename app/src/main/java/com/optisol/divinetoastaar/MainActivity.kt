package com.optisol.divinetoastaar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.optisol.divinetoast.OptiToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        OptiToast.welcomeMsg(applicationContext,"Finally Done")

    }
}