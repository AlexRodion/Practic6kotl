package com.example.millionaire

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvQuestion = findViewById<TextView>(R.id.tvQuestion)
        tvQuestion.text = "Тут будет первый вопрос"
    }
}