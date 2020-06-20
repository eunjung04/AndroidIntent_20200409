package com.example.androidintent_20200409

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
    }

    fun setupEvents() {
        dialBtn.setOnClickListener {

            //어느 화면으로 갈지 직접 명시. => Uri를 이용해서 명시.
            val myUri=Uri.parse("tel:01012341234")
            val myIntent=Intent(Intent.ACTION_DIAL, myUri)
            startActivity(myIntent)
        }
    }
}
