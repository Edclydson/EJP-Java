package DESAFIO_1_EJP_POKEMON.Pokemon_PACKAGE.Arena_PACKAGE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.lang.Thread; 

import javax.swing.JOptionPane;

import DESAFIO_1_EJP_POKEMON.Pokemon_PACKAGE.GeraPokemon;
import DESAFIO_1_EJP_POKEMON.Pokemon_PACKAGE.My_Pokemons_PACKAGE.AdversariosPokemons;
import DESAFIO_1_EJP_POKEMON.Pokemon_PACKAGE.My_Pokemons_PACKAGE.MeusPokemons;

public class Batalha extends SistemaCombate
{   
    public static boolean t;
    public static Scanner scan = new Scanner(System.in);
    public Map<String,ArrayList> meus_pokemons_arena = new HashMap<>();
    public static ArrayList<String> meu_pokemon_arena = new ArrayList<>();
    public static ArrayList<String> pokemon_adversarios_stats_arena = new ArrayList<>();
    public static String pkey;

    public static void cria_novo_adversario()
    {
        while(true)
        {
            GeraPokemon.tipo_pokemon();
            if(GeraPokemon.pokemon.equals(meu_pokemon_arena.get(0)))
            {
                continue;    
            }
            else
            {
                AdversariosPokemons.tipo_poK_adversario = GeraPokemon.tip_pokemon;
                AdversariosPokemons.nome_pok_adversario = GeraPokemon.pokemon;
                GeraPokemon.lvlPokemon();
                AdversariosPokemons.level_pok_adversario = String.valueOf(GeraPokemon.level_pokemon);
                GeraPokemon.vida_pokemon();
                AdversariosPokemons.vida_pok_adversario = String.valueOf(GeraPokemon.vida);
                AdversariosPokemons.guarda_novo_adversario();
                break;
            }
            
        }
        
    }

    public static void EscolhaSeuPokemon()
    {
        Scanner scan = new Scanner(System.in);
        String escolha_pokebola;
        switch(MeusPokemons.meus_pokemons.size())
        {
            case 1: //SE HOUVER SO UMA POKEBOLA
            {
                meu_pokemon_arena.addAll(MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokebola1));
                pkey = MeusPokemons.key_pokebola1;
                JOptionPane.showMessageDialog(null,meu_pokemon_arena.get(0)+", eu escolho você!");
                break;
            }
            case 2: //SE HOUVER 2 POKEBOLAS
            {
                System.out.println("---------POKEMON-1------------------------");
                System.out.println("Nome: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokebola1).get(0)+"\nTipo: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokebola1).get(1)+"\nLevel: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokebola1).get(2)+"\nVida: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokebola1).get(3));
                System.out.println("---------POKEMON-2------------------------");
                System.out.println("Nome: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokebola2).get(0)+"\nTipo: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokebola2).get(1)+"\nLevel: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokebola2).get(2)+"\nVida: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokebola2).get(3)+ "\n1-Voltar");
                System.out.println("Digite o numero do pokemon que deseja escolher:");
                escolha_pokemon = scan.nextLine();
                switch(escolha_pokemon)
                {
                    case "1":
                    {
                        meu_pokemon_arena.addAll(MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokebola1));
                        pkey = MeusPokemons.key_pokebola1;
                        JOptionPane.showMessageDialog(null,meu_pokemon_arena.get(0)+", eu escolho você!");
                        break;
                    }
                    case "2":
                    {
                        meu_pokemon_arena.addAll(MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokebola2));
                        pkey = MeusPokemons.key_pokebola2;
                        JOptionPane.showMessageDialog(null,meu_pokemon_arena.get(0)+", eu escolho você!");
                        break;
                    }
                    default:{break;}
                }
                break;
            }
            case 3://SE HOUVER AS 3 POKEBOLAS
            {
                System.out.println("---------POKEBOLA-1------------------------");
                System.out.println("Nome: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokebola1).get(0)+"\nTipo: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokebola1).get(1)+"\nLevel: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokebola1).get(2)+"\nVida: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokebola1).get(3));
                System.out.println("---------POKEBOLA-2------------------------");
                System.out.println("Nome: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokebola2).get(0)+"\nTipo: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokebola2).get(1)+"\nLevel: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokebola2).get(2)+"\nVida: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokebola2).get(3));
                System.out.println("---------POKEBOLA-3------------------------");
                System.out.println("Nome: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokebola3).get(0)+"\nTipo: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokebola3).get(1)+"\nLevel: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokebola3).get(2)+"\nVida: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokebola3).get(3)+ "\n1-Voltar");
                System.out.println("Digite o numero da pokebola que deseja escolher:");
                escolha_pokemon = scan.nextLine();
                switch(escolha_pokemon)
                {
                    case "1":
                    {
                        meu_pokemon_arena.addAll(MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokebola1));
                        pkey = MeusPokemons.key_pokebola1;
                        JOptionPane.showMessageDialog(null,meu_pokemon_arena.get(0)+", eu escolho você!");
                        break;
                    }
                    case "2":
                    {
                        meu_pokemon_arena.addAll(MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokebola2));
                        pkey = MeusPokemons.key_pokebola2;
                        JOptionPane.showMessageDialog(null,meu_pokemon_arena.get(0)+", eu escolho você!");
                        break;
                    }
                    case "3":
                    {
                        meu_pokemon_arena.addAll(MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokebola3));
                        pkey = MeusPokemons.key_pokebola3;
                        JOptionPane.showMessageDialog(null,meu_pokemon_arena.get(0)+", eu escolho você!");
                        break;
                    }
                    default:{break;}
                }
                break;
            }
            default:{break;}
        }
        scan.close();
    }

    //CRIAR AREA DE BATALHA
    public static void Arena()
    {
        String escolha_arena;
        escolha_arena = JOptionPane.showInputDialog(null, "Você entrou na Arena!\nO que gostaria de fazer?\n1-Escolher pokemon\n2-Lutar\n3-Sair da Arena");
   
        switch(escolha_arena)
        {
            case "1":
            {
                EscolhaSeuPokemon();
                break;
            }
            case "2":
            {
                luta();
                break;
            }
            case "3":
            {
                break;
            }
            default:{}
        }       
    
    }
    public static void luta() 
    {
        cria_novo_adversario();
        pokemon_adversarios_stats_arena.addAll(AdversariosPokemons.pokemons_adversario_stats);
        System.out.println("É hora da batalha!!!");
        JOptionPane.showMessageDialog(null,"Seu adversario será:\nPokemon: "+pokemon_adversarios_stats_arena.get(0)+"\nTipo: "+pokemon_adversarios_stats_arena.get(1)+"\nLevel: "+pokemon_adversarios_stats_arena.get(2)+"\nVida: "+pokemon_adversarios_stats_arena.get(3));

        
        //CHAMA SISTEMA DE COMBATE
        sistema_combate();
        //CHAMA STATS
        definindo_stats_pokemon(Integer.parseInt(meu_pokemon_arena.get(2)), minha_key);
        definindo_stats_pokemon(Integer.parseInt(pokemon_adversarios_stats_arena.get(2)), ad_key);
        JOptionPane.showMessageDialog(null,"A Batalha vai começar!");
        while(true)
        {
            if(vida_meu_pokemon <= 0)
            {
                JOptionPane.showMessageDialog(null,pokemon_adversarios_stats_arena.get(0)+" venceu a batalha!!!");
                MeusPokemons.meus_pokemons.remove(pkey);
                meu_pokemon_arena.clear();
                System.out.println("Deu ruim! :( ");
                break;
            }
            else if(vida_pokemon_adversario <= 0)
            {
                JOptionPane.showMessageDialog(null,meu_pokemon_arena.get(0)+" venceu a batalha!!!");
                System.out.println("Parabens!!!");
                break;
            }
            else
            {
                acaojogador();
                System.out.println("\n");
                try { Thread.sleep (3000); } catch (InterruptedException ex) {}
                acaoadversario();
                try { Thread.sleep (3000); } catch (InterruptedException ex) {}
            }

        }
    }

    //RECEBE CHAVE PARA SABER QUEM ESTA ATACANDO E DEFENDENDO
    public static void calc_do_dano(String key)
    {
        Random rand = new Random();
        switch(key)
        {
            case "m": //MEU POKEMON ATACA
            {
                 //SE MEU ATAQUE TIVER BUFFADO E SE A DEFESA DO ADVERSARIO TEM BUFF
                if(buff_ataque_MP == true && buff_defesa_AD == true)
                {
                    valor_ataque_descontar_hp = rand.nextInt(dano_def_a_b_meu_pokemon.get(0),dano_def_a_b_meu_pokemon.get(1));
                    valor_ataque_descontar_hp = valor_ataque_descontar_hp + valor_ataque_descontar_hp * (rand.nextInt(5,18) / 100);
                    valor_defesa_descontar_ataque = rand.nextInt(dano_def_a_b_pokemon_ad.get(0),dano_def_a_b_pokemon_ad.get(1));
                    valor_ataque_descontar_hp = (valor_ataque_descontar_hp - valor_defesa_descontar_ataque);
                    if(valor_ataque_descontar_hp <= 0)
                    {
                        valor_ataque_descontar_hp = 0;
                        vida_pokemon_adversario = vida_pokemon_adversario - valor_ataque_descontar_hp;  
                    }
                    else
                    {
                        vida_pokemon_adversario = vida_pokemon_adversario - valor_ataque_descontar_hp;  
                    }
                    
                }
                else if(buff_ataque_MP == true && buff_defesa_AD == false)
                {
                    valor_ataque_descontar_hp = rand.nextInt(dano_def_a_b_meu_pokemon.get(0),dano_def_a_b_meu_pokemon.get(1));
                    valor_ataque_descontar_hp = valor_ataque_descontar_hp + Math.round(valor_ataque_descontar_hp * (rand.nextInt(5,18) / 100));
                    if(valor_ataque_descontar_hp <= 0)
                    {
                        valor_ataque_descontar_hp = 0;
                        vida_pokemon_adversario = vida_pokemon_adversario - valor_ataque_descontar_hp;  
                    }
                    else
                    {
                        vida_pokemon_adversario = vida_pokemon_adversario - valor_ataque_descontar_hp;  
                    }
                }
                else if (buff_ataque_MP == false && buff_defesa_AD == true)
                {
                    valor_ataque_descontar_hp = rand.nextInt(dano_def_a_b_meu_pokemon.get(0),dano_def_a_b_meu_pokemon.get(1));
                    valor_ataque_descontar_hp = valor_ataque_descontar_hp - valor_ataque_descontar_hp * (rand.nextInt(5,18) / 100);
                    valor_defesa_descontar_ataque = rand.nextInt(dano_def_a_b_pokemon_ad.get(0),dano_def_a_b_pokemon_ad.get(1));
                    valor_ataque_descontar_hp = (valor_ataque_descontar_hp - valor_defesa_descontar_ataque);
                    if(valor_ataque_descontar_hp <= 0)
                    {
                        valor_ataque_descontar_hp = 0;
                        vida_pokemon_adversario = vida_pokemon_adversario - valor_ataque_descontar_hp;  
                    }
                    else
                    {
                        vida_pokemon_adversario = vida_pokemon_adversario - valor_ataque_descontar_hp;  
                    }
                }
                else if(buff_ataque_MP == false && buff_defesa_AD == false)
                {
                    valor_ataque_descontar_hp = rand.nextInt(dano_def_a_b_meu_pokemon.get(0),dano_def_a_b_meu_pokemon.get(1));
                    if(valor_ataque_descontar_hp <= 0)
                    {
                        valor_ataque_descontar_hp = 0;
                        vida_pokemon_adversario = vida_pokemon_adversario - valor_ataque_descontar_hp;  
                    }
                    else
                    {
                        vida_pokemon_adversario = vida_pokemon_adversario - valor_ataque_descontar_hp;  
                    }
                }
            }
            case "ad": //POKEMON ADVERSARIO ATACA
            {
                if(buff_ataque_AD == true && buff_defesa_MP == true)
                {
                    valor_ataque_descontar_hp = rand.nextInt(dano_def_a_b_pokemon_ad.get(0),dano_def_a_b_pokemon_ad.get(1));
                    valor_ataque_descontar_hp = valor_ataque_descontar_hp + valor_ataque_descontar_hp * (rand.nextInt(5,18) / 100);
                    valor_defesa_descontar_ataque = rand.nextInt(dano_def_a_b_meu_pokemon.get(0),dano_def_a_b_meu_pokemon.get(1));
                    valor_ataque_descontar_hp = (valor_ataque_descontar_hp - valor_defesa_descontar_ataque);
                    if(valor_ataque_descontar_hp <= 0)
                    {
                        valor_ataque_descontar_hp = 0;
                        vida_meu_pokemon = vida_meu_pokemon - valor_ataque_descontar_hp; 
                    }
                    else
                    {
                        vida_meu_pokemon = vida_meu_pokemon - valor_ataque_descontar_hp; 
                    }
                    
                }
                else if(buff_ataque_AD == true && buff_defesa_MP == false)
                {                     
                    valor_ataque_descontar_hp = rand.nextInt(dano_def_a_b_pokemon_ad.get(0),dano_def_a_b_pokemon_ad.get(1));
                    valor_ataque_descontar_hp = valor_ataque_descontar_hp + valor_ataque_descontar_hp * (rand.nextInt(5,18) / 100);
                    if(valor_ataque_descontar_hp <= 0)
                    {
                        valor_ataque_descontar_hp = 0;
                        vida_meu_pokemon = vida_meu_pokemon - valor_ataque_descontar_hp; 
                    }
                    else
                    {
                        vida_meu_pokemon = vida_meu_pokemon - valor_ataque_descontar_hp; 
                    }
                }
                else if (buff_ataque_AD == false && buff_defesa_MP == true)
                {
                    valor_ataque_descontar_hp = rand.nextInt(dano_def_a_b_pokemon_ad.get(0),dano_def_a_b_pokemon_ad.get(1));
                    valor_ataque_descontar_hp = valor_ataque_descontar_hp - valor_ataque_descontar_hp * (rand.nextInt(5,18) / 100);
                    valor_defesa_descontar_ataque = rand.nextInt(dano_def_a_b_meu_pokemon.get(0),dano_def_a_b_meu_pokemon.get(1));
                    valor_ataque_descontar_hp = (valor_ataque_descontar_hp - valor_defesa_descontar_ataque);
                    if(valor_ataque_descontar_hp <= 0)
                    {
                        valor_ataque_descontar_hp = 0;
                        vida_meu_pokemon = vida_meu_pokemon - valor_ataque_descontar_hp; 
                    }
                    else
                    {
                        vida_meu_pokemon = vida_meu_pokemon - valor_ataque_descontar_hp; 
                    }
                }
                else if(buff_ataque_MP == false && buff_defesa_AD == false)
                {
                    valor_ataque_descontar_hp = rand.nextInt(dano_def_a_b_pokemon_ad.get(0),dano_def_a_b_pokemon_ad.get(1));
                    if(valor_ataque_descontar_hp <= 0)
                    {
                        valor_ataque_descontar_hp = 0;
                        vida_meu_pokemon = vida_meu_pokemon - valor_ataque_descontar_hp; 
                    }
                    else
                    {
                        vida_meu_pokemon = vida_meu_pokemon - valor_ataque_descontar_hp; 
                    }
                }
            }
        }
    }
        
    public static void acaojogador()
    {
        String acao_jogador;
        
        System.out.println("\n Seu turno! \n");
        acao_jogador = JOptionPane.showInputDialog(null, "\n1-ATACAR\n2-DEFENDER\n3-VER O HP");        
        switch(acao_jogador)
        {
            case "1":
            {
                calc_do_dano(minha_key);
                System.out.println(meu_pokemon_arena.get(0)+" atacou e deu "+valor_ataque_descontar_hp+" de dano em "+pokemon_adversarios_stats_arena.get(0)+"!");
            }
            case "2":
            {

            }
            case "3":
            {
                System.out.println("O seu "+meu_pokemon_arena.get(0)+" ainda tem: "+vida_meu_pokemon);
            }
        }

    }

    public static void acaoadversario()
    {
        System.out.println("\n Turno do Adversário! \n");
        Random rand = new Random();
        int ia;
        ia = rand.nextInt(1,100);
        if(ia <= 85)
        {
            calc_do_dano(ad_key);
            System.out.println(pokemon_adversarios_stats_arena.get(0)+" atacou e deu "+valor_ataque_descontar_hp+" de dano em seu "+meu_pokemon_arena.get(0)+"!");
        }
        else if(ia >85 && ia <= 100)
        {

        }
    }
}
