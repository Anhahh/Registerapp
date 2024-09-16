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

        // Tìm TextView bằng ID từ layout
        val btn: TextView = findViewById(R.id.alreadyHaveAccount)

        // Thiết lập listener cho sự kiện click
        btn.setOnClickListener {
            // Khởi tạo Intent để chuyển đến LoginActivity
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
