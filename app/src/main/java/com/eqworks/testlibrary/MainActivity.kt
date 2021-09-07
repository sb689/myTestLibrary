package com.eqworks.testlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.eqworks.mytestlibraryapp.SumNumbers

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val result = SumNumbers.sumTwoNumbers(5,4)
        Log.d("MainActivity", "result : $result")
    }
}