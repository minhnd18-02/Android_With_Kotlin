package com.example.homework2

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity: AppCompatActivity() {

    private lateinit var message: TextView
    private lateinit var clickHere: Button

    private var isTextChanged = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        message = findViewById(R.id.startText)
        clickHere = findViewById(R.id.btnChangeText)

        clickHere.setOnClickListener {
            if (isTextChanged) {
                message.text = getString(R.string.welcome_text)
            } else {
                message.text = getString(R.string.text_changed_message)
            }
            isTextChanged = !isTextChanged
        }

    }
}
