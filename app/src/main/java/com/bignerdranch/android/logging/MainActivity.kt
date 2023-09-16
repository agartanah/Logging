package com.bignerdranch.android.logging

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    private val TAG = "From EditText"
    private lateinit var buttonLog: Button
    private lateinit var buttonTimber: Button
    private lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonLog = findViewById(R.id.buttonLog)
        buttonTimber = findViewById(R.id.buttonTimber)
        editText = findViewById(R.id.editTextText)

        buttonLog.setOnClickListener() { view: View ->
            Log.v(TAG, editText.text.toString())
        }

        Timber.plant(Timber.DebugTree())

        buttonTimber.setOnClickListener() { view: View ->
            Timber.v(editText.text.toString())
        }
    }
}


