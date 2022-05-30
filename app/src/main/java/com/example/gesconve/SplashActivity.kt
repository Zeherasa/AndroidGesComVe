package com.example.gesconve

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

//class SplashActivity : AppCompatActivity() {
   // override fun onCreate(savedInstanceState: Bundle?) {
       // super.onCreate(savedInstanceState)

       // setContentView(R.layout.activity_splash)
        //startActivity(Intent(this,MainActivity::class.java))
       // startActivity(Intent(this,PantallaLogin::class.java))
  //  }
//}

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        startActivity(Intent(this,LoginActivity::class.java))
        finish() // evitar regresar a éste activity
    }
}