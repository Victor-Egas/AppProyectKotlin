package com.example.relaxspa.Adaptadores

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.relaxspa.Model.Vista
import kotlinx.android.synthetic.main.item.view.*

class MasajeAdaptador(context: Context, resource:Int, objects:ArrayList<Vista>)
    : ArrayAdapter<Vista>(context, resource, objects)
{
    //    Definir variables globales para el Item.xml o el Solicitados Activity
    var mi_contexto:Context=context
    var mi_recurso:Int=resource
    var mi_lista = objects

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var inflador: LayoutInflater = LayoutInflater.from(mi_contexto)
        var mi_vista: View = inflador.inflate(mi_recurso, null)

        var objrest = mi_lista.get(position)

        mi_vista.txtNomApeUsuario.text = objrest.nombres_usuario + " " + objrest.apellidos_usuario
        mi_vista.txtDni.text = "Dni: " + objrest.dni_usuario
        mi_vista.TxtDireccion.text = "Dirección: " + objrest.direccion_usuariou
        mi_vista.txtCelular.text = "Celular: " + objrest.celular_usuario

        return mi_vista
    }
}