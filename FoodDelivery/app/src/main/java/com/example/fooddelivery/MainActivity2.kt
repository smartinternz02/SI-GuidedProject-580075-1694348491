package com.example.fooddelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
         var order1:Button=findViewById(R.id.order1)
         var order2:Button=findViewById(R.id.order2)
         var order3:Button=findViewById(R.id.order3)

        var user_name=receiveUserName()
        Toast.makeText(this," "+user_name, Toast.LENGTH_LONG).show()

        order1.setOnClickListener(){
            val i= Intent(this,MainActivity3::class.java)
            startActivity(i)
        }
        order2.setOnClickListener(){
            val i= Intent(this,MainActivity3::class.java)
            startActivity(i)

        }
        order3.setOnClickListener(){
            val i= Intent(this,MainActivity3::class.java)
            startActivity(i)

        }



    }
    fun receiveUserName():String{
        var bundle:Bundle?=intent.extras
        var username=bundle?.get("name").toString()
        return username
    }
}