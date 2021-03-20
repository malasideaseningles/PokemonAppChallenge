package com.example.pokemoncompetitivo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_info.*
import kotlinx.android.synthetic.main.fragment_info.foto
import kotlinx.android.synthetic.main.pokemon_renglon.*

class InfoFragment : Fragment() {

    private val args by navArgs<InfoFragmentArgs>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        foto.setImageResource(args.namepokes.imagen)
        nombre.text = args.namepokes.nombre
        informacion.text = args.namepokes.informacion
        tipo.text = args.namepokes.tipo
        ataque1.text = args.namepokes.ataque1
        ataque2.text=args.namepokes.ataque2
        ataque3.text=args.namepokes.ataque3
        ataque4.text=args.namepokes.ataque4
        HabilidadSecreta.text=args.namepokes.habilidadSecreta
        Naturaleza.text=args.namepokes.naturaleza
        itemequipado.text=args.namepokes.itemequipado
        IV.text=args.namepokes.IV

        val text = args.namepokes.secreto
        val duration = Toast.LENGTH_LONG

        val toast = Toast.makeText(context, text, duration)
        toast.show()


    }

}