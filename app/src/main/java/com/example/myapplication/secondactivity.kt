package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class secondactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondactivity)
        val username=intent.getStringExtra("user")
        val textview=findViewById<TextView>(R.id.offertext)
        var message=""
        if(username=="Bhargav") {
            message = "$username:Very Bad Person"
        }
        else{
            message="$username:Good Person"
        }
        textview.text=message
    }
}