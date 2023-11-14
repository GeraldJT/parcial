package com.example.parcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class registrar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar)
        irOpcionesapp()
        irLoggin()
    }
    fun irOpcionesapp(){
        val bt_gps =findViewById<Button>(R.id.bt_Ingresar2)

        bt_gps.setOnClickListener(){
            val saltarO: Intent = Intent(this,opcionesApp::class.java)
            startActivity(saltarO)
        }

    }
    fun irLoggin(){
        val bt_gps =findViewById<Button>(R.id.bt_login)

        bt_gps.setOnClickListener(){
            val saltarl: Intent = Intent(this,MainActivity::class.java)
            startActivity(saltarl)
        }
    }
}