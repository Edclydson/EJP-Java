package DESAFIO_1_EJP_POKEMON.Pokemon_PACKAGE.My_Pokemons_PACKAGE;

import java.util.ArrayList;

import DESAFIO_1_EJP_POKEMON.Pokemon_PACKAGE.GeraPokemon;

public class AdversariosPokemons extends GeraPokemon  
//ARMAZENAR 3 POKEMONS E SEUS ATRIBUTOS (NOME,TIPO,LVL,VIDA,VALOR_ATAQUE,VALOR_DEFESA)
{
    GeraPokemon ger = new GeraPokemon();
    //static Map<String,ArrayList> pokemons_adversarios = new HashMap<>();
    public static ArrayList<String> pokemons_adversario_stats = new ArrayList<String>();
   // static ArrayList<String> pokemon2_stats = new ArrayList<String>();
   // static ArrayList<String> pokemon3_stats = new ArrayList<String>();
    public static String nome_pok_adversario;
    public static String tipo_poK_adversario;
    public static String level_pok_adversario;
    public static String vida_pok_adversario;

    public static void guarda_novo_adversario()
    {
        pokemons_adversario_stats.add(nome_pok_adversario);
        pokemons_adversario_stats.add(tipo_poK_adversario);
        pokemons_adversario_stats.add(level_pok_adversario);
        pokemons_adversario_stats.add(vida_pok_adversario);
    }
    
}