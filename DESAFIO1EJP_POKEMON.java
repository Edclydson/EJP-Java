import java.util.Random;
import java.util.Scanner;
public class DESAFIO1EJP_POKEMON 
{
        // DECLARANDO AS VARIAVEIS
    public static String pokemonEscolhido;
    public static String[] lista_pokemons = {"Caterpie", "Weedle","Pidgey", "Rattata", "Ekans", "Sandshrew"," Nidoran","Bulbasaur" ,"Charmander", "Squirtle", "Metapod"," Kakuna", "Pidgeotto", "Raticate"};
    public static int lvldesafiante;
    public static int lvlescolhido;
    public static String pokemonDesafiante;
    public static void main(String[] args) 
    {
         // CRIANDO OBJETOS SCANNER E RANDOM
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
         // GERANDO UM NUM ALEATORIO PARA PEGAR UMA POSIÇAO DO ARRAY
        int pos = rand.nextInt(lista_pokemons.length);
         // DEFININDO O POKEMON DESAFIANTE
        pokemonDesafiante = lista_pokemons[pos];
         // GERANDO LVL ALEATORIOS
        lvldesafiante = rand.nextInt(100);
        lvlescolhido = rand.nextInt(100);
        System.out.println(pokemonDesafiante+" (Level "+lvldesafiante+ ") desafiou você!");
         // PERGUNTANDO O POKEMON ESCOLHIDO
        pokemonEscolhido = scan.nextLine();
        System.out.println(pokemonEscolhido+" (Level "+lvlescolhido+"), eu escolho você!");
         // CHECANDO QUEM TEM O MAIOR LVL
        if(lvldesafiante > lvlescolhido)
        {
            System.out.println("O "+pokemonDesafiante+" ganhou a batalha!");
        }
        else
        {
            System.out.println("O seu "+pokemonEscolhido+" venceu a batalha!");
        }
        scan.close();
    }
}
