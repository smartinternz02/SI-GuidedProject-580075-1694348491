package com.example.assingnment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {

    lateinit var img: ImageView
    lateinit var result:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        result= findViewById(R.id.textView)
        img = findViewById(R.id.img)
        var btn: Button = findViewById(R.id.btn)



        btn.setOnClickListener() {
            result.setText(""+rollDie(img))
        }
    }

    fun rollDie(view: View):Int {
        val random = Random()
        val randomNumber = random.nextInt(6) + 1
        val drawableResource = when (randomNumber) {
            1 -> R.drawable.die1
            2 -> R.drawable.die2
            3 -> R.drawable.die3
            4 -> R.drawable.die4
            5 -> R.drawable.die5
            else -> R.drawable.die6
        }
        img.setImageResource(drawableResource)
        return randomNumber

    }
}







