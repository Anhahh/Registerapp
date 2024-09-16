package com.example.registerapp

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)

     
        val btn: TextView = findViewById(R.id.alreadyHaveAccount)

        
        btn.setOnClickListener {
            
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
