package com.example.a5mar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val formato = SimpleDateFormat("dd:mm:yyyy")
        val d = formato.format(Calendar.getInstance().time)

        val fecha = findViewById<TextView>(R.id.textView). apply { this TextView
            text = d.toString()

        }
    }

    fun ENTRAR(view: View){
        val intent = Intent(this@MainActivity, principal::class.java)
        startActivity(intent)
    }
}