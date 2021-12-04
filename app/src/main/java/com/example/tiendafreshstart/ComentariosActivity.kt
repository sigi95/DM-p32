package com.example.tiendafreshstart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ComentariosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comentarios)
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

        val btnprofile=findViewById<ImageView>(R.id.btnprofile)

        btnprofile.setOnClickListener {
            val intentPerfil = Intent(this, EditProfileActivity::class.java)
            startActivity(intentPerfil)
        }
    }
}