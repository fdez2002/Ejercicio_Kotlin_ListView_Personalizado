package com.example.ejerciciokotlinlistviewpersonalizado

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter

class PersonaAdapter(private val mContext: Context, private val listaPersona:List<Persona>) : ArrayAdapter<Persona>(mContext,0,listaPersona) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layout = LayoutInflater.from(mContext).inflate(R.layout.list_row, parent, false)

        val persona = listaPersona[position]
        layout.

        return layout
    }
}