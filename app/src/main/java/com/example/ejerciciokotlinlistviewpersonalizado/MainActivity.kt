package com.example.ejerciciokotlinlistviewpersonalizado

import android.content.Intent
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
                Persona(R.drawable.hombre,"Francisco", "Ruiz", "DAM"),
                Persona( R.drawable.mujer,"Sofia", "Ruiz", "DAW"),
                Persona( R.drawable.mujer,"Carmen", "Ruiz", "ASIR"),
                Persona( R.drawable.hombre,"Antonio", "Ruiz", "ASIR"),
                Persona( R.drawable.hombre,"Carlos", "Ruiz", "DAW"),
                Persona( R.drawable.mujer,"Sara", "Ruiz", "DAM"),
                Persona( R.drawable.hombre,"Manuel", "Ruiz", "DAM"),
                Persona( R.drawable.hombre,"Sergio", "Ruiz", "DAW"),
                Persona( R.drawable.mujer,"Lucia", "Ruiz", "ASIR"),
            )
        ){persona ->
            //Toast.makeText(this, persona.nombre, Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ActivityModulos::class.java)
            intent.putExtra("CICLO", persona.ciclo)
            startActivity(intent)
        }

    }
}