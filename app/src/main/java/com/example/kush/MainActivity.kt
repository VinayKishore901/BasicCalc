package com.example.kush

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        add.setOnClickListener(View.OnClickListener {
            val x = text1.text.toString().toInt()
            val y = text2.text.toString().toInt()
            var result = x + y
            tv.text = result.toString()

        })


    }
}