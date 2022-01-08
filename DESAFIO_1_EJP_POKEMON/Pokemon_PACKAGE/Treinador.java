package DESAFIO_1_EJP_POKEMON.Pokemon_PACKAGE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import DESAFIO_1_EJP_POKEMON.Pokemon_PACKAGE.My_Pokemons_PACKAGE.MeusPokemons;

public class Treinador 
{
    String nome_treinador;
    static ArrayList<String> pokebolas = new ArrayList<String>();
    public static Map<String,ArrayList> meuspokemons = new HashMap<>();
    int xp;
    // lvl do 1 ao 5
    int lvl_treinador;

    public static void LiberarPokemon()
    {
        MeusPokemons.liberar();
    }

    public static void VerMeusPokemons()
    {
        MeusPokemons.mostrapokemons();
    }
    public static void PegarPokebola()
    {
       //fazer metodo pra pegar pokebola
    }
}
