package io.github.testlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.github.mytestlibrary.SumNumbers
import com.eqworks.testlibrary.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val result = SumNumbers.sumTwoNumbers(5,6)
        Log.d("MainActivity", "result : $result")
    }
}