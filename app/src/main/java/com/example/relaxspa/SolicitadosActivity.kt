package com.example.relaxspa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.relaxspa.Adaptadores.MasajeAdaptador
import com.example.relaxspa.Controlers.MasajeDAO
import kotlinx.android.synthetic.main.activity_solicitados.*

class SolicitadosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_solicitados) //es el xml creado activity_solicitados  método de clase de actividad. Muestra el diseño en pantalla.
        var crud = MasajeDAO(this) //objetivo de tipo mutable

        var mi_lista = crud.BotonListarP() // guarda el arraylist de MasajesDAO BotonListarP():ArrayList<Vista>
        setContentView(R.layout.activity_solicitados)

        var mi_adaptador = MasajeAdaptador(this, R.layout.item, mi_lista)

        lvcorte.adapter = mi_adaptador
    }
}