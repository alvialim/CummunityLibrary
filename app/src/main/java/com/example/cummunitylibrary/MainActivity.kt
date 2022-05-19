package com.example.cummunitylibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.community.advancecontrollers.Toaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toaster.simpleToast(this,"This is msg")
    }
}