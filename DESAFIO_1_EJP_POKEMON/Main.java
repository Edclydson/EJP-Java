package DESAFIO_1_EJP_POKEMON;
import java.util.Random;
import javax.swing.JOptionPane;

public class Main
{ 
    Random rand = new Random();
    public String desafiante;
    public int lvl;
    public static String[] lista_pokemons = {"Caterpie", "Weedle","Pidgey", "Rattata", "Ekans", "Sandshrew"," Nidoran","Bulbasaur" ,"Charmander", "Squirtle", "Metapod"," Kakuna", "Pidgeotto", "Raticate"};
   
    public int lvlPokemon()
    {
        lvl = rand.nextInt(100);
        return lvl;
    }
    
    public String pokemonDesafiante()
    {
        desafiante =lista_pokemons[rand.nextInt(lista_pokemons.length)];  // DEFININDO O POKEMON DESAFIANTE
        return desafiante;
    }

    public String batalhaPokemon(String desafiante,int nvldesafiante,String escolhido,int nvlescolhido)
    {
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
        DESAFIO1EJP_POKEMON a = new DESAFIO1EJP_POKEMON();
        String pokemonDesafiante = a.pokemonDesafiante();
        int nivelDesafiante = a.lvlPokemon();
        String pokemonEscolhido;
        int nivelPokemonEscolhido = a.lvlPokemon();

        JOptionPane.showMessageDialog(null,pokemonDesafiante+"(Nível "+nivelDesafiante+") desafiou você! \n Escolha um Pokemón para batalhar!");
        pokemonEscolhido = JOptionPane.showInputDialog(lista_pokemons,"Digite o nome de um Pokemón:");
        JOptionPane.showMessageDialog(null,pokemonEscolhido+"(Nível "+nivelPokemonEscolhido+") eu escolho você!");
        JOptionPane.showMessageDialog(null,"É hora da batalha!");
        JOptionPane.showMessageDialog(null,a.batalhaPokemon(pokemonDesafiante, nivelDesafiante, pokemonEscolhido, nivelPokemonEscolhido));
    }
}
