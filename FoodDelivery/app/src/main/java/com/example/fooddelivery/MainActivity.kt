package com.example.fooddelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edt:EditText=findViewById(R.id.username)
        val edt_password:EditText=findViewById(R.id.password)
        val login:Button=findViewById(R.id.login_btn)

        login.setOnClickListener(){
            var username=edt.text
            val i:Intent= Intent(this,MainActivity2::class.java)
            i.putExtra("name",username)
            startActivity(i)
        }
    }
}