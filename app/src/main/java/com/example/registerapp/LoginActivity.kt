package com.example.registerapp

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val btn: TextView = findViewById(R.id.textViewSignUp)

    
        btn.setOnClickListener {
          
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}
