package com.example.gesconve

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONArray
import org.json.JSONException

class verAnuncios9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ver_anuncios9)

        val consulta = "http://192.168.1.134/android_mysql/consultaAnuncio.php"
        EnviarRecibirDatos(consulta)

    }

    fun EnviarRecibirDatos(URL: String){
        Toast.makeText(applicationContext, "" + URL, Toast.LENGTH_SHORT).show()
        val queue = Volley.newRequestQueue(this)
        val stringRequest = StringRequest(Request.Method.GET, URL,
            { response ->
                var response = response
                response = response.replace("][", ",")
                if(response.length > 0){
                    try{
                        val ja = JSONArray(response)
                        Log.i("sizejson", "" + ja.length())
                        CargarListView(ja)
                    }catch (e: JSONException){
                        e.printStackTrace()
                    }
                }
            }, {  })
        queue.add(stringRequest)
    }

    fun CargarListView(ja: JSONArray){
        var listaAnuncio = findViewById<ListView>(R.id.listaAnuncios)
        val lista: ArrayList<String> = ArrayList()
        var i = 0
        while(i < ja.length()){
            try{
                lista.add(
                    ja.getString(i).toString() + ja.getString(i + 1) + " " + ja.getString(i + 2) + " " + ja.getString(i + 3)

                )
            }catch (e: JSONException){
                e.printStackTrace()
            }
            i += 4
        }
        val adaptador: ArrayAdapter<String> =
            ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista)
        listaAnuncio.adapter = adaptador
    }
}