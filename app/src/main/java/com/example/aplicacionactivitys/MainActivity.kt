package com.example.aplicacionactivitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    companion object{
        const val VAR1="VARIABLE1"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton1 = findViewById<Button>(R.id.button1)
        val et1 = findViewById<EditText>(R.id.et1)

        boton1.setOnClickListener {
            val intent= Intent(this,SecondActivity::class.java)
            intent.putExtra(VAR1,0)
            startActivity(intent)
        }

        val boton2 = findViewById<Button>(R.id.button2)
        boton2.setOnClickListener {
            val intent2=Intent(this,ThirdActivity::class.java)
            intent2.putExtra(VAR1,et1.text.toString().length)

            startActivity(intent2)
        }

        val boton3 = findViewById<Button>(R.id.button3)
        boton3.setOnClickListener {
            val random = Random.nextInt(0,10)
            if(random<=5){
                val intent3=Intent(this,SecondActivity::class.java)
                intent3.putExtra(VAR1,1)
                startActivity(intent3)
            }else{
                val intent4=Intent(this,ThirdActivity::class.java)
                intent4.putExtra(VAR1,et1.text.toString())
                startActivity(intent4)
            }
        }

    }
}