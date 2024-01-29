package com.example.toast_saeful

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "aplikasi berjalan", Toast.LENGTH_SHORT).show()

        val tombol = findViewById<Button>(R.id.nama)
        val kelas = findViewById<Button>(R.id.kelas)
        val nis = findViewById<Button>(R.id.nis)

        tombol.setOnClickListener {
            Toast.makeText(this, "M Saefulloh arahman", Toast.LENGTH_SHORT).show()
        }
        kelas.setOnClickListener {
            Toast.makeText(this, "XI PPLG 1", Toast.LENGTH_SHORT).show()
        }
        nis.setOnClickListener {
            Toast.makeText(this, "2233266", Toast.LENGTH_SHORT).show()
        }
    }
}