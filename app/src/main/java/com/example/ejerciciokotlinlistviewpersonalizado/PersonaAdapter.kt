package com.example.ejerciciokotlinlistviewpersonalizado

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ejerciciokotlinlistviewpersonalizado.databinding.ViewPersonaItemBinding

class PersonaAdapter(private val personas : List<Persona>, private val personaClickedListener: (Persona) -> Unit) : RecyclerView.Adapter<PersonaAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //Creamos la vista
        val binding = ViewPersonaItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        //retornamos la vista
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val persona = personas[position]
        holder.bind(persona)
        holder.itemView.setOnClickListener { personaClickedListener(persona) }

    }

    //override fun getItemCount(): Int {
    //retorna el numero de personas
    //  return persona.size
    //}
    //retorna el numero de personas
    override fun getItemCount(): Int = personas.size//expresion boddy, hace lo mismo que el comentario de arriba

    class ViewHolder(private val binding: ViewPersonaItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(persona: Persona) {
            binding.imageView.setImageResource(persona.imagen)
            binding.textViewNombre.text = persona.nombre
            binding.textViewApellidos.text = persona.apellido
            binding.textViewCurso.text = persona.ciclo


        }


    }
}