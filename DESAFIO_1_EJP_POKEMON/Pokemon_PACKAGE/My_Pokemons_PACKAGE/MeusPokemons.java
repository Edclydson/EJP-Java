package DESAFIO_1_EJP_POKEMON.Pokemon_PACKAGE.My_Pokemons_PACKAGE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JOptionPane;

//ARMAZENA 3 POKEMONS E SEUS ATRIBUTOS (NOME,LVL,TIPO,VALOR_ATAQUE,VALOR_DEFESA)
public class MeusPokemons
{
    static Scanner scan = new Scanner(System.in);
    public static Map<String,ArrayList> meus_pokemons = new HashMap<>();
    static ArrayList<String> pokemon1_stats = new ArrayList<>();
    static ArrayList<String> pokemon2_stats = new ArrayList<>();
    static ArrayList<String> pokemon3_stats = new ArrayList<>();
    public static String key_pokemon1 = "Pokemon_1_";
    public static String key_pokemon2 = "Pokemon_2_";
    public static String key_pokemon3 = "Pokemon_3_";

    public static void newpokemon(String tipo_pok,String nome_pok,String lvl_pok,String vid_pok)
    {
        // ORDEM DE INSERÇÂO 1-NOME 2-TIPO 3-LEVEL 4-VIDA
        String nomepokemon = nome_pok;
        String tipopokemon = tipo_pok;
        String levelpokemon = lvl_pok;
        String vidapokemon = vid_pok;
        //VERIFICANDO SE TEM ESPAÇO NAS LISTAS
        if(pokemon1_stats.isEmpty() == true)
        {
            pokemon1_stats.add(nomepokemon);
            pokemon1_stats.add(tipopokemon);
            pokemon1_stats.add(levelpokemon);
            pokemon1_stats.add(vidapokemon);
            meus_pokemons.put("Pokemon_1_", pokemon1_stats);
        }
        else if(pokemon2_stats.isEmpty() == true)
        {
            pokemon2_stats.add(nomepokemon);
            pokemon2_stats.add(tipopokemon);
            pokemon2_stats.add(levelpokemon);
            pokemon2_stats.add(vidapokemon);
            meus_pokemons.put("Pokemon_2_", pokemon2_stats);
        } 
        else if( pokemon3_stats.isEmpty() == true)
        {
            pokemon3_stats.add(nomepokemon);
            pokemon3_stats.add(tipopokemon);
            pokemon3_stats.add(levelpokemon);
            pokemon3_stats.add(vidapokemon);
            meus_pokemons.put("Pokemon_3_", pokemon3_stats);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Não há mais espaços para mais pokemons!");
        }
    }
   
    public void mostrapokemons()
    {
        if(meus_pokemons.isEmpty() == true)
        {
            JOptionPane.showMessageDialog(null,"Você nao tem pokemons");
        }
        else
        {
            switch(meus_pokemons.size())
            {
                case 1:
                {
                    System.out.println("Meus Pokemons:\nNome: "+pokemon1_stats.get(0)+"\nTipo: "+pokemon1_stats.get(1)+"\nLevel: "+pokemon1_stats.get(2)+ "\nVida: "+pokemon1_stats.get(3)+"\n1-Voltar");
                    break;
                }
                case 2:
                {
                    System.out.println("----------------------------------");
                    System.out.println("Meus Pokemons:\nNome: "+pokemon1_stats.get(0)+"\nTipo: "+pokemon1_stats.get(1)+"\nLevel: "+pokemon1_stats.get(2)+"\nVida: "+pokemon1_stats.get(3));
                    System.out.println("----------------------------------");
                    System.out.println("Nome: "+pokemon2_stats.get(0)+"\nTipo: "+pokemon2_stats.get(1)+"\nLevel: "+pokemon2_stats.get(2)+"\nVida: "+pokemon2_stats.get(3)+ "\n1-Voltar");
                    break;
                }
                case 3:
                {
                    System.out.println("----------------------------------");
                    System.out.println("Meus Pokemons:\nNome: "+pokemon1_stats.get(0)+"\nTipo: "+pokemon1_stats.get(1)+"\nLevel: "+pokemon1_stats.get(2)+"\nVida: "+pokemon1_stats.get(3));
                    System.out.println("----------------------------------");
                    System.out.println("Nome: "+pokemon2_stats.get(0)+"\nTipo: "+pokemon2_stats.get(1)+"\nLevel: "+pokemon2_stats.get(2)+"\nVida: "+pokemon2_stats.get(3));
                    System.out.println("----------------------------------");
                    System.out.println("Nome: "+pokemon3_stats.get(0)+"\nTipo: "+pokemon3_stats.get(1)+"\nLevel: "+pokemon3_stats.get(2)+"\nVida: "+pokemon3_stats.get(3)+ "\n1-Voltar");
                }
                default:
                {
                    break;
                }
            }
        }
    }

    public static void apagapokemon()
    {
        if(meus_pokemons.isEmpty() == true)
        {
            JOptionPane.showMessageDialog(null,"Você não possui pokemons para apagar!");
        }
        else
        {
            switch(meus_pokemons.size())
            {
                case 1: //SE HOUVER SO UM POKEMON
                {
                    System.out.println("---------POKEMON-1------------------------");
                    System.out.println("Nome: "+pokemon1_stats.get(0)+"\nTipo: "+pokemon1_stats.get(1)+"\nLevel: "+pokemon1_stats.get(2)+"\nVida: "+pokemon1_stats.get(3)+ "Meus Pokemons:\n1-Voltar");
                    System.out.println("Digite o numero do pokemon que deseja apagar:");
                    String op = scan.nextLine();
                    switch(op)
                    {
                        case "1":
                        {
                            meus_pokemons.remove(key_pokemon1);
                            pokemon1_stats.clear();
                            JOptionPane.showMessageDialog(null,"Pokemon apagado com sucesso!");
                            break;
                        }
                        default:{break;}
                    }
                    break;
                }
                case 2: //SE HOUVER 2 POKEMONS
                {
                    System.out.println("---------POKEMON-1------------------------");
                    System.out.println("Nome: "+pokemon1_stats.get(0)+"\nTipo: "+pokemon1_stats.get(1)+"\nLevel: "+pokemon1_stats.get(2)+"\nVida: "+pokemon1_stats.get(3));
                    System.out.println("---------POKEMON-2------------------------");
                    System.out.println("Nome: "+pokemon2_stats.get(0)+"\nTipo: "+pokemon2_stats.get(1)+"\nLevel: "+pokemon2_stats.get(2)+"\nVida: "+pokemon2_stats.get(3)+ "\n1-Voltar");
                    System.out.println("Digite o numero do pokemon que deseja apagar:");
                    String op = scan.nextLine();
                    switch(op)
                    {
                        case "1":
                        {
                            meus_pokemons.remove(key_pokemon1);
                            pokemon1_stats.clear();
                            JOptionPane.showMessageDialog(null,"Pokemon apagado com sucesso!");
                            break;
                        }
                        case "2":
                        {
                            meus_pokemons.remove(key_pokemon2);
                            pokemon2_stats.clear();
                            JOptionPane.showMessageDialog(null,"Pokemon apagado com sucesso!");
                            break;
                        }
                        default:{break;}
                    }
                    break;
                }
                case 3://SE HOUVER OS 3 POKEMONS
                {
                    System.out.println("---------POKEMON-1------------------------");
                    System.out.println("Meus Pokemons:\nNome: "+pokemon1_stats.get(0)+"\nTipo: "+pokemon1_stats.get(1)+"\nLevel: "+pokemon1_stats.get(2)+"\nVida: "+pokemon1_stats.get(3));
                    System.out.println("---------POKEMON-2------------------------");
                    System.out.println("Nome: "+pokemon2_stats.get(0)+"\nTipo: "+pokemon2_stats.get(1)+"\nLevel: "+pokemon2_stats.get(2)+"\nVida: "+pokemon2_stats.get(3));
                    System.out.println("---------POKEMON-3------------------------");
                    System.out.println("Nome: "+pokemon3_stats.get(0)+"\nTipo: "+pokemon3_stats.get(1)+"\nLevel: "+pokemon3_stats.get(2)+"\nVida: "+pokemon3_stats.get(3)+ "\n1-Voltar");
                    System.out.println("Digite o numero do pokemon que deseja apagar:");
                    String op = scan.nextLine();
                    switch(op)
                    {
                        case "1":
                        {
                            meus_pokemons.remove(key_pokemon1);
                            pokemon1_stats.clear();
                            JOptionPane.showMessageDialog(null,"Pokemon apagado com sucesso!");
                            break;
                        }
                        case "2":
                        {
                            meus_pokemons.remove(key_pokemon2);
                            pokemon2_stats.clear();
                            JOptionPane.showMessageDialog(null,"Pokemon apagado com sucesso!");
                            break;
                        }
                        case "3":
                        {
                            meus_pokemons.remove(key_pokemon3);
                            pokemon3_stats.clear();
                            JOptionPane.showMessageDialog(null,"Pokemon apagado com sucesso!");
                            break;
                        }
                        default:{break;}
                    }
                    break;
                }
                default:{break;}
            }
        }
    }
} 
