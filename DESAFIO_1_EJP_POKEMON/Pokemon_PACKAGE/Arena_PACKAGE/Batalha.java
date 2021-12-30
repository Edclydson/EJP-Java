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

/**
 * 
 * C  O  I  S  A  S    P  A  R  A    F  A  Z  E  R   
 
 ### ARRUMAR VALORES DOS DANO PROVOCADOS

 
 
 */    

   

   
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
        String escolha_pokemon;
        switch(MeusPokemons.meus_pokemons.size())
        {
            case 1: //SE HOUVER SO UM POKEMON
            {
                meu_pokemon_arena.addAll(MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokemon1));
                JOptionPane.showMessageDialog(null,meu_pokemon_arena.get(0)+", eu escolho você!");
                break;
            }
            case 2: //SE HOUVER 2 POKEMONS
            {
                System.out.println("---------POKEMON-1------------------------");
                System.out.println("Nome: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokemon1).get(0)+"\nTipo: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokemon1).get(1)+"\nLevel: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokemon1).get(2)+"\nVida: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokemon1).get(3));
                System.out.println("---------POKEMON-2------------------------");
                System.out.println("Nome: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokemon2).get(0)+"\nTipo: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokemon2).get(1)+"\nLevel: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokemon2).get(2)+"\nVida: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokemon2).get(3)+ "\n1-Voltar");
                System.out.println("Digite o numero do pokemon que deseja escolher:");
                escolha_pokemon = scan.nextLine();
                switch(escolha_pokemon)
                {
                    case "1":
                    {
                        meu_pokemon_arena.addAll(MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokemon1));
                        JOptionPane.showMessageDialog(null,meu_pokemon_arena.get(0)+", eu escolho você!");
                        break;
                    }
                    case "2":
                    {
                        meu_pokemon_arena.addAll(MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokemon2));
                        JOptionPane.showMessageDialog(null,meu_pokemon_arena.get(0)+", eu escolho você!");
                        break;
                    }
                    default:{break;}
                }
                break;
            }
            case 3://SE HOUVER OS 3 POKEMONS
            {
                System.out.println("---------POKEMON-1------------------------");
                System.out.println("Nome: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokemon1).get(0)+"\nTipo: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokemon1).get(1)+"\nLevel: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokemon1).get(2)+"\nVida: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokemon1).get(3));
                System.out.println("---------POKEMON-2------------------------");
                System.out.println("Nome: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokemon2).get(0)+"\nTipo: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokemon2).get(1)+"\nLevel: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokemon2).get(2)+"\nVida: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokemon2).get(3));
                System.out.println("---------POKEMON-3------------------------");
                System.out.println("Nome: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokemon3).get(0)+"\nTipo: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokemon3).get(1)+"\nLevel: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokemon3).get(2)+"\nVida: "+MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokemon3).get(3)+ "\n1-Voltar");
                System.out.println("Digite o numero do pokemon que deseja escolher:");
                escolha_pokemon = scan.nextLine();
                switch(escolha_pokemon)
                {
                    case "1":
                    {
                        meu_pokemon_arena.addAll(MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokemon1));
                        JOptionPane.showMessageDialog(null,meu_pokemon_arena.get(0)+", eu escolho você!");
                        break;
                    }
                    case "2":
                    {
                        meu_pokemon_arena.addAll(MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokemon2));
                        JOptionPane.showMessageDialog(null,meu_pokemon_arena.get(0)+", eu escolho você!");
                        break;
                    }
                    case "3":
                    {
                        meu_pokemon_arena.addAll(MeusPokemons.meus_pokemons.get(MeusPokemons.key_pokemon3));
                        JOptionPane.showMessageDialog(null,meu_pokemon_arena.get(0)+", eu escolho você!");
                        break;
                    }
                    default:{break;}
                }
                break;
            }
            default:{break;}
        }
    }

    //CRIAR AREA DE BATALHA
    public static void Arena()
    {
        JOptionPane.showMessageDialog(null,"Você entrou na Arena!\n");
        EscolhaSeuPokemon();
        cria_novo_adversario();
        pokemon_adversarios_stats_arena.addAll(AdversariosPokemons.pokemons_adversario_stats);
    }
    public static void luta() 
    {
        System.out.println("É hora da batalha!!!");
        JOptionPane.showMessageDialog(null,"Seu adversario será:\nPokemon: "+pokemon_adversarios_stats_arena.get(0)+"\nTipo: "+pokemon_adversarios_stats_arena.get(1)+"\nLevel: "+pokemon_adversarios_stats_arena.get(2)+"\nVida: "+pokemon_adversarios_stats_arena.get(3));

        
        //CHAMA SISTEMA DE COMBATE
        sistema_combate();
        //CHAMA STATS
        definindo_stats_pokemon(Integer.parseInt(meu_pokemon_arena.get(2)), minha_key);
        definindo_stats_pokemon(Integer.parseInt(pokemon_adversarios_stats_arena.get(2)), ad_key);
        JOptionPane.showMessageDialog(null,"A Batalha vai começar!");
        while(vida_meu_pokemon != 0 || vida_pokemon_adversario != 0)
        {
            acaojogador();
            System.out.println("\n");
            try { Thread.sleep (3000); } catch (InterruptedException ex) {}

            acaoadversario();
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
                    if(vida_pokemon_adversario == 0 || vida_pokemon_adversario < 0 )
                    {
                        JOptionPane.showMessageDialog(null,meu_pokemon_arena.get(0)+" venceu a batalha!!!");
                        System.out.println("Parabens!!!");
                    }
                    else if(vida_meu_pokemon == 0 || vida_meu_pokemon < 0)
                    {
                        JOptionPane.showMessageDialog(null,pokemon_adversarios_stats_arena.get(0)+" venceu a batalha!!!");
                        System.out.println("Deu ruim! :( ");
                    }
                    else
                    {
                        valor_ataque_descontar_hp = rand.nextInt(dano_def_a_b_meu_pokemon.get(0),dano_def_a_b_meu_pokemon.get(1));
                        valor_ataque_descontar_hp = valor_ataque_descontar_hp + valor_ataque_descontar_hp * (rand.nextInt(5,18) / 100);
                        valor_defesa_descontar_ataque = rand.nextInt(dano_def_a_b_pokemon_ad.get(0),dano_def_a_b_pokemon_ad.get(1));
                        vida_pokemon_adversario = vida_pokemon_adversario - (valor_ataque_descontar_hp - valor_defesa_descontar_ataque);
                        System.out.println(meu_pokemon_arena.get(0)+" atacou e deu "+(valor_ataque_descontar_hp - valor_defesa_descontar_ataque)+" de dano em "+pokemon_adversarios_stats_arena.get(0)+"!");
                    }
                    
                }
                else if(buff_ataque_MP == true && buff_defesa_AD == false)
                {
                        if(vida_pokemon_adversario == 0 || vida_pokemon_adversario < 0)
                        {
                            JOptionPane.showMessageDialog(null,meu_pokemon_arena.get(0)+" venceu a batalha!!!");
                            System.out.println("Parabens!!!");
                        }
                        else if(vida_meu_pokemon == 0 || vida_meu_pokemon < 0)
                        {
                            JOptionPane.showMessageDialog(null,pokemon_adversarios_stats_arena.get(0)+" venceu a batalha!!!");
                            System.out.println("Deu ruim! :( ");
                        }
                        else
                        {
                            System.out.println(meu_pokemon_arena.get(0)+" teve seu ataque buffado!");
                            valor_ataque_descontar_hp = rand.nextInt(dano_def_a_b_meu_pokemon.get(0),dano_def_a_b_meu_pokemon.get(1));
                            valor_ataque_descontar_hp = valor_ataque_descontar_hp + Math.round(valor_ataque_descontar_hp * (rand.nextInt(5,18) / 100));
                            System.out.println(meu_pokemon_arena.get(0)+" atacou e deu "+valor_ataque_descontar_hp+" de dano em "+pokemon_adversarios_stats_arena.get(0)+"!");
                            vida_pokemon_adversario = vida_pokemon_adversario - valor_ataque_descontar_hp;
                        }
                }
                else if (buff_ataque_MP == false && buff_defesa_AD == true)
                {
                        if(vida_pokemon_adversario == 0 || vida_pokemon_adversario < 0)
                        {
                            JOptionPane.showMessageDialog(null,meu_pokemon_arena.get(0)+" venceu a batalha!!!");
                            System.out.println("Parabens!!!");
                        }
                        else if(vida_meu_pokemon == 0 || vida_meu_pokemon < 0)
                        {
                            JOptionPane.showMessageDialog(null,pokemon_adversarios_stats_arena.get(0)+" venceu a batalha!!!");
                            System.out.println("Deu ruim! :( ");
                        }
                        else
                        { 
                            valor_ataque_descontar_hp = rand.nextInt(dano_def_a_b_meu_pokemon.get(0),dano_def_a_b_meu_pokemon.get(1));
                            valor_ataque_descontar_hp = valor_ataque_descontar_hp - valor_ataque_descontar_hp * (rand.nextInt(5,18) / 100);
                            valor_defesa_descontar_ataque = rand.nextInt(dano_def_a_b_pokemon_ad.get(0),dano_def_a_b_pokemon_ad.get(1));
                            System.out.println(meu_pokemon_arena.get(0)+" atacou e deu "+(valor_ataque_descontar_hp - valor_defesa_descontar_ataque)+" de dano em "+pokemon_adversarios_stats_arena.get(0)+"!");
                            vida_pokemon_adversario = vida_pokemon_adversario - (valor_ataque_descontar_hp - valor_defesa_descontar_ataque);
                        }
                    }
                else if(buff_ataque_MP == false && buff_defesa_AD == false)
                {
                        if(vida_pokemon_adversario == 0 || vida_pokemon_adversario < 0)
                        {
                            JOptionPane.showMessageDialog(null,meu_pokemon_arena.get(0)+" venceu a batalha!!!");
                            System.out.println("Parabens!!!");
                        }
                        else if(vida_meu_pokemon == 0 || vida_meu_pokemon < 0)
                        {
                            JOptionPane.showMessageDialog(null,pokemon_adversarios_stats_arena.get(0)+" venceu a batalha!!!");
                            System.out.println("Deu ruim! :( ");
                        }
                        else
                        {
                            valor_ataque_descontar_hp = rand.nextInt(dano_def_a_b_meu_pokemon.get(0),dano_def_a_b_meu_pokemon.get(1));
                            vida_pokemon_adversario = vida_pokemon_adversario - valor_ataque_descontar_hp;
                        }
                    }
            }
            case "ad": //POKEMON ADVERSARIO ATACA
            {
                if(buff_ataque_AD == true && buff_defesa_MP == true)
                {
                    if(vida_pokemon_adversario == 0 || vida_pokemon_adversario < 0)
                    {
                        JOptionPane.showMessageDialog(null,meu_pokemon_arena.get(0)+" venceu a batalha!!!");
                        System.out.println("Parabens!!!");
                    }
                    else if(vida_meu_pokemon == 0 || vida_meu_pokemon < 0)
                    {
                        JOptionPane.showMessageDialog(null,pokemon_adversarios_stats_arena.get(0)+" venceu a batalha!!!");
                        System.out.println("Deu ruim! :( ");
                    }
                    else
                    {
                        valor_ataque_descontar_hp = rand.nextInt(dano_def_a_b_pokemon_ad.get(0),dano_def_a_b_pokemon_ad.get(1));
                        valor_ataque_descontar_hp = valor_ataque_descontar_hp + valor_ataque_descontar_hp * (rand.nextInt(5,18) / 100);
                        valor_defesa_descontar_ataque = rand.nextInt(dano_def_a_b_meu_pokemon.get(0),dano_def_a_b_meu_pokemon.get(1));
                        System.out.println(pokemon_adversarios_stats_arena.get(0)+" atacou e deu "+(valor_ataque_descontar_hp - valor_defesa_descontar_ataque)+" de dano em "+meu_pokemon_arena.get(0)+"!");
                        vida_meu_pokemon = vida_meu_pokemon - (valor_ataque_descontar_hp - valor_defesa_descontar_ataque);
                    }
                }
                else if(buff_ataque_AD == true && buff_defesa_MP == false)
                {                     
                    if(vida_pokemon_adversario == 0 || vida_pokemon_adversario < 0)
                    {
                        JOptionPane.showMessageDialog(null,meu_pokemon_arena.get(0)+" venceu a batalha!!!");
                        System.out.println("Parabens!!!");
                    }
                    else if(vida_meu_pokemon == 0 || vida_meu_pokemon < 0)
                    {
                        JOptionPane.showMessageDialog(null,pokemon_adversarios_stats_arena.get(0)+" venceu a batalha!!!");
                        System.out.println("Deu ruim! :( ");
                    }
                    else
                    {
                        valor_ataque_descontar_hp = rand.nextInt(dano_def_a_b_pokemon_ad.get(0),dano_def_a_b_pokemon_ad.get(1));
                        valor_ataque_descontar_hp = valor_ataque_descontar_hp + valor_ataque_descontar_hp * (rand.nextInt(5,18) / 100);
                        System.out.println(pokemon_adversarios_stats_arena.get(0)+" atacou e deu "+valor_ataque_descontar_hp+" de dano em "+meu_pokemon_arena.get(0)+"!");
                        vida_meu_pokemon = vida_meu_pokemon - valor_ataque_descontar_hp;
                    }
                    }
                else if (buff_ataque_AD == false && buff_defesa_MP == true)
                {
                        if(vida_pokemon_adversario == 0 || vida_pokemon_adversario < 0)
                        {
                            JOptionPane.showMessageDialog(null,meu_pokemon_arena.get(0)+" venceu a batalha!!!");
                            System.out.println("Parabens!!!");
                        }
                        else if(vida_meu_pokemon == 0 || vida_meu_pokemon < 0)
                        {
                            JOptionPane.showMessageDialog(null,pokemon_adversarios_stats_arena.get(0)+" venceu a batalha!!!");
                            System.out.println("Deu ruim! :( ");
                        }
                        else
                        {
                            valor_ataque_descontar_hp = rand.nextInt(dano_def_a_b_pokemon_ad.get(0),dano_def_a_b_pokemon_ad.get(1));
                            valor_ataque_descontar_hp = valor_ataque_descontar_hp - valor_ataque_descontar_hp * (rand.nextInt(5,18) / 100);
                            valor_defesa_descontar_ataque = rand.nextInt(dano_def_a_b_meu_pokemon.get(0),dano_def_a_b_meu_pokemon.get(1));
                            System.out.println(pokemon_adversarios_stats_arena.get(0)+" atacou e deu "+(valor_ataque_descontar_hp - valor_defesa_descontar_ataque)+" de dano em "+meu_pokemon_arena.get(0)+"!");
                            vida_meu_pokemon = vida_meu_pokemon - (valor_ataque_descontar_hp - valor_defesa_descontar_ataque);
                        }
                }
                else if(buff_ataque_MP == false && buff_defesa_AD == false)
                {
                        if(vida_pokemon_adversario == 0 || vida_pokemon_adversario < 0)
                        {
                            JOptionPane.showMessageDialog(null,meu_pokemon_arena.get(0)+" venceu a batalha!!!");
                            System.out.println("Parabens!!!");
                        }
                        else if(vida_meu_pokemon == 0 || vida_meu_pokemon < 0)
                        {
                            JOptionPane.showMessageDialog(null,pokemon_adversarios_stats_arena.get(0)+" venceu a batalha!!!");
                            System.out.println("Deu ruim! :( ");
                        }
                        else
                        {
                            valor_ataque_descontar_hp = rand.nextInt(dano_def_a_b_pokemon_ad.get(0),dano_def_a_b_pokemon_ad.get(1));
                            vida_meu_pokemon = vida_meu_pokemon - valor_ataque_descontar_hp;
                        }
                }
            }
            
        }
        
    }
    
    
    public static boolean morreu(int vida,String key)
    {
        
        
        if(key.equals("m"))
        {   
            if(vida_meu_pokemon == 0)
            {
                JOptionPane.showMessageDialog(null,pokemon_adversarios_stats_arena.get(0)+" venceu a batalha!!!");
                System.out.println("Deu ruim! :( ");
                t = true;
            }
            else
            {
                t = false;
            }
        }    
          
        else if(key.equals("ad"))
        {
            if(vida_pokemon_adversario == 0)
            {
                JOptionPane.showMessageDialog(null,meu_pokemon_arena.get(0)+" venceu a batalha!!!");
                System.out.println("Parabens!!!");
                t = true;
            }
            else
            {
                t = false;
            }
        }
        return t;
    }

    public static void acaojogador()
    {
        String acao_jogador;
        JOptionPane.showMessageDialog(null,"Qual a sua proxima ação?");
        System.out.println("\n1-ATACAR\n2-DEFENDER\n3-VER O HP");
        acao_jogador = scan.nextLine();
        switch(acao_jogador)
        {
            case "1":
            {
                calc_do_dano(minha_key);
            }
            case "2":
            {

            }
            case "3":
            {
                System.out.println(meu_pokemon_arena.get(0)+" ainda tem: "+vida_meu_pokemon);
            }
        }

    }

    public static void acaoadversario()
    {
        Random rand = new Random();
        int ia;
        ia = rand.nextInt(1,100);
        if(ia <= 85)
        {
            calc_do_dano(ad_key);
        }
        else if(ia >85 && ia <= 100)
        {

        }
    }
}
