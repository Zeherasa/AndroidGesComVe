package com.example.gesconve

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class incidencias6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_incidencias6)


        var btn_publicInci = findViewById<Button>(R.id.btn_publicInci)
        var btn_verInci = findViewById<Button>(R.id.btn_verInci)

        btn_publicInci.setOnClickListener {
            val intentpubliinci = Intent(this, publicar_incidencia10::class.java)
            startActivity(intentpubliinci)
        }

        btn_verInci.setOnClickListener {
            val intentverInci = Intent(this, ver_incidencias11::class.java)
            startActivity(intentverInci)
        }
    }
}