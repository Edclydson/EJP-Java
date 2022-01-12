package DESAFIO_2_EJP_BANCO;

import javax.swing.JOptionPane;

import DESAFIO_2_EJP_BANCO.PACKAGE_Banco.Banco;
import DESAFIO_2_EJP_BANCO.PACKAGE_Banco.Conta;

public class CaixaEletronico
{
    public static boolean user_cad = false;
    public static void main(String[] args) 
    {
    ///CRIAR MENU DO CAIXA ELETRONICO COM FUNÇOES     
        System.out.println("Bem vindo ao Caixa Eletronico Mikoshi!");
        while(true)
        {
            String check = JOptionPane.showInputDialog(null, "Caixa Eletronico Mikoshi\nDigite o numero da sua conta: ");
            Banco.ConsultaCliente(check);
            if(user_cad == true)
            {
                String menu = JOptionPane.showInputDialog(null, "Caixa Eletronico Mikoshi\nEscolha a operação desejada:\n1-SACAR\n2-DEPOSITAR\n3-TRANSFERIR");
                switch(menu)
                {
                    case "1":
                    {
                        Conta.Sacar();
                        String op = JOptionPane.showInputDialog(null, "Caixa Eletronico Mikoshi\nDeseja realizar mais alguma operação:\n1-SIM\n2-NAO");
                        if(op.equals("1"))
                        {
                            continue;
                        }
                        else{break;}
                    }
                    case "2":
                    {
                        Conta.Depositar();
                        String op = JOptionPane.showInputDialog(null, "Caixa Eletronico Mikoshi\nDeseja realizar mais alguma operação:\n1-SIM\n2-NAO");
                        if(op.equals("1"))
                        {
                            continue;
                        }
                        else{break;}
                    }
                    case "3":
                    {
                        Conta.Transferir();
                        String op = JOptionPane.showInputDialog(null, "Caixa Eletronico Mikoshi\nDeseja realizar mais alguma operação:\n1-SIM\n2-NAO");
                        if(op.equals("1"))
                        {
                            continue;
                        }
                        else{break;}
                    }
                    default:
                    {}
                }

            }
            else
            {
                String op = JOptionPane.showInputDialog(null, "Caixa Eletronico Mikoshi\nDeseja realizar o cadastro da conta agora?\n1-SIM\n2-NAO");
                        if(op.equals("1"))
                        {
                            Banco.CadastraCliente();
                            continue;
                        }
                        else{break;}
            }
        }
    }
}