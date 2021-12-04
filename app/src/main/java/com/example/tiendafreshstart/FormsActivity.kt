package com.example.tiendafreshstart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class FormsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forms)

        val imgIrHome=findViewById<ImageView>(R.id.imgLogoForms)
        imgIrHome.setOnClickListener{
            val intentHome = Intent(this, MainActivity::class.java)
            startActivity(intentHome)
        }

        val btnIrRegister=findViewById<Button>(R.id.btnRegistrarForms)

        btnIrRegister.setOnClickListener {
            val intentRegister = Intent(this, RegisterActivity::class.java)
            startActivity(intentRegister)
        }


        val btnIrLogin=findViewById<Button>(R.id.btnSesionForms)

        btnIrLogin.setOnClickListener {
            val intentLogin = Intent(this, LoginActivity::class.java)
            startActivity(intentLogin)
        }
        
        
    }
}