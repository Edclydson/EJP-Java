package DESAFIO_1_EJP_POKEMON;
import java.util.Random;
import javax.swing.JOptionPane;

import DESAFIO_1_EJP_POKEMON.Pokemon_PACKAGE.GeraPokemon;
import DESAFIO_1_EJP_POKEMON.Pokemon_PACKAGE.My_Pokemons_PACKAGE.MeusPokemons;

public class Main extends MeusPokemons
{
    
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
        
    public static void main(String[] args)
    {
        GeraPokemon gr = new GeraPokemon();
        while(true)
        {
            String op = JOptionPane.showInputDialog(null, "Selecione uma opção:\n1-Criar Pokemon\n2-Listar Meus Pokemons\n3-Apagar Pokemons\n4-Arena\n5-Sair");
            switch(op)
            {
                case "1":
                {
                    GeraPokemon.tipo_pokemon();
                    GeraPokemon.lvlPokemon();
                    GeraPokemon.vida_pokemon();
                    MeusPokemons.newpokemon(GeraPokemon.tip_pokemon, GeraPokemon.pokemon,String.valueOf(gr.level_pokemon),String.valueOf(GeraPokemon.vida));
                    continue;
                }
                case "2":
                {
                    gr.mostrapokemons();
                    continue;
                }
                case "3":
                {
                   GeraPokemon.apagapokemon();
                   continue;
                }
                case "4":
                {
                    continue;
                }
                case "5":
                {
                    System.exit(0);
                }
            }
        }
    }

}
