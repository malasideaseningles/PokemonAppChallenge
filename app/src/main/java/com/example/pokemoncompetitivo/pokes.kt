package com.example.pokemoncompetitivo

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class pokes(val imagen:Int,
                 val nombre:String,
                 val informacion:String,
                 val tipo: String,
                 val ataque1: String,
                 val ataque2: String,
                 val ataque3: String,
                 val ataque4: String,
                 val habilidadSecreta: String,

                 val naturaleza: String,
                 val itemequipado: String,
                 val IV: String,
                 val secreto:String) : Parcelable
