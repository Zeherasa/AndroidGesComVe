package com.example.gesconve

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class opciones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_opciones3)

        var btnAnuncios = findViewById<Button>(R.id.btnAnuncios)
        var btnNotificaciones = findViewById<Button>(R.id.btnNotificaciones)
        var btnIncidencias = findViewById<Button>(R.id.btnIncidencias)
        var btnListadoOperarios = findViewById<Button>(R.id.btnListadoOperarios)

        btnAnuncios.setOnClickListener{
            val intentAnuncios = Intent(this, anuncios4::class.java)
            startActivity(intentAnuncios)
        }

        btnNotificaciones.setOnClickListener{
            val intentNotificaciones = Intent(this, ver_notificaciones12::class.java)
            startActivity(intentNotificaciones)
        }

        btnIncidencias.setOnClickListener{
            val intentIncidencias = Intent(this, incidencias6::class.java)
            startActivity(intentIncidencias)
        }

        btnListadoOperarios.setOnClickListener{
            val intentOperarios = Intent(this, listadoOperarios::class.java)
            startActivity(intentOperarios)
        }
    }
}