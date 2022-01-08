package DESAFIO_1_EJP_POKEMON.Pokemon_PACKAGE.MundoPokemon_PACKAGE;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import DESAFIO_1_EJP_POKEMON.Pokemon_PACKAGE.Treinador;

public class GeraPokebola 
{   
    static ArrayList<String> pokebola1 = new ArrayList<>();
    static ArrayList<String> pokebola2 = new ArrayList<>();
    static ArrayList<String> pokebola3 = new ArrayList<>();
    
    public static void newpokebola()
    {
        JOptionPane.showMessageDialog(null,"Você achou uma pokebola!");
        //criar condição para definir quantas pokebolas os treinadores terao com base no lvl
        switch(Treinador.meuspokemons.size())
        {
            case 1:
            {

            }
            case 2:
            {

            }
            case 3:
            {
                
            }
            default:{}
        }
    }
}
