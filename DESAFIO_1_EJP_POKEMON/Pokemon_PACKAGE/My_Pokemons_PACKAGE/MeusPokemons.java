package DESAFIO_1_EJP_POKEMON.Pokemon_PACKAGE.My_Pokemons_PACKAGE;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import DESAFIO_1_EJP_POKEMON.Pokemon_PACKAGE.Treinador;

//ARMAZENA 3 POKEMONS E SEUS ATRIBUTOS (NOME,LVL,TIPO,VALOR_ATAQUE,VALOR_DEFESA)
public class MeusPokemons
{
    static Scanner scan = new Scanner(System.in);
    static ArrayList<String> pokebola1 = new ArrayList<>();
    static ArrayList<String> pokebola2 = new ArrayList<>();
    static ArrayList<String> pokebola3 = new ArrayList<>();
    public static String key_pokebola1 = "Pokemon_1_";
    public static String key_pokebola2 = "Pokemon_2_";
    public static String key_pokebola3 = "Pokemon_3_";

    public static void add_newpokemon_pokebola(String tipo_pok,String nome_pok,String lvl_pok,String vid_pok)
    {
        // ORDEM DE INSERÇÂO 1-NOME 2-TIPO 3-LEVEL 4-VIDA
        String nomepokemon = nome_pok;
        String tipopokemon = tipo_pok;
        String levelpokemon = lvl_pok;
        String vidapokemon = vid_pok;
        //VERIFICANDO SE TEM ESPAÇO NAS LISTAS
        if(pokebola1.isEmpty() == true)
        {
            pokebola1.add(nomepokemon);
            pokebola1.add(tipopokemon);
            pokebola1.add(levelpokemon);
            pokebola1.add(vidapokemon);
            Treinador.meuspokemons.put("Pokemon_1_", pokebola1);
        }
        else if(pokebola2.isEmpty() == true)
        {
            pokebola2.add(nomepokemon);
            pokebola2.add(tipopokemon);
            pokebola2.add(levelpokemon);
            pokebola2.add(vidapokemon);
            Treinador.meuspokemons.put("Pokemon_2_", pokebola2);
        } 
        else if(pokebola3.isEmpty() == true)
        {
            pokebola3.add(nomepokemon);
            pokebola3.add(tipopokemon);
            pokebola3.add(levelpokemon);
            pokebola3.add(vidapokemon);
            Treinador.meuspokemons.put("Pokemon_3_", pokebola3);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Você não tem mais pokebolas vazias!");
        }
    }
   
    public static void mostrapokemons()
    {
        if(Treinador.meuspokemons.isEmpty() == true)
        {
            JOptionPane.showMessageDialog(null,"Você nao tem pokemons");
        }
        else
        {
            switch(Treinador.meuspokemons.size())
            {
                case 1:
                {
                    System.out.println("Meus Pokemons:\nNome: "+pokebola1.get(0)+"\nTipo: "+pokebola1.get(1)+"\nLevel: "+pokebola1.get(2)+ "\nVida: "+pokebola1.get(3)+"\n1-Voltar");
                    break;
                }
                case 2:
                {
                    System.out.println("----------------------------------");
                    System.out.println("Meus Pokemons:\nNome: "+pokebola1.get(0)+"\nTipo: "+pokebola1.get(1)+"\nLevel: "+pokebola1.get(2)+"\nVida: "+pokebola1.get(3));
                    System.out.println("----------------------------------");
                    System.out.println("Nome: "+pokebola2.get(0)+"\nTipo: "+pokebola2.get(1)+"\nLevel: "+pokebola2.get(2)+"\nVida: "+pokebola2.get(3)+ "\n1-Voltar");
                    break;
                }
                case 3:
                {
                    System.out.println("----------------------------------");
                    System.out.println("Meus Pokemons:\nNome: "+pokebola1.get(0)+"\nTipo: "+pokebola1.get(1)+"\nLevel: "+pokebola1.get(2)+"\nVida: "+pokebola1.get(3));
                    System.out.println("----------------------------------");
                    System.out.println("Nome: "+pokebola2.get(0)+"\nTipo: "+pokebola2.get(1)+"\nLevel: "+pokebola2.get(2)+"\nVida: "+pokebola2.get(3));
                    System.out.println("----------------------------------");
                    System.out.println("Nome: "+pokebola3.get(0)+"\nTipo: "+pokebola3.get(1)+"\nLevel: "+pokebola3.get(2)+"\nVida: "+pokebola3.get(3)+ "\n1-Voltar");
                }
                default:
                {
                    break;
                }
            }
        }
    }

    public static void liberar()
    {
        if(Treinador.meuspokemons.isEmpty() == true)
        {
            JOptionPane.showMessageDialog(null,"Você não possui pokemons para apagar!");
        }
        else
        {
            switch(Treinador.meuspokemons.size())
            {
                case 1: //SE HOUVER SO UM POKEMON
                {
                    System.out.println("---------POKEMON-1------------------------");
                    System.out.println("Nome: "+pokebola1.get(0)+"\nTipo: "+pokebola1.get(1)+"\nLevel: "+pokebola1.get(2)+"\nVida: "+pokebola1.get(3)+ "Meus Pokemons:\n1-Voltar");
                    System.out.println("Você realmente deseja liberar seu único Pokemon?\n1-Sim 2-Não:");
                    String op = scan.nextLine();
                    switch(op)
                    {
                        case "1":
                        {
                            Treinador.meuspokemons.remove(key_pokebola1);
                            pokebola1.clear();
                            JOptionPane.showMessageDialog(null,"O Pokemon agora está livre no mundo aberto!");
                            break;
                        }
                        case "2":
                        {
                            break;
                        }
                        default:{break;}
                    }
                    break;
                }
                case 2: //SE HOUVER 2 POKEMONS
                {
                    System.out.println("---------POKEMON-1------------------------");
                    System.out.println("Nome: "+pokebola1.get(0)+"\nTipo: "+pokebola1.get(1)+"\nLevel: "+pokebola1.get(2)+"\nVida: "+pokebola1.get(3));
                    System.out.println("---------POKEMON-2------------------------");
                    System.out.println("Nome: "+pokebola2.get(0)+"\nTipo: "+pokebola2.get(1)+"\nLevel: "+pokebola2.get(2)+"\nVida: "+pokebola2.get(3)+ "\n1-Voltar");
                    System.out.println("Digite o numero do pokemon que deseja liberar:");
                    String op = scan.nextLine();
                    switch(op)
                    {
                        case "1":
                        {
                            Treinador.meuspokemons.remove(key_pokebola1);
                            pokebola1.clear();
                            JOptionPane.showMessageDialog(null,"Pokemon selecionado foi solto no mundo aberto!");
                            break;
                        }
                        case "2":
                        {
                            Treinador.meuspokemons.remove(key_pokebola2);
                            pokebola2.clear();
                            JOptionPane.showMessageDialog(null,"Pokemon foi liberto!");
                            break;
                        }
                        default:{break;}
                    }
                    break;
                }
                case 3://SE HOUVER OS 3 POKEMONS
                {
                    System.out.println("---------POKEMON-1------------------------");
                    System.out.println("Meus Pokemons:\nNome: "+pokebola1.get(0)+"\nTipo: "+pokebola1.get(1)+"\nLevel: "+pokebola1.get(2)+"\nVida: "+pokebola1.get(3));
                    System.out.println("---------POKEMON-2------------------------");
                    System.out.println("Nome: "+pokebola2.get(0)+"\nTipo: "+pokebola2.get(1)+"\nLevel: "+pokebola2.get(2)+"\nVida: "+pokebola2.get(3));
                    System.out.println("---------POKEMON-3------------------------");
                    System.out.println("Nome: "+pokebola3.get(0)+"\nTipo: "+pokebola3.get(1)+"\nLevel: "+pokebola3.get(2)+"\nVida: "+pokebola3.get(3)+ "\n1-Voltar");
                    System.out.println("Digite o numero do pokemon que deseja liberar:");
                    String op = scan.nextLine();
                    switch(op)
                    {
                        case "1":
                        {
                            Treinador.meuspokemons.remove(key_pokebola1);
                            pokebola1.clear();
                            JOptionPane.showMessageDialog(null,"Pokemon liberado com sucesso!");
                            break;
                        }
                        case "2":
                        {
                            Treinador.meuspokemons.remove(key_pokebola2);
                            pokebola2.clear();
                            JOptionPane.showMessageDialog(null,"Pokemon agora está livre!");
                            break;
                        }
                        case "3":
                        {
                            Treinador.meuspokemons.remove(key_pokebola3);
                            pokebola3.clear();
                            JOptionPane.showMessageDialog(null,"Pokemon foi solto no mundo!");
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
