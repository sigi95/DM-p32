package com.example.tiendafreshstart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class CarritoActivity : AppCompatActivity() {

    var numero:Int=1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carrito)

        val btnsumar=findViewById<Button>(R.id.btnSumarCarrito)
        val btnrestar=findViewById<Button>(R.id.btnRestarCarrito)
        val resultado=findViewById<TextView>(R.id.txtCantidadCarrito)

        btnsumar.setOnClickListener {
            numero = numero + 1
            resultado.setText(String.format("%d",numero))
        }

        btnrestar.setOnClickListener {
            if (numero >= 1) {
                numero = numero - 1
                resultado.setText(String.format("%d",numero))
            }
        }

    }
}