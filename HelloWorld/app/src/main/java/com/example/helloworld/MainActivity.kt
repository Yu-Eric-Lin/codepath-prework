package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView


// This kotlin file is where we're going to be handling user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // show the layout file: activity_main
        setContentView(R.layout.activity_main)

        // Display customized to show 'Hello from {name}' in activity_main.xml file
        // User can tap a button to change the text color of the label:
        // 1. add a button to our layout

        // get a reference to button
        findViewById<Button>(R.id.button).setOnClickListener {
            // Handle button tap
            // change the color of the text
            Log.i("Eric", "Tapped on button")
            // 1. get a reference to the text view
            // 2. set the color of the ext view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.orange))
        }
        // 2. set up logic to know when user has tapped on button.

    }
}