package DESAFIO_1_EJP_POKEMON.Pokemon_PACKAGE.Arena_PACKAGE;
import java.util.ArrayList;
public class SistemaCombate 
{
    //BUFFS E NERFS
        //Meu Pokemon
        public static boolean buff_ataque_MP;
        public static boolean buff_defesa_MP;
        public static boolean nerf_ataque_MP;
        public static boolean nerf_defesa_MP;
        //ADversario
        public static boolean buff_ataque_AD;
        public static boolean buff_defesa_AD;
        public static boolean nerf_ataque_AD;
        public static boolean nerf_defesa_AD;

        public static String minha_key = "m";
        public static String ad_key = "ad";
        public static String tipo_meu_pokemon;
        public static int vida_meu_pokemon;
        public static int ataque_meu_pokemon;
        public static int defesa_meu_pokemon;
        public static String tipo_pokemon_adversario;
        public static int vida_pokemon_adversario;
        public static int ataque_pokemon_adversario;
        public static int defesa_pokemon_adversario;

        public static int valor_ataque_descontar_hp;
        public static int valor_defesa_descontar_ataque;
        //PARAMETROS DO RANDOM ATAQUE E DEFESA
        public static ArrayList<Integer> dano_def_a_b_meu_pokemon = new ArrayList<>();
        public static ArrayList<Integer> dano_def_a_b_pokemon_ad = new ArrayList<>();
        
  
    public static void sistema_combate()
    {
            vida_meu_pokemon = Integer.parseInt(Batalha.meu_pokemon_arena.get(3));
            vida_pokemon_adversario = Integer.parseInt(Batalha.pokemon_adversarios_stats_arena.get(3));
            tipo_meu_pokemon = Batalha.meu_pokemon_arena.get(1);
            tipo_pokemon_adversario = Batalha.pokemon_adversarios_stats_arena.get(1);
            vida_meu_pokemon = Integer.parseInt(Batalha.meu_pokemon_arena.get(3));
            vida_pokemon_adversario = Integer.parseInt(Batalha.pokemon_adversarios_stats_arena.get(3));

        if(tipo_meu_pokemon.equals("Fogo") && tipo_pokemon_adversario.equals("Planta"))
        {
            buff_ataque_MP = true;
            buff_defesa_MP = true;
            nerf_defesa_MP = false;
            nerf_ataque_MP = false;

            nerf_ataque_AD = true;
            nerf_defesa_AD = true;
            buff_ataque_AD = false;
            buff_defesa_AD = false;
        }
        else if(tipo_pokemon_adversario.equals("Fogo") && tipo_meu_pokemon.equals("Planta"))
        {
            buff_ataque_MP = false;
            buff_defesa_MP = false;
            nerf_defesa_MP = true;
            nerf_ataque_MP = true;

            nerf_ataque_AD = false;
            nerf_defesa_AD = false;
            buff_ataque_AD = true;
            buff_defesa_AD = true;
        }
        else if(tipo_meu_pokemon.equals("Planta") && tipo_pokemon_adversario.equals("Agua"))
        {
            buff_ataque_MP = true;
            buff_defesa_MP = true;
            nerf_defesa_MP = false;
            nerf_ataque_MP = false;

            nerf_ataque_AD = true;
            nerf_defesa_AD = true;
            buff_ataque_AD = false;
            buff_defesa_AD = false;
        }
        else if(tipo_pokemon_adversario.equals("Planta") && tipo_meu_pokemon.equals("Agua"))
        {
            buff_ataque_MP = false;
            buff_defesa_MP = false;
            nerf_defesa_MP = true;
            nerf_ataque_MP = true;

            nerf_ataque_AD = false;
            nerf_defesa_AD = false;
            buff_ataque_AD = true;
            buff_defesa_AD = true;
        }
        else if(tipo_meu_pokemon.equals("Agua") && tipo_pokemon_adversario.equals("Fogo"))
        {
            buff_ataque_MP = true;
            buff_defesa_MP = true;
            nerf_defesa_MP = false;
            nerf_ataque_MP = false;

            nerf_ataque_AD = true;
            nerf_defesa_AD = true;
            buff_ataque_AD = false;
            buff_defesa_AD = false;
        }
        else if(tipo_pokemon_adversario.equals("Agua") && tipo_meu_pokemon.equals("Fogo"))
        {
            buff_ataque_MP = false;
            buff_defesa_MP = false;
            nerf_defesa_MP = true;
            nerf_ataque_MP = true;

            nerf_ataque_AD = false;
            nerf_defesa_AD = false;
            buff_ataque_AD = true;
            buff_defesa_AD = true;
        }
        else if(tipo_meu_pokemon.equals("Agua") && tipo_pokemon_adversario.equals("Agua"))
        {
            buff_ataque_MP = true;
            buff_defesa_MP = true;
            nerf_defesa_MP = true;
            nerf_ataque_MP = true;

            nerf_ataque_AD = true;
            nerf_defesa_AD = true;
            buff_ataque_AD = true;
            buff_defesa_AD = true;
        }
        else if(tipo_meu_pokemon.equals("Fogo") && tipo_pokemon_adversario.equals("Fogo"))
        {
            buff_ataque_MP = true;
            buff_defesa_MP = true;
            nerf_defesa_MP = true;
            nerf_ataque_MP = true;

            nerf_ataque_AD = true;
            nerf_defesa_AD = true;
            buff_ataque_AD = true;
            buff_defesa_AD = true;
        }
        else
        {
            buff_ataque_MP = false;
            buff_defesa_MP = false;
            nerf_defesa_MP = false;
            nerf_ataque_MP = false;

            nerf_ataque_AD = false;
            nerf_defesa_AD = false;
            buff_ataque_AD = false;
            buff_defesa_AD = false;
        }

    }

    public static void definindo_stats_pokemon(int lvl, String key)
    {
        if(lvl <= 15)
        {
            switch(key)
            {
                case "m":
                {
                    dano_def_a_b_meu_pokemon.add(20);
                    dano_def_a_b_meu_pokemon.add(25);
                }
                case "ad":
                {
                    dano_def_a_b_pokemon_ad.add(20);
                    dano_def_a_b_pokemon_ad.add(25);
                }
            }
        }
        else if(lvl > 15 && lvl <= 31)
        {
            switch(key)
            {
                case "m":
                {
                    dano_def_a_b_meu_pokemon.add(20);
                    dano_def_a_b_meu_pokemon.add(35);
                }
                case "ad":
                {
                    dano_def_a_b_pokemon_ad.add(20);
                    dano_def_a_b_pokemon_ad.add(35);
                }
            }
        }
        else if(lvl > 31 && lvl <= 47)
        {
            switch(key)
            {
                case "m":
                {
                    dano_def_a_b_meu_pokemon.add(20);
                    dano_def_a_b_meu_pokemon.add(45);
                }
                case "ad":
                {
                    dano_def_a_b_pokemon_ad.add(20);
                    dano_def_a_b_pokemon_ad.add(45);
                }
            }
        }
        else if(lvl > 47 && lvl <= 63)
        {
            switch(key)
            {
                case "m":
                {
                    dano_def_a_b_meu_pokemon.add(45);
                    dano_def_a_b_meu_pokemon.add(60);
                }
                case "ad":
                {
                    dano_def_a_b_pokemon_ad.add(45);
                    dano_def_a_b_pokemon_ad.add(60);
                }
            }
        }
        else if(lvl > 63 && lvl <= 78)
        {
            switch(key)
            {
                case "m":
                {
                    dano_def_a_b_meu_pokemon.add(60);
                    dano_def_a_b_meu_pokemon.add(75);
                }
                case "ad":
                {
                    dano_def_a_b_pokemon_ad.add(60);
                    dano_def_a_b_pokemon_ad.add(75);
                }
            }
        }
        else if(lvl > 78 && lvl <= 93)
        {
            switch(key)
            {
                case "m":
                {
                    dano_def_a_b_meu_pokemon.add(75);
                    dano_def_a_b_meu_pokemon.add(90);
                }
                case "ad":
                {
                    dano_def_a_b_pokemon_ad.add(75);
                    dano_def_a_b_pokemon_ad.add(90);
                }
            }
        }
        else if(lvl > 93 && lvl <= 100)
        {
            switch(key)
            {
                case "m":
                {
                    dano_def_a_b_meu_pokemon.add(90);
                    dano_def_a_b_meu_pokemon.add(100);
                }
                case "ad":
                {
                    dano_def_a_b_pokemon_ad.add(90);
                    dano_def_a_b_pokemon_ad.add(100);
                }
            }
        }
    }

}
