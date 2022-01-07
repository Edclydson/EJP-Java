package DESAFIO_1_EJP_POKEMON.Pokemon_PACKAGE.MundoPokemon_PACKAGE;

import java.util.Random;

import javax.swing.JOptionPane;

public class MundoAberto 
{
    public static void explorar()
    {
        JOptionPane.showMessageDialog(null,"Bem vindo ao Mundo Aberto de Pokemon!\nNo Mundo Aberto você encontra novos \nPokemons e consegue encontrar \nmais Pokebolas");
        
        Random rand = new Random();
        int z;
        while(true)
        {
            z = rand.nextInt(1,50);
            if(z<= 25)
            {
                System.out.println("Andando...");
            }
            else if(z>=26 && z <= 40)
            {
                JOptionPane.showMessageDialog(null,"Você foi atacado por um pokemon selvagem!");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Você encontrou uma pokebola!");
            }
        }
    }
    
}
