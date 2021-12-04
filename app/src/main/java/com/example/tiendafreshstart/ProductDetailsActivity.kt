package com.example.tiendafreshstart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class ProductDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_details)

        var numero1:Int=1
        val imgIrMain=findViewById<ImageView>(R.id.imaLogoDetalleProducto)
        val btnsumar2=findViewById<Button>(R.id.btnSumarProductDetails)
        val btnrestar2=findViewById<Button>(R.id.btnRestarProductDetails)
        val resultado2=findViewById<TextView>(R.id.txtCantidadProductDetails)

        btnsumar2.setOnClickListener {
            numero1 = numero1 + 1
            resultado2.setText(String.format("%d",numero1))
        }

        btnrestar2.setOnClickListener {
            if (numero1 >= 1) {
                numero1 = numero1 - 1
                resultado2.setText(String.format("%d",numero1))
            }
        }

        imgIrMain.setOnClickListener {
            val intentHome = Intent(this, MainActivity::class.java)
            startActivity(intentHome)
        }

        val imgIrOpiniones=findViewById<Button>(R.id.btnOpinionesDetalleProducto)

        imgIrOpiniones.setOnClickListener {
            val intentOpiniones = Intent(this, ComentariosActivity::class.java)
            startActivity(intentOpiniones)
        }

        val imgIrCarrito=findViewById<Button>(R.id.btnCarritoDetalleProducto)

        imgIrCarrito.setOnClickListener {
            val intentCarrito = Intent(this, CarritoActivity::class.java)
            startActivity(intentCarrito)
        }

    }
}