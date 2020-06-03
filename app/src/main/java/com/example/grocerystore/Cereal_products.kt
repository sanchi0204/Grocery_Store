package com.example.grocerystore

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Cereal_products : AppCompatActivity() {
    val myCart_cer = Cart()
    val cr_1 = Cereal_1()
    val cr_2 = Cereal_2()
    val cr_3 = Cereal_3()
    val cr_4 = Cereal_4()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cereal_products)


        val shop: Button = findViewById(R.id.shop_btn)
        shop.setOnClickListener {
            startActivity(Intent(this, ProductGrid::class.java))
        }

        val cart: Button = findViewById(R.id.cart_btn)
        cart.setOnClickListener {
            startActivity(Intent(this, OrderSummary::class.java))
        }


        val cer1: Button = findViewById(R.id.cereal_1)
        cer1.setOnClickListener {
            addCer1()
        }

        val cer2: Button = findViewById(R.id.cereal_2)
        cer2.setOnClickListener {
            addCer2()
        }

        val cer3: Button = findViewById(R.id.cereal_3)
        cer3.setOnClickListener {
            addCer3()
        }

        val cer4: Button = findViewById(R.id.cereal_4)
        cer4.setOnClickListener {
            addCer4()
        }
    }

    private fun addCer4() {
        myCart.cart_items.add(cr_4.name)
        myCart.cart_total += cr_4.price
        cr_4.amount += cr_4.amount
        Toast.makeText(this, cr_4.name + " has been added to the cart", Toast.LENGTH_SHORT).show()
    }

    private fun addCer3() {
        myCart.cart_items.add(cr_3.name)
        myCart.cart_total += cr_3.price
        cr_3.amount += cr_3.amount
        Toast.makeText(this, cr_3.name + " has been added to the cart", Toast.LENGTH_SHORT).show()
    }

    private fun addCer2() {
        myCart.cart_items.add(cr_2.name)
        myCart.cart_total += cr_2.price
        cr_2.amount += cr_2.amount
        Toast.makeText(this, cr_2.name + " has been added to the cart", Toast.LENGTH_SHORT).show()
    }

    private fun addCer1() {
        myCart.cart_items.add(cr_1.name)
        myCart.cart_total += cr_1.price
        cr_1.amount += cr_1.amount
        Toast.makeText(this, cr_1.name + " has been added to the cart", Toast.LENGTH_SHORT).show()
    }
}
