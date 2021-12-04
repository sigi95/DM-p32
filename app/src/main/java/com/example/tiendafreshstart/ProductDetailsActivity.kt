package com.example.tiendafreshstart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class ProductDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var numero:Int=1

        val btnsumar2=findViewById<Button>(R.id.btnSumarProductDetails)
        val btnrestar2=findViewById<Button>(R.id.btnRestarProductDetails)
        val resultado2=findViewById<TextView>(R.id.txtCantidadProductDetails)

        btnsumar2.setOnClickListener {
            numero = numero + 1
            resultado2.setText(String.format("%d",numero))
        }

        btnrestar2.setOnClickListener {
            if (numero >= 1) {
                numero = numero - 1
                resultado2.setText(String.format("%d",numero))
            }
        }


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_details)

        val imgIrMain=findViewById<ImageView>(R.id.imaLogoDetalleProducto)

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