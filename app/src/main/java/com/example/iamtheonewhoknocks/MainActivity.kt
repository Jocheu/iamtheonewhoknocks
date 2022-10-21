package com.example.iamtheonewhoknocks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //aaa
        val txt = findViewById<EditText>(R.id.txtbox)
        val naTekst = findViewById<TextView>(R.id.textView)
        findViewById<Button>(R.id.btn1).setOnClickListener {
            naTekst.text = naTekst.text.toString() + txt.text.toString()
            txt.text.clear()
        }
        findViewById<Button>(R.id.btn2).setOnClickListener {
            naTekst.text = "Joachim Psuty-Lipski"
            txt.text.clear()
        }
    }
}