package DESAFIO_1_EJP_POKEMON.Pokemon_PACKAGE;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import DESAFIO_1_EJP_POKEMON.Pokemon_PACKAGE.My_Pokemons_PACKAGE.MeusPokemons;

public class GeraPokemon extends MeusPokemons//POKEMON >>> NOME,LVL,VIDA,TIPO,VALOR_ATAQUE,VALOR_DEFESA
{
    
    public static List<String> pokemon_t_fogo = new ArrayList<>();
    public static List<String> pokemon_t_agua = new ArrayList<>();
    public static List<String> pokemon_t_normal = new ArrayList<>();
    public static List<String> pokemon_t_planta = new ArrayList<>();
    
    public static String pokemon;
    public static int level_pokemon;
    public static String tip_pokemon;
    public static int vida;
    public static Random rand = new Random();
    
    //GERANDO
    public static void tipo_pokemon()
    {
        try 
        {
            pokemon_t_normal = Files.readAllLines(Paths_Arquivos.path0);
            pokemon_t_fogo = Files.readAllLines(Paths_Arquivos.path1);
            pokemon_t_agua = Files.readAllLines(Paths_Arquivos.path2);
            pokemon_t_planta = Files.readAllLines(Paths_Arquivos.path3);
       
            
                int t_pokemon = rand.nextInt(4);
                switch(t_pokemon)
                {
                    case 1:
                    {
                        int i = rand.nextInt(pokemon_t_fogo.size());
                        pokemon = pokemon_t_fogo.get(i);  // DEFININDO O POKEMON
                        tip_pokemon = "Fogo";
                        break;
                    }
                    case 2:
                    {
                        int i = rand.nextInt(pokemon_t_agua.size());
                        pokemon = pokemon_t_agua.get(i);  
                        tip_pokemon = "Agua";
                        break;
                    }
                    case 3:
                    {
                        int i = rand.nextInt(pokemon_t_normal.size());
                        pokemon = pokemon_t_normal.get(i); 
                        tip_pokemon = "Normal";
                        break;
                    }
                    case 4:
                    {
                        int i = rand.nextInt(pokemon_t_planta.size());
                        pokemon = pokemon_t_planta.get(i); 
                        tip_pokemon = "Planta";
                        break;
                    }
                    default:{}
                }
              
        }
        catch (IOException e) 
        {
            e.printStackTrace();
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
