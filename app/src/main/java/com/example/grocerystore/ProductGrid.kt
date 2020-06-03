package com.example.grocerystore

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class ProductGrid : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_grid)


        val vegetables: LinearLayout = findViewById(R.id.vegetables)
        val fruits: LinearLayout = findViewById(R.id.fruits)
        val cereals: LinearLayout = findViewById(R.id.cereals)

        vegetables.setOnClickListener {
            startActivity(Intent(this, Vegetable_products::class.java))
        }

        fruits.setOnClickListener {
            startActivity(Intent(this, Fruit_Products::class.java))
        }

        cereals.setOnClickListener {
            startActivity(Intent(this, Cereal_products::class.java))
        }

    }
}
