package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    var counter = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Info", "onCreate")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Info", "onResume")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Info", "onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Info", "onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Info", "onDestroy")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Info", "onStop ")
    }

}

