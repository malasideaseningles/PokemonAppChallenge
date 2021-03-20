package com.example.pokemoncompetitivo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_poke.*

class PokeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_poke, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        pokes_recycler.apply{
            layoutManager= LinearLayoutManager(activity)
            adapter = PokemonAdapter(createData())
        }
    }

    fun createData(): ArrayList<pokes>{
        val pokesd = ArrayList<pokes>()

        pokesd.add(pokes(R.drawable.incineroar,"Incineroar","INFO: Posee un carácter rudo y egoísta. Si un Entrenador no le cae en gracia, ignora sus órdenes con total impasibilidad.", "TIPO: fuego/siniestro", "ATAQUE1: Flare Blitz","ATAQUE2: snarl","ATAQUE3: Fake Out", "ATAQUE4: U-Turn","HABILDIAD SECRETA: Intimidate","NATURALEZA: careful","ITEM: Assault Vest", "IV: 252/0/124/0/132/0","tiene un uso del 60% en el competitivo de la serie 8 del sword/shield"))
        pokesd.add(pokes(R.drawable.dragapult,"Dragapult","INFO: Vive en compañía de Dreepy, a los que hospeda en el interior de sus cuernos. Los dispara a velocidad supersónica en combate.", "TIPO: Dragon/Fantasma", "ATAQUE1: Breaking Swipe","ATAQUE2: Light Screen","ATAQUE3: Surf", "ATAQUE4:  Ally Switch","HABILDIAD SECRETA: Clear Body","NATURALEZA: Jolly","ITEM: Life Orb", "IV: 228/252/0/0/0/228","tiene un uso del 7% en el competitivo de la serie 8 del sword/shield"))
        pokesd.add(pokes(R.drawable.riegeleki,"regieleki","INFO: Todo su cuerpo es un órgano electrógeno, cuya potencia sería suficiente para abastecer la región de Galar por completo.", "TIPO: electrico", "ATAQUE1: Electroweb","ATAQUE2: Protect","ATAQUE3: Volt Switch", "ATAQUE4: Thunderbolt","HABILDIAD SECRETA: Transistor","NATURALEZA: Timid","ITEM:  Magnet", "IV: 0/0/0/252/4/252","tiene un uso del 35% en el competitivo de la serie 8 del sword/shield"))
        pokesd.add(pokes(R.drawable.thundurus,"thundurus","INFO: Su gusto por surcar el cielo lanzando rayos y provocando incendios forestales le ha granjeado pocas simpatías", "TIPO: electrico/volador", "ATAQUE1: Fly","Wild Charge ","ATAQUE3: Superpower", "ATAQUE4: Protect ","HABILDIAD SECRETA: Defiant","NATURALEZA: Jolly","ITEM: Assault Vest", "IV: 4/252/0/0/0/252","tiene un uso del 26% en el competitivo de la serie 8 del sword/shield"))
        pokesd.add(pokes(R.drawable.zacian,"Zacian-Crowned","INFO: En esta forma había servido como arma en tiempos remotos. Es capaz de abatir de una sola estocada incluso a un Pokémon Gigamax.", "TIPO: hada/acero", "ATAQUE1: Behemoth Blade","ATAQUE2: Protect ","ATAQUE3: Sacred Sword", "ATAQUE4: Substitute","HABILDIAD SECRETA: Intrepid Sword","NATURALEZA: Jolly","ITEM:  Rusted Sword", "IV: 0/252/0/0/4/252","tiene un uso del 24% en el competitivo de la serie 8 del sword/shield"))
        pokesd.add(pokes(R.drawable.landorus,"Landorus-Therian","INFO: Utiliza energía que obtiene del viento y del relámpago para nutrir el suelo y generar abundantes cosechas.", "TIPO: volador/tierra", "ATAQUE1: Earthquake","ATAQUE2: Rock Slide ","ATAQUE3: Fly", "ATAQUE4: Swords Dance","HABILDIAD SECRETA: Intimidate","NATURALEZA: Jolly","ITEM:  Lum Berry", "IV:4/252/0/0/0/252","tiene un uso del 24% en el competitivo de la serie 8 del sword/shield"))
        pokesd.add(pokes(R.drawable.amoongus,"Amoonguss","INFO: Expulsa esporas venenosas. Crecerán setas en cualquier superficie con la que entren en contacto si no se lava de inmediato", "TIPO: planta/veneno", "ATAQUE1: Spore","ATAQUE2: Rage Powder","ATAQUE3: Protect ", "ATAQUE4: Clear Smog","HABILDIAD SECRETA: Regenerator","NATURALEZA: Sassy","ITEM:  Coba Berry", "252/0/100/0/156/0","tiene un uso del 22% en el competitivo de la serie 8 del sword/shield"))
        pokesd.add(pokes(R.drawable.rilla," Rillaboom","INFO:  Tras fusionarse con su batería forestal, Rillaboom marca ritmos atronadores que sacuden la región de Galar entera.", "TIPO: planta", "ATAQUE1: Grassy Glide ","ATAQUE2: Fake Out","ATAQUE3: Wood Hammer", "ATAQUE4:Protect ","HABILDIAD SECRETA: Grassy Surge","NATURALEZA: Adamant","ITEM: Miracle Seed", "IV:220/252/4/0/28/4 ","tiene un uso del 21% en el competitivo de la serie 8 del sword/shield"))
        pokesd.add(pokes(R.drawable.fini,"Tapu Fini","INFO: A pesar de ser un espíritu guardián, trae desgracias a aquellos que se le acercan sin la debida cortesía.", "TIPO: agua", "ATAQUE1: Moonblast ","ATAQUE2: Protect","ATAQUE3: Muddy Water", "ATAQUE4: Calm Mind","HABILDIAD SECRETA: Misty Surge","NATURALEZA: Calm","ITEM:  Leftovers", "IV: 252/0/68/4/116/68 ","tiene un uso del 19% en el competitivo de la serie 8 del sword/shield"))
        pokesd.add(pokes(R.drawable.urs,"Urshifu","INFO:Se dice que una sola mirada iracunda de este Pokémon basta para arrebatarle la vida a quien posee un corazón perverso.", "TIPO: lucha/siniestro", "ATAQUE1: Wicked Blow","ATAQUE2:Close Combat","ATAQUE3: Sucker Punch ", "ATAQUE4: Protect","HABILDIAD SECRETA: Unseen Fist","NATURALEZA: Jolly ","ITEM:  Focus Sash", "IV: 0/252/0/0/4/252 ","tiene un uso del 16% en el competitivo de la serie 8 del sword/shield"))
        pokesd.add(pokes(R.drawable.kyo,"Kyogre,", "INFO: A Kyogre siempre se le ha descrito como el Pokémon que expandió los océanos. Varias leyendas cuentan que libró combates contra Groudon en repetidas ocasiones para tener el control de la energía de la naturaleza.", "TIPO: agua", "ATAQUE1: Water Spout","ATAQUE2: Protect","ATAQUE3: Origin Pulse", "ATAQUE4: Ice Beam","HABILDIAD SECRETA: Drizzle","NATURALEZA: Modest","ITEM:  Mystic Water", "IV: 4/0/0/252/0/252","tiene un uso del 15% en el competitivo de la serie 8 del sword/shield"))
        pokesd.add(pokes(R.drawable.pori,"Porygon2","INFO: Al dotarlo de inteligencia artificial, desarrolló un misterioso lenguaje que solo los miembros de su especie son capaces de comprender.", "TIPO: normal", "ATAQUE1: Trick Room","ATAQUE2: Recover","ATAQUE3: Eerie Impulse", "ATAQUE4: Ice Beam ","HABILDIAD SECRETA: Download","NATURALEZA: Sassy","ITEM:  Eviolite", "IV: 252/0/116/0/140/0","tiene un uso del 15% en el competitivo de la serie 8 del sword/shield"))
        pokesd.add(pokes(R.drawable.lapras,"Lapras","INFO: Nada sin problema en aguas heladas gracias a la soberbia resistencia al frío que posee. Su tersa piel es ligeramente fría al tacto.", "TIPO: agua/hielo", "ATAQUE1: Hydro Pump","ATAQUE2: Protect","ATAQUE3: Freeze-Dry ", "ATAQUE4: Perish Song","HABILDIAD SECRETA: Water Absorb","NATURALEZA: Modest","ITEM: Light Clay", "IV: 24/0/0/252/0/252 ","tiene un uso del 12% en el competitivo de la serie 8 del sword/shield"))
        pokesd.add(pokes(R.drawable.kartana,"kartana","INFO: \tPara los seres de este mundo resulta extraño y peligroso, pero en el mundo del que procede es una criatura muy común.", "TIPO: planta/acero", "ATAQUE1: Leaf Blade","ATAQUE2: Smart Strike","ATAQUE3: Sacred Sword", "ATAQUE4: Aerial Ace ","HABILDIAD SECRETA: Beast Boost","NATURALEZA: Jolly","ITEM: Assault Vest", "IV:  4/4/4/0/244/252","tiene un uso del 10% en el competitivo de la serie 8 del sword/shield"))
        pokesd.add(pokes(R.drawable.zard," Charizard ","INFO: Sus potentes alas le permiten volar a una altura de 1400 m. Escupe llamaradas que llegan a alcanzar temperaturas elevadísimas.", "TIPO: fuego/volador", "ATAQUE1: Heat Wave","ATAQUE2:Scorching Sands","ATAQUE3: Protect", "ATAQUE4: Air Slash","HABILDIAD SECRETA:Solar Power","NATURALEZA: Timid","ITEM:  Life Orb", "IV: 4/0/0/252/0/252","tiene un uso del 8% en el competitivo de la serie 8 del sword/shield"))

        return pokesd


    }

}