package com.example.testgithubtest3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testgithubtest3.ShuRongTest.ShuRongTest
import com.example.testgithubtest3.HYTest.HYTest
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewSelc2.setOnClickListener {
            intent = Intent(this, ShuRongTest::class.java)
            startActivity(intent)
        }

        textViewSelc1.setOnClickListener {
            intent = Intent(this, HYTest::class.java)
            startActivity(intent)
        }

        // My name is Hiah Shu Rong
        // This is Shu Rong Again Lol
      
        // This is from Hock Yu
    }
}
