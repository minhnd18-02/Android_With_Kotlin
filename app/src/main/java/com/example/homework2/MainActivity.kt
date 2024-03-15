package com.example.homework2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    private var counter: Int = 10
    private lateinit var counterTextView: TextView
    private lateinit var rootView: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        counterTextView = findViewById(R.id.counterTextView)
        rootView = findViewById(android.R.id.background)

        updateCounterText()
    }

    fun onClick(view: View) {
        if (counter > 0) {
            counter--
            updateCounterText()
        }
        if (counter == 0) {
            rootView.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
        }
    }

    fun onResetClick(view: View) {
        counter = 10
        updateCounterText()
        rootView.setBackgroundColor(ContextCompat.getColor(this, R.color.appBackground))
    }

    private fun updateCounterText() {
        counterTextView.text = counter.toString()
    }
}
