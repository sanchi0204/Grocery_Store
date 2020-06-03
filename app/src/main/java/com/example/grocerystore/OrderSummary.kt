package com.example.grocerystore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class OrderSummary : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_summary)


        val cart_list : TextView = findViewById(R.id.cart_items)
        cart_list.text = myCart.cart_items.toString()

        val cart_total: TextView = findViewById(R.id.cart_total)
        cart_total.text = "PAY RS "+ myCart.cart_total.toString()



        val pay: Button = findViewById(R.id.cart_total)
        pay.setOnClickListener {
     Toast.makeText(this, "You need to pay Rs. ${myCart.cart_total} to get the products delivered.", Toast.LENGTH_LONG).show()
        }

    }
}
