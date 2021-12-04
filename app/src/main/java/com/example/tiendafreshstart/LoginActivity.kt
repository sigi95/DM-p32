package com.example.tiendafreshstart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnIrForms=findViewById<Button>(R.id.btnRegistroLogin)

        btnIrForms.setOnClickListener {
            val intentForms = Intent(this, FormsActivity::class.java)
            startActivity(intentForms)
        }

        val btnIrRegistro2=findViewById<Button>(R.id.btnRegistroLogin)

        btnIrRegistro2.setOnClickListener {
            val intentRegistro2 = Intent(this, RegisterActivity::class.java)
            startActivity(intentRegistro2)
        }

        val btnIrProductos=findViewById<Button>(R.id.btnSesionLogin)

        btnIrProductos.setOnClickListener {
            val intentProductos = Intent(this, ProductsActivity::class.java)
            startActivity(intentProductos)
        }
    }
}