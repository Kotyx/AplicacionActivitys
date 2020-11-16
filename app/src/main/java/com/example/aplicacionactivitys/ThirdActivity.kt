package com.example.aplicacionactivitys

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val num=0
        val palabra=intent.getIntExtra(MainActivity.VAR1,num)
        val tv1 = findViewById<TextView>(R.id.tv1)
        palabra?.let {

            tv1.text=palabra.toString()
        }

        val palabra2=intent.getStringExtra(MainActivity.VAR1)
        palabra2?.let{
            tv1.text=palabra2.toString().toUpperCase()
        }


    }
}