package com.example.tiendafreshstart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class EditProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        val btnhome=findViewById<ImageView>(R.id.imgLogoEditProfile)

        btnhome.setOnClickListener {
            val intentHome = Intent(this, MainActivity::class.java)
            startActivity(intentHome)
        }

        val btncasa=findViewById<ImageView>(R.id.btncasa)

        btncasa.setOnClickListener {
            val intentCasa = Intent(this, MainActivity::class.java)
            startActivity(intentCasa)
        }

        val btncarrito=findViewById<ImageView>(R.id.btncarrito)

        btncarrito.setOnClickListener {
            val intentCarrito = Intent(this, CarritoActivity::class.java)
            startActivity(intentCarrito)
        }

        val btnactualizar=findViewById<Button>(R.id.btnsaveeditprofile)

        btnactualizar.setOnClickListener {
            val intentActualizar = Intent(this, MainActivity::class.java)
            startActivity(intentActualizar)
        }



    }
}