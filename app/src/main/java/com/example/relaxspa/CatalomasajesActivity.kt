package com.example.relaxspa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class CatalomasajesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalomasajes)
    }

    //Boton ATRÁS
    fun BotonAtras (s: View)
    {
        var q = Intent(this, ServicatalogoActivity::class.java)
        startActivity(q)
    }
}