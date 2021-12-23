package DESAFIO_1_EJP_POKEMON.Pokemon_PACKAGE.Arena_PACKAGE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.swing.JOptionPane;

import DESAFIO_1_EJP_POKEMON.Pokemon_PACKAGE.GeraPokemon;
import DESAFIO_1_EJP_POKEMON.Pokemon_PACKAGE.My_Pokemons_PACKAGE.AdversariosPokemons;

public class Batalha 
{
    //TRAZER POKEMONS USER PARA CA
    static Map<String,ArrayList> meus_pokemons_arena = new HashMap<>();
    static ArrayList<String> meus_pokemon_stats_arena = new ArrayList<>();
    //TRAZER POKEMONS ADVERSARIOS PARA CA
   // static Map<String,ArrayList> pokemons_adversarios_arena = new HashMap<>();
    public static ArrayList<String> pokemon_adversarios_stats_arena = new ArrayList<>();    

    //CRIAR FUNCAO PARA GERAR POKEMONS ADVERSARIOS
    public static void cria_novo_adversario()
    {
        GeraPokemon.tipo_pokemon();
        AdversariosPokemons.tipo_poK_adversario = GeraPokemon.tip_pokemon;
        AdversariosPokemons.nome_pok_adversario = GeraPokemon.pokemon;
        GeraPokemon.lvlPokemon();
        AdversariosPokemons.level_pok_adversario = String.valueOf(GeraPokemon.level_pokemon);
        GeraPokemon.vida_pokemon();
        AdversariosPokemons.vida_pok_adversario = String.valueOf(GeraPokemon.vida);
        AdversariosPokemons.guarda_novo_adversario();
    }


    //CRIAR AREA DE BATALHA
    public static void Arena()
    {
        pokemon_adversarios_stats_arena.addAll(AdversariosPokemons.pokemons_adversario_stats);
        System.out.println(pokemon_adversarios_stats_arena);
        JOptionPane.showMessageDialog(null,"Você entrou na Arena!\n");
        
    }
    public static void luta()
    {
        System.out.println("É hora da batalha!!!");
        JOptionPane.showMessageDialog(null,"Seu adversario será:\nPokemon: "+pokemon_adversarios_stats_arena.get(0)+"\nTipo: "+pokemon_adversarios_stats_arena.get(1)+"\nLevel: "+pokemon_adversarios_stats_arena.get(2)+"\nVida: "+pokemon_adversarios_stats_arena.get(3));
    }
    public String batalhaPokemon(String desafiante,int nvldesafiante,String escolhido,int nvlescolhido)
    {
        Random rand =new Random();
        String vencedor = "";
        if(nvldesafiante>nvlescolhido)
        {
            vencedor  = "O "+desafiante+" venceu a batalha";
        }
        else if(nvldesafiante<nvlescolhido)
        {
            vencedor = "O "+escolhido+" venceu a batalha";
        }
        else
        {
            JOptionPane.showMessageDialog(null,"O "+desafiante+" e o "+escolhido+" possuem o mesmo nivel, essa batalha vai ser muito dificil!");
            int decisao = rand.nextInt(2);
            if(decisao==1)
            {
                vencedor = "O "+desafiante+" venceu a batalha";
            }
            else if(decisao == 2)
            {
                vencedor = "O "+escolhido+" venceu a batalha";
            }
            else
            {
                vencedor = "Não houve um vencedor dessa batalha! Ambos pokemóns estão exaustos!";
            }
        }
        return vencedor;
    }   
}
