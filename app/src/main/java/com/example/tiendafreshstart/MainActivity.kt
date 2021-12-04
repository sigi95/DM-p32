package com.example.tiendafreshstart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgIrForms=findViewById<ImageView>(R.id.imgLogoMain)

        imgIrForms.setOnClickListener {
            val intentForms = Intent(this, FormsActivity::class.java)
            startActivity(intentForms)
        }
   }
}