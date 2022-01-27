package listadeexercicios.agenda;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;
/**
 * @author: EDCLYDSON SOUSA
 * 
 * Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as seguintes operações:
    void armazenaPessoa(String nome, int idade, float altura);
    void removePessoa(String nome);
    int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa
    void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
    void imprimePessoa(int index); // imprime os dados da pessoa que está na posição “i” da agenda.
 */

public class ATV19EJP { /// LEIA COMO CLASSE AGENDA
    private Map<Integer,String> agenda = new HashMap<>();
    private ArrayList<String> dadosPessoa = new ArrayList<>();
    
    public void armazenaPessoa(String nome, int idade, float altura)
    {
        int index = agenda.size()+1;
        dadosPessoa.add(nome);
        dadosPessoa.add((String.valueOf(idade)));
        dadosPessoa.add((String.valueOf(new DecimalFormat("#.00").format(altura).replace(",","."))));        
        agenda.put(index++,dadosPessoa.toString());
        dadosPessoa.clear();
    }

    public void removePessoa(String nome)
    {
        System.out.println("Agenda Antes de excluir\n"+agenda.toString());
        for(int indice = 1; indice<=agenda.size();indice++)
        {
            ArrayList<String> busca = new ArrayList<>();
            busca.add(String.valueOf(agenda.get(indice))); 
            if(busca.get(0).contains(nome) == true)
            {
                agenda.remove(indice);
                JOptionPane.showMessageDialog(null,"Contato foi apagado!");
                System.out.println(String.valueOf(agenda.size()));
                break;
            }
            else
            {
                if(indice==agenda.size())
                {
                    System.out.println(nome+" não consta na agenda");
                    busca.clear();
                }
                else
                {
                    System.out.println("Procurando...");
                    continue;
                }
            }
        }
        System.out.println("Agenda Depois de excluir\n"+agenda.toString());
    }
  
    public void buscaPessoa(String nome)
    {
        for(int indice = 1; indice<=agenda.size();indice++)
        {
            ArrayList<String> busca = new ArrayList<>();
            busca.add(String.valueOf(agenda.get(indice))); 
            if(busca.get(0).contains(nome) == true)
            {
                System.out.println(nome+" está na posição "+indice+" da agenda");
                break;
            }
            else
            {
                if(indice==agenda.size())
                {
                    System.out.println(nome+" não consta na agenda");
                    busca.clear();
                }
                else
                {
                    System.out.println("Procurando...");
                    continue;
                }
            }
        }
    }

    public void imprimeAgenda()
    {
        for(int listaagenda = 1; listaagenda <= agenda.size(); listaagenda++)
        {
            String[] contato = agenda.get(listaagenda).split(",");
            System.out.println("Nome:" +contato[0].replace("[", " "));
            System.out.println("Idade:" +contato[1]);
            System.out.println("Altura:" +contato[2].replace("]", " ")+"\n");
        }
    }

    public void imprimePessoa(int index)
    {
        if(agenda.containsKey(index) == true)
        {
            String[] contato = agenda.get(index).split(",");
            System.out.println("Nome:" +contato[0].replace("[", " "));
            System.out.println("Idade:" +contato[1]);
            System.out.println("Altura:" +contato[2].replace("]", " "));
            //System.out.println(String.valueOf(agenda.get(index)));
        }
            
        
    }
}

