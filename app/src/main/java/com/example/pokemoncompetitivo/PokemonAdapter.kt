package com.example.pokemoncompetitivo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.pokemon_renglon.view.*

class PokemonAdapter (private val pokehd: List<pokes>)
    : RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder>(){
    inner class  PokemonViewHolder(v:View) : RecyclerView.ViewHolder(v){
        var foto = v.findViewById<ImageView>(R.id.foto_renglon)
        var nombre = v.findViewById<TextView>(R.id.nombre_renglon)
        var informacion = v.findViewById<TextView>(R.id.informacion_renglon)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val pokemon_renglon = inflater.inflate(R.layout.pokemon_renglon, parent, false)
        return PokemonViewHolder(pokemon_renglon)
    }

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        val dato = pokehd[position]
        holder.foto.setImageResource(dato.imagen)
        holder.nombre.text = dato.nombre
        holder.informacion.text = dato.informacion

        holder.itemView.setOnClickListener{
            val action = PokeFragmentDirections.actionPokeFragmentToInfoFragment(dato)
            holder.itemView.findNavController().navigate(action)
        }


    }

    override fun getItemCount(): Int {
        return pokehd.size
    }
}