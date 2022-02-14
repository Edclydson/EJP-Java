package PACKAGE_Banco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.swing.JOptionPane;

public class Banco 
{   
    ///CHECAR SE O NUMERO DA CONTA JA ESTA SENDO UTILIZADO
    public static String id_conta;
    public static ArrayList<String> Cliente = new ArrayList<>();
    public static Map<String,ArrayList> ClientesCadastrados = new HashMap<>();
    public static Random rand = new Random();
    public static void ConsultaCliente(String id)
    {
        System.out.println("Checando dados...");
        try { Thread.sleep (2000); } catch (InterruptedException ex) {}
        if(ClientesCadastrados.containsKey(id) == true)
        {
            CaixaEletronico.user_cad = true;
            System.out.println("Acessando a conta...");
            try { Thread.sleep (2000); } catch (InterruptedException ex) {}
        }
        else
        {
            CaixaEletronico.user_cad = false;
            System.out.println("Usuário não cadastrado!");
        }
    }

    public static void CadastraCliente()
    {
        String nome_new_usuario = JOptionPane.showInputDialog(null,"Digite seu nome: ");
        String cpf_new_cpf = JOptionPane.showInputDialog(null,"Digite seu cpf: ");
        String id_new_usuario;
        String id_new_conta;
        while(true)
        {
            int id_user = rand.nextInt(1000,100000);
            if(ClientesCadastrados.containsKey(id_user))
            {
                continue;
            }
            else
            {
                id_new_usuario = String.valueOf(id_user);
                JOptionPane.showMessageDialog(null,"Anote o numero da sua conta, ela será essencial para acessar-la: "+id_user);
                Usuario.setId_usuario(id_user) ;
                id_new_conta = CriaConta();
                break;
            }
        }
        Cliente.add(id_new_usuario);
        Cliente.add(id_new_conta);
        Cliente.add(cpf_new_cpf);
        Cliente.add(nome_new_usuario);
        ClientesCadastrados.put(id_new_usuario,Cliente);
        JOptionPane.showMessageDialog(null, "Usuário Cadastrado!");
    }
    public static String CriaConta()
    {
        int account = rand.nextInt(100000);
        id_conta = String.valueOf(account);
        Conta.setId_Conta(id_conta);
        Conta.setSaldo_Conta(0);
        return id_conta;
    }
}
