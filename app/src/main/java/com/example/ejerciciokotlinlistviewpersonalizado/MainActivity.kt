package com.example.ejerciciokotlinlistviewpersonalizado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListAdapter
import android.widget.Toast
import com.example.ejerciciokotlinlistviewpersonalizado.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recycler.adapter = PersonaAdapter(
            listOf(
                Persona(R.drawable.hombre,"Francisco", "Ruiz", "2Dam"),
                Persona( R.drawable.mujer,"Sofia", "Ruiz", "1Dam"),
                Persona( R.drawable.mujer,"Carmen", "Ruiz", "2Asir"),
                Persona( R.drawable.hombre,"Antonio", "Ruiz", "1Daw"),
                Persona( R.drawable.hombre,"Carlos", "Ruiz", "2Dam"),
                Persona( R.drawable.mujer,"Sara", "Ruiz", "2Dam"),
                Persona( R.drawable.hombre,"Manuel", "Ruiz", "2Dam"),
                Persona( R.drawable.hombre,"Sergio", "Ruiz", "2Dam"),
                Persona( R.drawable.mujer,"Lucia", "Ruiz", "2Dam"),
            )
        ){persona ->
            Toast.makeText(this, persona.nombre, Toast.LENGTH_SHORT).show()
        }

    }
}