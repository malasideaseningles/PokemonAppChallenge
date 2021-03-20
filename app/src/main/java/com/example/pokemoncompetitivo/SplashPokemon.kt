package com.example.pokemoncompetitivo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashPokemon : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_pokemon)
        Handler().postDelayed({
            val intento = Intent(this, MainActivity::class.java)
            startActivity(intento)

            // close this activity
            finish()
        }, 3000)
    }
}