package com.example.grocerystore

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Vegetable_products : AppCompatActivity() {
    val myCart_veg = Cart()
    val vg_1 = Vegetable_1()
    val vg_2 = Vegetable_2()
    val vg_3 = Vegetable_3()
    val vg_4 = Vegetable_4()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vegetable_products)


        val shop: Button = findViewById(R.id.shop_btn)
        shop.setOnClickListener {
            startActivity(Intent(this, ProductGrid::class.java))
        }

        val cart: Button = findViewById(R.id.cart_btn)
        cart.setOnClickListener {
            startActivity(Intent(this, OrderSummary::class.java))
        }

        val veg1: Button = findViewById(R.id.veg_1)
        veg1.setOnClickListener {
            addVeg1()
        }

        val veg2: Button = findViewById(R.id.veg_2)
        veg2.setOnClickListener {
            addVeg2()
        }

        val veg3: Button = findViewById(R.id.veg_3)
        veg3.setOnClickListener {
            addVeg3()
        }

        val veg4: Button = findViewById(R.id.veg_4)
        veg4.setOnClickListener {
            addVeg4()
        }
    }

    private fun addVeg4() {
        myCart.cart_items.add(vg_4.name)
        myCart.cart_total += vg_4.price
        vg_4.amount += vg_4.amount
        Toast.makeText(this, vg_4.name + " has been added to the cart", Toast.LENGTH_SHORT).show()
    }

    private fun addVeg3() {
        myCart.cart_items.add(vg_3.name)
        myCart.cart_total += vg_3.price
        vg_3.amount += vg_3.amount
        Toast.makeText(this, vg_3.name + " has been added to the cart", Toast.LENGTH_SHORT).show()
    }

    private fun addVeg2() {
        myCart.cart_items.add(vg_2.name)
        myCart.cart_total += vg_2.price
        vg_2.amount += vg_2.amount
        Toast.makeText(this, vg_2.name + " has been added to the cart", Toast.LENGTH_SHORT).show()
    }

    private fun addVeg1() {
        myCart.cart_items.add(vg_1.name)
        myCart.cart_total += vg_1.price
        vg_1.amount += vg_1.amount
        Toast.makeText(this, vg_1.name + " has been added to the cart", Toast.LENGTH_SHORT).show()
    }
}
