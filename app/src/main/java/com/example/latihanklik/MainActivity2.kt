package com.example.latihanklik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity2 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val masuk: Button = findViewById(R.id.button)
        masuk.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button -> {
                val moveIntent = Intent(this@MainActivity2, MainActivity3::class.java)
                startActivity(moveIntent)
            }
        }
    }
}