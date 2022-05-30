package com.example.gesconve

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)

        var btnLogin = findViewById<Button>(R.id.btnLogin)
        var textEmail = findViewById<EditText>(R.id.textEmail)
        var textPass = findViewById<EditText>(R.id.textPass)

        btnLogin.setOnClickListener{
            if(textEmail.text != null && textPass.text != null){
                val intentOpciones = Intent(this, opciones::class.java)
                startActivity(intentOpciones)
            }
        }

    }
}