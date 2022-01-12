package DESAFIO_2_EJP_BANCO.PACKAGE_Banco;

import javax.swing.JOptionPane;

public class Conta 
{
    static int id_Conta;
    static float Saldo_Conta;    
    
    public int getId_Conta() {
        return id_Conta;
    }
    public static void setId_Conta(int id_conta) {
        id_Conta = id_conta;
    }
    public float getSaldo_Conta() {
        return Saldo_Conta;
    }
    public static void setSaldo_Conta(float saldo_conta) {
        Saldo_Conta = saldo_conta;
    }

    public static void Sacar()
    {
        float valorsaque;
        valorsaque = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor que quer sacar! Ex: R$ 100.0"));
        if(valorsaque>Saldo_Conta)
        {
            JOptionPane.showMessageDialog(null,"Saldo Insuficiente!");
        }
        else
        {
            Saldo_Conta = Saldo_Conta - valorsaque;
            System.out.println("Transação autorizada!");
        }
    }
    public static void Depositar()
    {
        float valordeposito;
        valordeposito = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor que quer depositar! Ex: R$ 100.0"));
        if(valordeposito<=0)
        {
            JOptionPane.showMessageDialog(null,"Não é possivel depositar o valor informado!");
        }
        else
        {
            Saldo_Conta = Saldo_Conta + valordeposito;
            System.out.println("Transação realizada!");
        }
    }
    ///TERMINAR METODO TRANSFERIR
    /// ADD NUMERO CONTA P TRANSFERIR
    /// ADD CHECAR SE A CONTA EXISTE
    
    public static void Transferir()
    {
        float valortransferencia;

        valortransferencia = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor que quer transferir! Ex: R$ 100.0"));
        if(valorsaque>Saldo_Conta)
        {
            JOptionPane.showMessageDialog(null,"Saldo Insuficiente!");
        }
        else
        {
            Saldo_Conta = Saldo_Conta - valorsaque;
            System.out.println("Transação autorizada!");
        }
    }
}

