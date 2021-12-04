package com.example.tiendafreshstart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ProductsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val imgIrDetalleProducto1=findViewById<ImageView>(R.id.imageDetalle1)

        imgIrDetalleProducto1.setOnClickListener {
            val intentDetalleProducto1 = Intent(this, ProductDetailsActivity::class.java)
            startActivity(intentDetalleProducto1)
        }

        val imgIrDetalleProducto2=findViewById<ImageView>(R.id.imageDetalle2)

        imgIrDetalleProducto2.setOnClickListener {
            val intentDetalleProducto2 = Intent(this, ProductDetailsActivity::class.java)
            startActivity(intentDetalleProducto2)
        }

        val imgIrDetalleProducto3=findViewById<ImageView>(R.id.imageDetalle3)

        imgIrDetalleProducto3.setOnClickListener {
            val intentDetalleProducto3 = Intent(this, ProductDetailsActivity::class.java)
            startActivity(intentDetalleProducto3)
        }

    }
}