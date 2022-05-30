package com.example.gesconve

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class operarioListadoIncidencias13 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_operario_listado_incidencias13)

        var btn_verInci = findViewById<Button>(R.id.btn_verInci)


        btn_verInci.setOnClickListener {
            val intentverInci = Intent(this, operarioListadoIncidencias13::class.java)
            startActivity(intentverInci)
        }
    }
}