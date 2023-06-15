package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val greetings=findViewById<TextView>(R.id.tvhello)
        val input=findViewById<EditText>(R.id.tvName)
        val submitbutton=findViewById<Button>(R.id.button)
        val secbut=findViewById<Button>(R.id.button2)
        var enteredname=""
        submitbutton.setOnClickListener {
            enteredname = input.text.toString()
            if (enteredname == "") {
                Toast.makeText(this@MainActivity,"Please Enter Your Name",Toast.LENGTH_SHORT).show()
                greetings.text = "Welcome"
                secbut.visibility=INVISIBLE
            }
            else {
                val message = "Welcome $enteredname!"
                greetings.text = message
                input.text.clear()
                secbut.visibility= VISIBLE
            }
        }
        secbut.setOnClickListener{
            val intent= Intent(this,secondactivity::class.java)
            intent.putExtra("user",enteredname)
            startActivity(intent)
        }
    }
}