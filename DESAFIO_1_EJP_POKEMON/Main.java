package DESAFIO_1_EJP_POKEMON;
import javax.swing.JOptionPane;
import DESAFIO_1_EJP_POKEMON.Pokemon_PACKAGE.GeraPokemon;
import DESAFIO_1_EJP_POKEMON.Pokemon_PACKAGE.Arena_PACKAGE.Batalha;
import DESAFIO_1_EJP_POKEMON.Pokemon_PACKAGE.My_Pokemons_PACKAGE.MeusPokemons;

public class Main extends MeusPokemons
{        
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
                    if(MeusPokemons.meus_pokemons.isEmpty() == true)
                    {
                        JOptionPane.showMessageDialog(null,"Você não pode entrar na Arena sem nenhum pokemon!");
                        continue;
                    }else
                    {
                       // Batalha.cria_novo_adversario();
                        Batalha.Arena();
                        Batalha.luta();
                        continue;
                    }
                }
                case "5":
                {
                    System.exit(0);
                }
            }
        }
    }
}
