package com.example.parcial

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts

class fotos : AppCompatActivity() {
    lateinit var imagen:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fotos)
        tomarFoto()
        irInicio()

    }
    fun irInicio() {
        val bt_regreso = findViewById<Button>(R.id.RegresoC)
        bt_regreso.setOnClickListener(){
            val regresar: Intent = Intent(this, MainActivity::class.java)
            startActivity(regresar)
        }
    }
    fun tomarFoto(){
        imagen = findViewById(R.id.img_Tomada)
        val capturar =findViewById<Button>(R.id.Fotos)
        capturar.setOnClickListener(){
            startForResult.launch(Intent(MediaStore.ACTION_IMAGE_CAPTURE))

        }

    }
    private val startForResult =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result: ActivityResult ->
            if (result.resultCode == Activity.RESULT_OK) {
                val intent = result.data
                val imageBitmap = intent?.extras?.get("data") as Bitmap
                val imageView = findViewById<ImageView>(R.id.img_Tomada)
                imageView.setImageBitmap(imageBitmap)
                MediaStore.Images.Media.insertImage(
                    contentResolver,
                    imageBitmap,
                    "Foto",
                    "descripción_de_tu_imagen"
                )

            }
        }
}