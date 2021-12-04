package com.example.tiendafreshstart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        val btnIrForms2=findViewById<ImageView>(R.id.imgLogoRegister)

        btnIrForms2.setOnClickListener {
            val intentForms2 = Intent(this, FormsActivity::class.java)
            startActivity(intentForms2)
        }

        val btnIrLogin2=findViewById<Button>(R.id.btnRegistroRegister)

        btnIrLogin2.setOnClickListener {
            val intentLogin2 = Intent(this, LoginActivity::class.java)
            startActivity(intentLogin2)
        }
    }
}