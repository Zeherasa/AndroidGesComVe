package com.example.gesconve

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class publicarAnuncio8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_publicar_anuncio8)

        var editTextAnuncio = findViewById<EditText>(R.id.editTextAnuncio)
        var btnInsertar = findViewById<Button>(R.id.btnInsertar)

        val radioVenta = findViewById<RadioButton>(R.id.radioVenta)
        val radioAlquiler = findViewById<RadioButton>(R.id.radioAlquiler)
        val radioAyuda = findViewById<RadioButton>(R.id.radioAyuda)
        val radioAviso = findViewById<RadioButton>(R.id.radioAviso)
        val radioOtros = findViewById<RadioButton>(R.id.radioOtros)
        val radioObras = findViewById<RadioButton>(R.id.radioObras)

        btnInsertar.setOnClickListener{
            val url = "http://192.168.1.134/android_mysql/insertarAnuncio.php"
            val queue = Volley.newRequestQueue(this)
            var resultadoPost = object : StringRequest(Request.Method.POST, url,
                Response.Listener<String> { response ->
                    Toast.makeText(this, "Datos insertados exitosamente", Toast.LENGTH_LONG).show()
                }, Response.ErrorListener { error ->
                    Toast.makeText(this, "Error $error", Toast.LENGTH_LONG).show()
                }){
                override fun getParams(): MutableMap<String, String>? {
                    var radioChecked: RadioButton
                    val parametros = HashMap<String,String>()
                    var listaTitle: MutableList<RadioButton> = mutableListOf(radioVenta, radioAlquiler, radioAyuda, radioAviso, radioOtros, radioObras)
                    listaTitle.forEach{
                        if(it.isChecked){
                            radioChecked = it
                            parametros.put("title", radioChecked.text.toString())
                        }
                    }
                    parametros.put("anuncio", editTextAnuncio.text.toString())
                    return parametros
                }
            }

            queue.add(resultadoPost)

            val intentAnuncios = Intent(this, verAnuncios9::class.java)
            startActivity(intentAnuncios)
        }
    }



}