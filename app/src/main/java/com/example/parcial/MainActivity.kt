package com.example.parcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_Parcial)
        setContentView(R.layout.activity_main)
        irRegistrar()
        irOpcionesapp()
    }
    fun irRegistrar(){
        val bt_gps =findViewById<Button>(R.id.br_registro)

        bt_gps.setOnClickListener(){
            val saltar: Intent = Intent(this,registrar::class.java)
            startActivity(saltar)
        }
    }
    fun irOpcionesapp(){
        val bt_gps =findViewById<Button>(R.id.bt_Ingresar2)

        bt_gps.setOnClickListener(){
            val saltarO: Intent = Intent(this,opcionesApp::class.java)
            startActivity(saltarO)
        }
    }
}