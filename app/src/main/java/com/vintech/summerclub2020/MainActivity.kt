package com.vintech.summerclub2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        submitButton.setOnClickListener {
            onSubmitButtonClicked()
        }
    }

    private fun onSubmitButtonClicked() {
        val name = inputName.text.toString()
        setName(name)
    }

    private fun setName(name: String) {
        nameLabel.text = "Hi $name, welcome to the club!"
    }
}
