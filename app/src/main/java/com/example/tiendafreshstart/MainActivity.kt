package com.example.tiendafreshstart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Thread.sleep(5000)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}