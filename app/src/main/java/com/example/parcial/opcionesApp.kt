package com.example.parcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class opcionesApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opciones_app)
        irFotos()
    }
    fun irFotos(){
        val bt_gps =findViewById<Button>(R.id.bt_F)

        bt_gps.setOnClickListener(){
            val saltarO: Intent = Intent(this,fotos::class.java)
            startActivity(saltarO)
        }

    }
}
