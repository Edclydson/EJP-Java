package DESAFIO_1_EJP_POKEMON.Pokemon_PACKAGE;

import java.util.Random;

import DESAFIO_1_EJP_POKEMON.Pokemon_PACKAGE.My_Pokemons_PACKAGE.MeusPokemons;

public class GeraPokemon extends MeusPokemons//POKEMON >>> NOME,LVL,VIDA,TIPO,VALOR_ATAQUE,VALOR_DEFESA
{
    
    public static String[] pokemon_t_fogo = {"Charmander","Charmeleon","Charizard","Vulpix","Ninetales","Growlithe","Arcanine","Ponyta","Rapidash","Magmar","Flareon","Moltres","Cyndaquil","Quilava","Typhlosion","Slugma","Magcargo","Houndour","Houndoom","Magby","Entei","Ho-Oh","Torchic","Combusken","Blaziken","Numel","Camerut","Torkoal"};
    public static String[] pokemon_t_agua = {"Wartortle","Vaporeon","Tentacruel","Tentacool","Staryu","Starmie","Squirtle","Slowpoke","Slowbro","Shellder","Seel","Seaking","Seadra","Psyduck","Poliwrath","Poliwhirl","Poliwag","Omastar","Omanyte","Magikarp","Lapras","Krabby","Kingler","Kabutops","Kabuto","Horsea","Gyarados","Golduck","Goldeen","Dewgong","Cloyster"," Blastoise"};
    //private static String[] pokemon_t_normal = {""};,
    //private static String[] pokemon_t_Planta = {""};
    
    public static String pokemon;
    public static int level_pokemon;
    public static String tip_pokemon;
    public static int vida;
    public static Random rand = new Random();
    
    //GERANDO
    public static void tipo_pokemon()
    {
        while(true)
        {
           int t_pokemon = rand.nextInt(2);
            if(t_pokemon == 1)
            {
                int i = rand.nextInt(pokemon_t_fogo.length);
                pokemon = pokemon_t_fogo[i];  // DEFININDO O POKEMON
                tip_pokemon = "Fogo";
                break;
            }
            if (t_pokemon == 2) 
            {
                int i = rand.nextInt(pokemon_t_agua.length);
                pokemon = pokemon_t_agua[i];  // DEFININDO O POKEMON
                tip_pokemon = "Agua";
                break;
            }
            else {continue;}
        }   
    }
    public static void lvlPokemon()
    {
        level_pokemon = rand.nextInt(100);    // DEFININDO O LEVEL DO POKEMON       

    }
    public static void vida_pokemon()
    {
        if(level_pokemon <= 15)
        {
            vida = rand.nextInt(100,150);
        }
        else if(level_pokemon > 15 && level_pokemon <= 31)
        {
            vida = rand.nextInt(160,310);
        }
        else if(level_pokemon > 31 && level_pokemon <= 47)
        {
            vida = rand.nextInt(310,470);
        }
        else if(level_pokemon > 47 && level_pokemon <= 63)
        {
            vida = rand.nextInt(470,630);
        }
        else if(level_pokemon > 63 && level_pokemon <= 78)
        {
            vida = rand.nextInt(630,780);
        }
        else if(level_pokemon > 78 && level_pokemon <= 93)
        {
            vida = rand.nextInt(780,930);
        }
        else if(level_pokemon > 93 && level_pokemon <= 100)
        {
            vida = rand.nextInt(930,1000);
        }
    }
}
