package com.example.helloworld

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //extending behavior
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.helloButton)
        button.setOnClickListener {
            Log.v("hello world", "button clicked")
            val strArray = arrayOf<String>(
                "Hey there!",
                "nice to see you",
                "oh it's you again" ,
                "didn't expect to see you here again",
                "wow you look good!")

            Toast.makeText(this, strArray[Random.nextInt(0, strArray.size)], Toast.LENGTH_SHORT).show()
        }
    }
}