package com.example.romhubronanlina.kotlintest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class KotlinTestMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_test_main)

        val mOutput = findViewById<TextView>(R.id.outputView) as TextView
        val mInput = findViewById<EditText>(R.id.inputText) as EditText
        val mExe = findViewById<Button>(R.id.executeButton) as Button

        mExe.setOnClickListener {
            mOutput.text = mInput.text
            mInput.text = null
        }

        val intent: Intent
        
    }
}
