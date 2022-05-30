package com.example.gesconve

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class publicar_incidencia10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_publicar_incidencia10)

        var editTextIncidencia = findViewById<EditText>(R.id.editTextIncidencia)
        var btnIncidencia = findViewById<Button>(R.id.btnIncidencia)

        var radioFontaneria = findViewById<RadioButton>(R.id.radioFontaneria)
        var radioElectricidad = findViewById<RadioButton>(R.id.radioElectricidad)
        var radioLimpieza = findViewById<RadioButton>(R.id.radioLimpieza)
        var radioPintura = findViewById<RadioButton>(R.id.radioPintura)
        var radioAscensores = findViewById<RadioButton>(R.id.radioAscensores)
        var radioCristal = findViewById<RadioButton>(R.id.radioCristal)
        var radioAlbañil = findViewById<RadioButton>(R.id.radioAlbañil)
        var radioConserje = findViewById<RadioButton>(R.id.radioConserje)

        btnIncidencia.setOnClickListener{
            val url = "http://192.168.1.135/android_mysql/insertarIncidencia.php"
            val queue = Volley.newRequestQueue(this)

            var resultadoPost = object : StringRequest(Request.Method.POST, url,
                Response.Listener<String> { response ->
                    Toast.makeText(this, "Datos insertados exitosamente", Toast.LENGTH_LONG).show()
                }, Response.ErrorListener { error ->
                    Toast.makeText(this, "Error $error", Toast.LENGTH_LONG).show()
                }){
                override fun getParams(): MutableMap<String, String>? {
                    var radioChecked: RadioButton
                    val parametros = HashMap<String, String>()
                    var listaTipe: MutableList<RadioButton> = mutableListOf(radioFontaneria, radioElectricidad, radioLimpieza, radioPintura,
                        radioAscensores, radioCristal, radioAlbañil, radioConserje)
                    listaTipe.forEach{
                        if(it.isChecked){
                            radioChecked = it
                            parametros.put("tipe", radioChecked.text.toString())
                        }
                    }
                    parametros.put("description", editTextIncidencia.text.toString())
                    return parametros
                }
            }

            queue.add(resultadoPost)

            val intentIncidencias = Intent(this, ver_incidencias11::class.java)
            startActivity(intentIncidencias)
        }
    }
}