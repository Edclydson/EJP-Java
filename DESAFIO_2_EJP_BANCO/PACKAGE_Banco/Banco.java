package DESAFIO_2_EJP_BANCO.PACKAGE_Banco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.swing.JOptionPane;

public class Banco 
{   
    ///ADD NOME DOS BANCOS
    ///CHECAR SE O NUMERO DA CONTA JA ESTA SENDO UTILIZADO
    public static String NomeBanco;
    public static int id_conta;
    public static ArrayList<String> Cliente = new ArrayList<>();
    public static Map<Integer,ArrayList> ClientesCadastrados = new HashMap<>();
    public static Random rand = new Random();
    public static void ConsultaCliente(int id)
    {
        System.out.println("Checando dados...");
        try { Thread.sleep (2000); } catch (InterruptedException ex) {}
        if(ClientesCadastrados.containsKey(id) == true)
        {
            System.out.println("Acessando a conta...");
            try { Thread.sleep (2000); } catch (InterruptedException ex) {}
        }
        else
        {
            System.out.println("Usuário não cadastrado!");
        }
    }

    public static void CadastraCliente()
    {
        
        Cliente.add(JOptionPane.showInputDialog(null,"Digite seu nome: "));
        Cliente.add(JOptionPane.showInputDialog(null,"Digite seu cpf: "));
        while(true)
        {
            int id_user = rand.nextInt(1000,100000);
            if(ClientesCadastrados.containsKey(id_user))
            {
                JOptionPane.showMessageDialog(null,"Anote o numero da sua conta, ela será essencial para acessar-la: "+id_user);
                Usuario.id_usuario = id_user;
                Cliente.add(String.valueOf(Usuario.id_usuario));    
                CriaConta();
                break;
            }
            else
            {
                continue;
            }
        }

        JOptionPane.showMessageDialog(null, "Usuário Cadastrado!");
    }
    public static void CriaConta()
    {
        id_conta = rand.nextInt(100000);
        Conta.setId_Conta(id_conta);
        Conta.setSaldo_Conta(0);
    }
}
