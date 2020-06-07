package com.example.grocerystore

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Fruit_Products : AppCompatActivity() {
    internal val myCart_fru = Cart()
    val fr_1 = Fruit_1()
    val fr_2 = Fruit_2()
    val fr_3 = Fruit_3()
    val fr_4 = Fruit_4()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruit__products)

        val shop: Button = findViewById(R.id.shop_btn)
        shop.setOnClickListener {
            startActivity(Intent(this, ProductGrid::class.java))
        }

        val cart: Button = findViewById(R.id.cart_btn)
        cart.setOnClickListener {
            startActivity(Intent(this, OrderSummary::class.java))
        }

        val fruit1: Button = findViewById(R.id.fruits_1)
        fruit1.setOnClickListener {
            addFruit1()
        }

        val fruit2: Button = findViewById(R.id.fruits_2)
        fruit2.setOnClickListener {
            addFruit2()
        }

        val fruit3: Button = findViewById(R.id.fruits_3)
        fruit3.setOnClickListener {
            addFruit3()
        }

        val fruit4: Button = findViewById(R.id.fruits_4)
        fruit4.setOnClickListener {
            addFruit4()
        }
    }

    private fun addFruit4() {
        myCart.cart_items.add(fr_4.name)
        myCart.cart_total += fr_4.price
        fr_4.amount += fr_4.amount
        Toast.makeText(this,  " ${fr_4.name} has been added to the cart", Toast.LENGTH_SHORT).show()
    }

    private fun addFruit3() {
        myCart.cart_items.add(fr_3.name)
        myCart.cart_total += fr_3.price
        fr_3.amount += fr_3.amount
        Toast.makeText(this,  "${fr_3.name} has been added to the cart", Toast.LENGTH_SHORT).show()
    }

    private fun addFruit2() {
        myCart.cart_items.add(fr_2.name)
        myCart.cart_total += fr_2.price
        fr_2.amount += fr_2.amount
        Toast.makeText(this, " ${fr_2.name}has been added to the cart", Toast.LENGTH_SHORT).show()
    }

    private fun addFruit1() {
        myCart.cart_items.add(fr_1.name)
        myCart.cart_total += fr_1.price
        fr_1.amount += fr_1.amount
        Toast.makeText(this, " ${fr_1.name}has been added to the cart", Toast.LENGTH_SHORT).show()
    }
}
