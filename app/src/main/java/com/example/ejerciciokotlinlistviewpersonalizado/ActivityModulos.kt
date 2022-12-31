package com.example.ejerciciokotlinlistviewpersonalizado

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejerciciokotlinlistviewpersonalizado.databinding.ActivityMainBinding
import com.example.ejerciciokotlinlistviewpersonalizado.databinding.ActivityModulosBinding

class ActivityModulos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityModulosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener { startActivity(Intent(this, MainActivity::class.java)) }

        when (Bundle(intent.extras).getString("CICLO")) {
            "DAM" ->{
                binding.textViewCicloInfo.text = "Estás en el ciclo de DAM"
                binding.imageViewCicloInfo.setImageResource(R.drawable.img_2)
                window.setBackgroundDrawable(ColorDrawable(Color.parseColor("#c1ff65")))
            }
            "DAW" ->{
                binding.textViewCicloInfo.text = "Estás en el ciclo de DAW"
                binding.imageViewCicloInfo.setImageResource(R.drawable.img_1)
                window.setBackgroundDrawable(ColorDrawable(Color.parseColor("#ff5436")))
            }
            "ASIR" -> {
                binding.textViewCicloInfo.text = "Estás en el ciclo de ASIR"
                binding.imageViewCicloInfo.setImageResource(R.drawable.img)
                window.setBackgroundDrawable(ColorDrawable(Color.parseColor("#b675ff")))
            }

        }
    }
}