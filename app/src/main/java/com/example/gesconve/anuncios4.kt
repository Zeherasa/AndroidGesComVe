package com.example.gesconve

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class anuncios4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_anuncios4)

        var btn_publiAnun = findViewById<Button>(R.id.btn_publiAnun)
        var btn_verAnun = findViewById<Button>(R.id.btn_verAnun)

        btn_publiAnun.setOnClickListener {
            val intentpubliAnun = Intent(this, publicarAnuncio8::class.java)
            startActivity(intentpubliAnun)
        }

        btn_verAnun.setOnClickListener {
            val intentverAnun = Intent(this, verAnuncios9::class.java)
            startActivity(intentverAnun)
        }
    }
}