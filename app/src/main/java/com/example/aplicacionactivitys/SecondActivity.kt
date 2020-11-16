package com.example.aplicacionactivitys

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.aplicacionactivitys.MainActivity.Companion.VAR1

class SecondActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val image = findViewById<ImageView>(R.id.iv1)
        val cambio=0
        val imagen=intent.getIntExtra(VAR1,cambio)
        imagen?.let{
            if(imagen==1){
                image.setImageResource(R.drawable.ora )
            }else{
                image.setImageResource(R.drawable.dio )
            }
        }




    }
}