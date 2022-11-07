package com.kakaovx.practice.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HennaActivity : AppCompatActivity() {
    private val btn = findViewById<Button>(R.id.btn_hello)
    private val txt = findViewById<TextView>(R.id.tv_hello)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_henna)
        setClickEvent()
    }

    private fun setClickEvent() {
        btn.setOnClickListener {
            txt.text = getString(R.string.hello)
        }
    }



    
}