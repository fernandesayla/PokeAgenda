package com.example.logonrm.pokeagenda.api

import com.example.logonrm.pokeagenda.model.Pokemon
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by logonrm on 21/02/2018.
 */

interface PokemonAPI{

    @GET("/api/v2/pokemon/{numero}")
    fun buscarPokemon(@Path("numero") numeroPokemon: Int): Call<Pokemon>

}