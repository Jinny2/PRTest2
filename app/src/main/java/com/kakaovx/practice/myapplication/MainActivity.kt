package com.kakaovx.practice.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.tv_tobi).apply {
            startActivity(Intent(context, TobiActivity::class.java))
        }

        findViewById<TextView>(R.id.tv_zohnny).apply {
            startActivity(Intent(context, ZohnnyActivity::class.java))
        }

        findViewById<TextView>(R.id.tv_jinny).apply {
            startActivity(Intent(context, JinnyActivity::class.java))
        }

        findViewById<TextView>(R.id.tv_henna).apply {
            startActivity(Intent(context, HennaActivity::class.java))
        }
    }
}