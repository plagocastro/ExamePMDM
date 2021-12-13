package com.dam2.examenpmdm1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class Ejercicio3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio3)

        //declaras el boton como variable para llamarlo en el onClick
        val boton: Button = findViewById(R.id.btoast)
        //le das el valor de onClick para que aparezca al clickarlo
        boton.setOnClickListener() {
            //pones el método toast con el texto que se mostrará
            Toast.makeText(applicationContext, "Genial has clicado el botón", Toast.LENGTH_SHORT).show()

        }
        val secuencia = GlobalScope.launch(Dispatchers.Main) {
            cuenta()
        }
    }

    suspend fun cuenta(){

        for (i in 1..100){
            var r = 100 - i;
            println(r)
            delay(500L)
        }
    }
}